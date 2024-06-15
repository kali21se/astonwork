package task8;

public abstract class DrinkMaker {

    public void takeCup() {
        System.out.println("Took the cup...");
    }

    abstract void putIngredients();

    abstract void pourLiquid();
}
