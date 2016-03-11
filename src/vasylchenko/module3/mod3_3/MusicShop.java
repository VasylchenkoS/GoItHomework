package vasylchenko.module3.mod3_3;

import java.util.List;

/**
 * Created by v.vasilchenko on 09.03.2016.
 */
public class MusicShop {
    private List<GuitarInstrument> guitars;
    private List<PianoInstrument> pianos;
    private List<TrumpetInstrument> trumpets;

    public List<GuitarInstrument> getGuitars() {
        return guitars;
    }

    public void setGuitars(List<GuitarInstrument> guitars) {
        this.guitars = guitars;
    }

    public List<PianoInstrument> getPianos() {
        return pianos;
    }

    public void setPianos(List<PianoInstrument> pianos) {
        this.pianos = pianos;
    }

    public List<TrumpetInstrument> getTrumpets() {
        return trumpets;
    }

    public void setTrumpets(List<TrumpetInstrument> trumpets) {
        this.trumpets = trumpets;
    }
}
