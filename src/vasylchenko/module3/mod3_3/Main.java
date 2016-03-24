package vasylchenko.module3.mod3_3;


/**
 * Created by v.vasilchenko on 18.03.2016.
 */
public class Main {

    public static void main(String[] args) {

        MusicShop musicShop = new MusicShop();
        musicShop.createShop(16, 2, 7);
        System.out.println(musicShop.toString());

        OrderList orderList1 = new OrderList();
        orderList1.completeOrder(musicShop, 7, 0, 2);

        OrderList orderList2 = new OrderList();
        orderList2.completeOrder(musicShop, 0, 1, 0);

        OrderList orderList3 = new OrderList();
        orderList3.completeOrder(musicShop, 8, 1, 6);

    }
}
