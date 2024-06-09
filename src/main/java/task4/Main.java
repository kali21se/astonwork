package task4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    private static void removeStudentsWithLowGrade (List<Student> students) {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student stud = it.next();
            if (stud.calculateAverageGrade() < 3) {
                it.remove();
            } else {
                stud.promoteStudent();
            }
        }
    }

    private static void printStudents (List<Student> students, int course) {
        System.out.printf("Students on %d course: \n", course);
        for (Student student : students) {
            if (student.getCourse() == course)
                System.out.println(student.getName());
        }
    }

    public static void main(String[] args) {
        // Task 4.1
        ArrayList<String> listOfCountries = new ArrayList<>();

        listOfCountries.add("Russia");
        listOfCountries.add("USA");
        listOfCountries.add("China");

        System.out.println(listOfCountries);

        listOfCountries.set(1, "India");
        listOfCountries.remove(1);
        listOfCountries.remove("China");
        listOfCountries.indexOf("Russia");

        System.out.println(listOfCountries.contains("Russia"));
        System.out.println(listOfCountries);
        // Task 4.2
        LinkedList<String> twoWayListOfCountries = new LinkedList<>();

        twoWayListOfCountries.addFirst("England");
        twoWayListOfCountries.addFirst("Germany");
        twoWayListOfCountries.addLast("Canada");
        twoWayListOfCountries.addLast("Brazil");

        System.out.println(twoWayListOfCountries);

        twoWayListOfCountries.removeFirst();
        twoWayListOfCountries.removeLast();

        System.out.println(twoWayListOfCountries);

        System.out.println(twoWayListOfCountries.getFirst());
        System.out.println(twoWayListOfCountries.getLast());
        //Task 4.3
        HashSet<Person> listOfPersons = new HashSet<>();

        listOfPersons.add(new Person("Irina"));
        listOfPersons.add(new Person("Oleg"));
        listOfPersons.add(new Person("Alex"));

        for (Person person: listOfPersons) {
            System.out.println(person);
        }

        Iterator<Person> it = listOfPersons.iterator();
        int count = 0;

        while (count < 2) {
            Person person = it.next();
            it.remove();
            count++;
        }

        System.out.println(listOfPersons);
        //Task 4.4
        List<Student> listOfStudents = new ArrayList<>();

        listOfStudents.add(new Student("Pavel", "Group1", 1, List.of(2.5, 3.5, 4.5)));
        listOfStudents.add(new Student("Andrey", "Group2", 2, List.of(2.8, 3.8, 4.8)));
        listOfStudents.add(new Student("Anna", "Group3", 3, List.of(2.2, 2.6, 3.5)));

        System.out.println(listOfStudents);
        removeStudentsWithLowGrade(listOfStudents);

        System.out.println(listOfStudents);
        printStudents(listOfStudents, 2);
    }
}
