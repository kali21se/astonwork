package task2.t3;

public class Computer {
    public static class Processor {
        private String model;

        public Processor(String model) {
            this.model = model;
        }

        public String getDetails() {
            return "Processor model is " + model;
        }
    }

    public class RAM {
        private int size;

        public RAM(int size) {
            this.size = size;
        }

        public String getDetails() {
            return "RAM size is " + size;
        }
    }
}
