package org.example;

import org.example.controllers.TicketController;
import org.example.dtos.IssueTicketRequestDto;
import org.example.dtos.IssueTicketResponseDto;
import org.example.models.Ticket;
import org.example.models.VehicleType;
import org.example.repository.GateRepository;
import org.example.repository.ParkingLotRepository;
import org.example.repository.TicketRepository;
import org.example.repository.VehicleRepository;
import org.example.services.TicketService;

public class Main {
    public static void main(String[] args) {

        //create ticket

        IssueTicketRequestDto requestDto = new
                IssueTicketRequestDto();
        requestDto.setGateId(123L);
        requestDto.setVehicleNo("AP12X6789");
        requestDto.setVehicleType(VehicleType.SEDAN);
        requestDto.setVehicleOwnerName("Mahesh");

        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();

        TicketService ticketService = new TicketService(
                gateRepository,
                parkingLotRepository,
                ticketRepository,
                vehicleRepository

        );

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketResponseDto responseDto = ticketController.issueTicket(requestDto);

        Ticket ticket = responseDto.getTicket();

    }
}