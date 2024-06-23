package org.example.models;

import java.util.List;

public class ParkingSport extends  BaseModel{
    private int sportNo;
    private List<VehicleType> vehicleTypeList;
    private ParkingFloor parkingFloor;
    private ParkingSpotStatus parkingSpotStatus;


    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public int getSportNo() {
        return sportNo;
    }

    public void setSportNo(int sportNo) {
        this.sportNo = sportNo;
    }

    public List<VehicleType> getVehicleTypeList() {
        return vehicleTypeList;
    }

    public void setVehicleTypeList(List<VehicleType> vehicleTypeList) {
        this.vehicleTypeList = vehicleTypeList;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}
