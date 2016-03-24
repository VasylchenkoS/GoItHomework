package vasylchenko.module3.mod3_3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by v.vasilchenko on 09.03.2016.
 */
public class MusicShop {
    private List<MusicalInstrument> shopStock;

    public List<MusicalInstrument> getShopStock() {
        return shopStock;
    }

    public void setShopStock(List<MusicalInstrument> shopStock) {
        this.shopStock = shopStock;
    }

    @Override
    public String toString() {

        String s = "\nMusicShop has: ";
        int count = 0;
        String currentType = "";
        for (MusicalInstrument mus : shopStock) {
            for (MusicalInstrument instrument : shopStock) {
                if (instrument.getType().equals(mus.getType())) {
                    count++;
                }
            }
            if (mus.getType() != currentType)
                s = s + "\n" + mus.getType() + " :" + count + "pcs";
            count = 0;
            currentType = mus.getType();
        }
        return s + "\n------------------";
    }

    public void createShop(int guitarNum, int pianoNum, int trumpetNum) {
        ArrayList<MusicalInstrument> instruments = new ArrayList<>();
        for (int i = 0; i < guitarNum; i++) {
            instruments.add(new GuitarInstrument());
        }
        for (int i = 0; i < pianoNum; i++) {
            instruments.add(new PianoInstrument());
        }
        for (int i = 0; i < trumpetNum; i++) {
            instruments.add(new TrumpetInstrument());
        }
        setShopStock(instruments);
    }
}
