package task2.t1;

public class Sedan extends Car {
    private final String luxuryLevel;

    public Sedan(FuelType fuelType, int numberOfDoors, double trunkCapacity, String luxuryLevel) {
        super(fuelType, numberOfDoors, trunkCapacity);
        this.luxuryLevel = luxuryLevel;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors + 1;
    }

    @Override
    public double getTrunkCapacity() {
        return trunkCapacity;
    }

    public String getLuxuryLevel() {
        return luxuryLevel;
    }
}
