package task7;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class Buyer implements IBuyer, IUseBasket {

    private static final Map<String, Double> MARKET_GOODS = Map.of(
            "Apple", 50.0,
            "Orange", 55.5,
            "Banana", 60.0,
            "Mango", 100.6,
            "Coke", 77.7
    );

    private final Random random = new Random();

    private String name;

    private Basket basket;

    private String selectGoods;

    @Override
    public void enterToMarket() {
        System.out.println("Enter to market...");
        processOperation("enterToMarket");
    }

    @Override
    public void chooseGoods() {
        System.out.println("Choosing goods...");
        selectGoods = new ArrayList<>(MARKET_GOODS.keySet()).get(random.nextInt(0, MARKET_GOODS.size()));
        processOperation("chooseGoods");
    }

    @Override
    public void goOut() {
        System.out.println("Exiting from market...");
        processOperation("goOut");
    }

    @Override
    public void takeBasket() {
        System.out.println("Taking the basket...");
        basket = new Basket();
        processOperation("takeBasket");
    }

    @Override
    public void putGoodsToBasket() {
        System.out.printf("Putting %s to basket... \n", selectGoods);
        basket.putToBasket(selectGoods, MARKET_GOODS.get(selectGoods));
        processOperation("putGoodsToBasket");
    }

    @Override
    public String toString() {
        return "Buyer{" +
                ", name='" + name + '\'' +
                ", basket=" + basket +
                '}';
    }

    private void processOperation(String operationName) {
        try {
            var operationProcessingTime = random.nextInt(500, 2000);
            Thread.sleep(operationProcessingTime);
            System.out.printf("Operation [%s] taken: %d ms \n", operationName, operationProcessingTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
