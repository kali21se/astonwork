package task2.t2;

import java.util.ArrayList;
import java.util.List;

public final class ImmutablePerson implements Person {
    private final String name;

    private final int age;

    private final List<String> hobbies;

    public ImmutablePerson(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public List<String> getHobbies() {
        return new ArrayList<>(hobbies);
    }
}
