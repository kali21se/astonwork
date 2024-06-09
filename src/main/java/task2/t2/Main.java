package task2.t2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();

        Person immutablePerson = new ImmutablePerson("Alex", 25, new ArrayList<>(List.of("Soccer", "Books")));
        Person mutablePerson = new MutablePerson("John", 33, new ArrayList<>(List.of("Basketball", "TV")));

        var immutableIsImmutable = runner.isImmutable(immutablePerson);
        System.out.println("Person is " + (immutableIsImmutable ? "immutable" : "mutable"));

        var mutableIsImmutable = runner.isImmutable(mutablePerson);
        System.out.println("Person is " + (mutableIsImmutable ? "immutable" : "mutable"));
    }
}
