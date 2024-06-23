package org.example.strategies;

import org.example.models.Gate;
import org.example.models.ParkingSport;
import org.example.models.VehicleType;

public interface SpotAssigmentStrategy {
    ParkingSport assignSpot(VehicleType vehicleType, Gate gate);
}
