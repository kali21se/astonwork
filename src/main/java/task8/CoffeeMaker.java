package task8;

public class CoffeeMaker extends DrinkMaker {

    @Override
    void putIngredients() {
        System.out.println("Putting the coffee beans in a cup...");
    }

    @Override
    void pourLiquid() {
        System.out.println("Pouring water and milk into a cup...");
    }
}
