package abstracts.parkinglot;

public class Truck implements Vehicle{
    private VehicleType type;

    public Truck(VehicleType type) {
        this.type = type;
    }

    @Override
    public VehicleSize getSize() {
        return VehicleSize.LARGE;
    }

    @Override
    public VehicleType getType() {
        return this.type;
    }
}
