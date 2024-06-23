package org.example.models;

import java.util.List;

public class ParkingFloor extends BaseModel {
    private int floorNo;
    private ParkingFloorStatus parkingFloorStatus;
    private List<ParkingSport> parkingSports;

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public List<ParkingSport> getParkingSports() {
        return parkingSports;
    }

    public void setParkingSports(List<ParkingSport> parkingSports) {
        this.parkingSports = parkingSports;
    }
}
