package task2.t1;

public class Truck extends Car {

    private final double maxLoadCapacity;

    public Truck(FuelType fuelType, int numberOfDoors, double trunkCapacity, double maxLoadCapacity) {
        super(fuelType, numberOfDoors, trunkCapacity);
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public double getTrunkCapacity() {
        return trunkCapacity * 1_000;
    }

    public double getMaxLoadCapacity() {
        return  maxLoadCapacity * 1_000;
    }
}
