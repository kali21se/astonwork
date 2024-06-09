package task1;

public class BasketballPlayer extends Player {
    private double height;

    {
        title = "Basketball Player ";
        System.out.println(title);
    }

    public BasketballPlayer(String name, int age, double height) {
        super(name, age);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
