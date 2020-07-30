package abstracts.parkinglot;

public class ParkingSpace implements Space {
    private VehicleSize vehicleSize;
    private VehicleType type;
    private boolean isTaken;

    public ParkingSpace(VehicleSize vehicleSize, VehicleType type, boolean isTaken) {
        this.vehicleSize = vehicleSize;
        this.type = type;
    }


    @Override
    public boolean getIsTaken() {
        return this.isTaken;
    }

    @Override
    public void setIsTaken(boolean isTaken) {
        this.isTaken = isTaken;
    }

    @Override
    public VehicleSize getSize() {
        return this.vehicleSize;
    }

    @Override
    public VehicleType getType() {
        return this.type;
    }
}
