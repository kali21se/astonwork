package task2.t3;

public class Main {
    public static void main(String[] args) {
        Computer.Processor processor = new Computer.Processor("Intel i5");

        Computer computer = new Computer();

        Computer.RAM ram = computer.new RAM(4);

        System.out.println(processor.getDetails());
        System.out.println(ram.getDetails());
    }
}
