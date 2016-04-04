package vasylchenko.module3.mod3_3;


/**
 * Created by v.vasilchenko on 18.03.2016.
 */
public class Main {

    public static void main(String[] args) {

        MusicShop musicShop = new MusicShop();
        musicShop.createShop(100, 50, 30);
        System.out.println(musicShop.toString());

        OrderList orderList1 = new OrderList();
        orderList1.completeOrder(musicShop, 50, 20, 15);

        OrderList orderList2 = new OrderList();
        orderList2.completeOrder(musicShop, 25, 20, 10);

        OrderList orderList3 = new OrderList();
        orderList3.completeOrder(musicShop, 25, 101, 15);

    }
}
