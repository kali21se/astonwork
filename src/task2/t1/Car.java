package task2.t1;

public abstract class Car implements Vehicle {
    protected FuelType fuelType;

    protected int numberOfDoors;

    protected double trunkCapacity;

    public Car(FuelType fuelType, int numberOfDoors, double trunkCapacity) {
        this.fuelType = fuelType;
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }

    @Override
    public FuelType getFuelType() {
        return fuelType;
    }

    public abstract int getNumberOfDoors();

    public abstract double getTrunkCapacity();

}
