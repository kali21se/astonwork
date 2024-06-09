package task2.t2;

import java.util.List;

public class MutablePerson implements Person {
    private String name;

    private int age;

    private List<String> hobbies;

    public MutablePerson(String name, int age, List<String> hobbies) {
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
        return hobbies;
    }
}
