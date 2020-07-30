package abstracts.parkinglot;

public class Car implements Vehicle {

    private VehicleType type;

    public Car(VehicleType type) {
        this.type = type;
    }

    @Override
    public VehicleSize getSize() {
        return VehicleSize.MEDIUM;
    }

    @Override
    public VehicleType getType() {
        return this.type;
    }
}
