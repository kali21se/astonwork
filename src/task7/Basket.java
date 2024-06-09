package task7;

import java.util.HashMap;
import java.util.Map;

public class Basket {

    private Map<String, Double> goodsList = new HashMap<>();

    public void putToBasket(String name, Double price) {
        goodsList.put(name, price);
    }

    @Override
    public String toString() {
        return goodsList.toString();
    }
}
