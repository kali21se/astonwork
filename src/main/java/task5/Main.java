package task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static List<Employee> createEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alex", 25, "Data Science", 3250.00));
        employees.add(new Employee("Simon", 19, "IT", 2500.00));
        employees.add(new Employee("Irina", 35, "HR", 3000.00));
        employees.add(new Employee("Oleg", 40, "Administration", 4000.00));
        return employees;
    }

    private static List<Employee> findEmployeesOver30Age(List<Employee> employees) {
        return employees.stream()
                .filter(it -> it.getAge() > 30)
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList());
    }

    private static long countEmployeesInDepartment(List<Employee> employees, String department) {
        return employees.stream()
                .filter(it -> it.getDepartment().equals(department))
                .count();
    }

    private static Employee findEmployeeWithMaxSalary(List<Employee> employees) {
        return employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .get();
    }

    private static List<String> getNamesInDepartmentSortedByName(List<Employee> employees, String department) {
        return employees.stream()
                .filter(it -> it.getDepartment().equals(department))
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    public static double calculateAverageSalary(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .getAsDouble();
    }

    public static void main(String[] args) {
        // Task 5.1
        List<Integer> numbers = new ArrayList<>(List.of(2, 4, 7, 11, 18));

        var evenNumbersSum = numbers.stream()
                .distinct()
                .filter(it -> it % 2 == 0)
                .reduce(0, Integer::sum);
        var evenNumbersSumV2 = numbers.stream()
                .distinct()
                .filter(it -> it % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(evenNumbersSum);
        System.out.println(evenNumbersSumV2);

        // Task 5.2

        List<Employee> listOfEmployee = createEmployeeList();

        System.out.println(findEmployeesOver30Age(listOfEmployee));

        System.out.println(countEmployeesInDepartment(listOfEmployee, "IT"));

        System.out.println(findEmployeeWithMaxSalary(listOfEmployee));

        System.out.println(getNamesInDepartmentSortedByName(listOfEmployee, "HR"));

        System.out.println(calculateAverageSalary(listOfEmployee));
    }
}
