package org.example.repository;
import org.example.models.BaseModel;
import org.example.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ParkingLotRepository {

    private Map<Long, ParkingLot> parkingLotMap;
    private static long id = 1;

    public ParkingLotRepository() {
        this.parkingLotMap = new HashMap<>();
    }

    public Optional<ParkingLot> getParkingLotById(long id) {

        return Optional.ofNullable(this.parkingLotMap.get(id));
    }

    /*public ParkingLot getParkingLotByGateId(Long gateId){
        return parkingLotMap.values().stream().
                filter(parkingLot -> parkingLot.getGates().stream().
                        anyMatch(gate -> gate.getId() = gateId )).findFirst();
    }*/
    public ParkingLot getParkingLotByGateId(Long gateId){
        return null;
    }
}