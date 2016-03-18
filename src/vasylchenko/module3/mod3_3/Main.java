package vasylchenko.module3.mod3_3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by v.vasilchenko on 18.03.2016.
 */
public class Main {

    public static void main(String[] args) {
        MusicShop musicShop = new MusicShop();
        musicShop.createShop(16, 2, 7);
        System.out.println(musicShop);

        Map<String, Integer> order1 = new HashMap<>();
        order1.put("guitar", 7);
        order1.put("trumpet", 2);
        OrderList orderList1 = new OrderList();
        orderList1.newOrderList(musicShop, order1);

        Map<String, Integer> order2 = new HashMap<>();
        order2.put("piano", 1);
        OrderList orderList2 = new OrderList();
        orderList2.newOrderList(musicShop, order2);

        Map<String, Integer> order3 = new HashMap<>();
        order3.put("guitar", 8);
        order3.put("trumpet", 6);
        order3.put("piano", 1);
        OrderList orderList3 = new OrderList();
        orderList3.newOrderList(musicShop, order3);
    }
}
