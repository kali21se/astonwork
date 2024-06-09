package task7;

import java.util.Random;
import java.util.concurrent.*;

public class Main {

    private static final Random random = new Random();

    public static void main(String[] args) {

        try (ExecutorService executorService = Executors.newFixedThreadPool(10);
             ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor()) {
            scheduledExecutorService.scheduleAtFixedRate(() -> {
                final var buyerCount = random.nextInt(0, 2);
                final var goodsCount = random.nextInt(1, 4);
                for (int i = 0; i < buyerCount; i++) {
                    final var buyer = new Buyer();
                    executorService.execute(() -> {
                        buyer.enterToMarket();
                        buyer.takeBasket();
                        for (int j = 0; j < goodsCount; j++) {
                            buyer.chooseGoods();
                            buyer.putGoodsToBasket();
                        }
                        buyer.goOut();
                        System.out.println("Shopping is done for " + buyer);
                        System.out.println("Conflict test");
                    });
                }
            }, 0, 1, TimeUnit.SECONDS);
        }
    }
}
