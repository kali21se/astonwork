package task8;

public class TeaMaker extends DrinkMaker {

    @Override
    void putIngredients() {
        System.out.println("Putting the tea leaves in a cup...");
    }

    @Override
    void pourLiquid() {
        System.out.println("Pouring water into a cup...");
    }
}
