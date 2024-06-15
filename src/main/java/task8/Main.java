package task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // template pattern example
        var reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wat u want?\n" +
                "1 - Tea\n" +
                "2 - Coffee");
        int choice = Integer.parseInt(reader.readLine());

        if(choice == 1) {
            var teaMaker = new TeaMaker();
            teaMaker.takeCup();
            teaMaker.putIngredients();
            teaMaker.pourLiquid();
        } else if(choice == 2) {
            var coffeeMaker = new CoffeeMaker();
            coffeeMaker.takeCup();
            coffeeMaker.putIngredients();
            coffeeMaker.pourLiquid();
        }
    }
}
