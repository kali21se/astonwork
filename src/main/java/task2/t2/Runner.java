package task2.t2;

public class Runner {
    public boolean isImmutable(Person person) {
        var hobbies = person.getHobbies();

        System.out.println(hobbies);
        hobbies.add("New hobby");

        return person.getHobbies().size() != hobbies.size();
    }
}
