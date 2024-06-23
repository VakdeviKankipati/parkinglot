package org.example.services;

import org.example.dtos.IssueTicketResponseDto;
import org.example.exception.GateNotFoundException;
import org.example.factory.SpotAssignmentStrategyFactory;
import org.example.models.*;
import org.example.repository.GateRepository;
import org.example.repository.ParkingLotRepository;
import org.example.repository.TicketRepository;
import org.example.repository.VehicleRepository;
import org.example.strategies.SpotAssigmentStrategy;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;
    private VehicleRepository vehicleRepository;

    public TicketService(GateRepository gateRepository,
                         ParkingLotRepository parkingLotRepository,
                         TicketRepository ticketRepository,
                         VehicleRepository vehicleRepository){
        this.gateRepository=gateRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
        this.vehicleRepository = vehicleRepository;
    }

    public Ticket issueTicket(Long gateId,
                              String vehicleNumber,
                              String vehicleOwnerName,
                              VehicleType vehicleType) throws GateNotFoundException {

        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        Optional<Gate> optionalGate = gateRepository.findGateById(gateId);

        if(optionalGate.isEmpty()){
            throw new GateNotFoundException("Invalid gateId"+gateId);
        }
        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());


        //get the vehicle object with the vehicle number,if not pren
        Optional<Vehicle> optionalVehicle = vehicleRepository.findVehicleByVehicleNumber(vehicleNumber);

        Vehicle saveVehicle = null;

        if(optionalVehicle.isEmpty()){
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleType(vehicleType);
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setOwnerName(vehicleOwnerName);
            saveVehicle = vehicleRepository.save(vehicle);
        }else{
            saveVehicle = optionalVehicle.get();

        }
        ticket.setVehicle(saveVehicle);

        ParkingLot parkingLot = parkingLotRepository.getParkingLotByGateId(gateId);
        SpotAssigmentStrategyType spotAssigmentStrategyType = parkingLot.getSpotAssignmentStrategyType();

        SpotAssigmentStrategy spotAssigmentStrategy =
                SpotAssignmentStrategyFactory.getSpotAssignmentStrategyForType(spotAssigmentStrategyType);

        ParkingSport parkingSport =  spotAssigmentStrategy.assignSpot(vehicleType,gate);
        ticket.setParkingSpot(parkingSport);

        ticket.setNumber("TICKET_" + gateId + "_" + ticket.getEntryTime());


        return ticketRepository.save(ticket);

    }
}
