package org.example.repository;

import org.example.models.Vehicle;

import java.util.Map;
import java.util.Optional;
import java.util.HashMap;

public class VehicleRepository {

    private Map<Long, Vehicle> vehicleMap;
    private static long id = 0;

    public VehicleRepository() {
        this.vehicleMap = new HashMap<>();
    }

    public Optional<Vehicle> findVehicleByVehicleNumber(String vehicleNumber){
        return this.vehicleMap.values().stream().filter(vehicle -> vehicle.getVehicleNumber()==vehicleNumber).findFirst();

    }

    public Vehicle save(Vehicle vehicle){
        if(vehicle.getId()==0){
            vehicle.setId(id++);
        }
        this.vehicleMap.put(vehicle.getId(), vehicle);
        return vehicle;
    }
}
