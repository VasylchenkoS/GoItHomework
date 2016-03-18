package vasylchenko.module6.mod6_2;

import java.util.List;
import java.util.Map;

/**
 * Created by v.vasilchenko on 18.03.2016.
 */
public class OrderList {

    private List<NewGuitarInstrument> guitarToStay;
    private List<NewPianoInstrument> pianoToStay;
    private List<NewTrumpetInstrument> trumpetToStay;

    public void newOrderList(NewMusicShop shop, Map<String, Integer> order) {
        try {
            if (order.containsKey("guitar")) {
                System.out.println("Entered request: Guitar :" + order.get("guitar") + "pcs");
                if (shop.getGuitar().size() < order.get("guitar")) throw new IllegalStateException();
                guitarToStay = shop.getGuitar().subList(order.get("guitar"), shop.getGuitar().size());
            }

            if (order.containsKey("piano")) {
                System.out.println("Entered request: Piano :" + order.get("piano") + "pcs");
                if (shop.getPiano().size() < order.get("piano")) throw new IllegalStateException();
                pianoToStay = shop.getPiano().subList(order.get("piano"), shop.getPiano().size());
            }
            if (order.containsKey("trumpet")) {
                System.out.println("Entered request: Trumpet :" + order.get("trumpet") + "pcs");
                if (shop.getTrumpet().size() < order.get("trumpet")) throw new IllegalStateException();
                trumpetToStay = shop.getTrumpet().subList(order.get("trumpet"), shop.getTrumpet().size());
            }
            if (guitarToStay != null) shop.setGuitar(guitarToStay);
            if (pianoToStay != null) shop.setPiano(pianoToStay);
            if (trumpetToStay != null) shop.setTrumpet(trumpetToStay);


        } catch (IllegalStateException e) {
            System.out.println("[Error]: Enough product in stock");
        } catch (NullPointerException e) {
            System.out.println("[Error]: NullPointer");
        }


        System.out.println(shop);
    }

}
