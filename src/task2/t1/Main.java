package task2.t1;

import task2.t1.FuelType;
import task2.t1.Sedan;
import task2.t1.Truck;
import task2.t1.Vehicle;

public class Main {
    public static void main(String[] args) {
        Truck optimusPrime = new Truck(FuelType.DIESEL, 2, 110, 200);
        Sedan bumblebee = new Sedan(FuelType.GASOLINE, 2, 15, "Premium");

        System.out.println("Truck used %s, had %d doors, trunk capacity is %.2f of %.2f".formatted(
                optimusPrime.getFuelType().getDisplayName(),
                optimusPrime.getNumberOfDoors(),
                optimusPrime.getTrunkCapacity(),
                optimusPrime.getMaxLoadCapacity()
        ));

        optimusPrime.start();
        optimusPrime.stop();

        System.out.println("%s level Sedan used %s, had %d doors, trunk capacity is %.2f".formatted(
                bumblebee.getLuxuryLevel(),
                bumblebee.getFuelType().getDisplayName(),
                bumblebee.getNumberOfDoors(),
                bumblebee.getTrunkCapacity()
        ));

        bumblebee.start();
        bumblebee.stop();
    }
}
