package vasylchenko.module3.mod3_3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by v.vasilchenko on 09.03.2016.
 */
public class MusicShop {
    List<GuitarInstrument> guitar;
    List<PianoInstrument> piano;
    List<TrumpetInstrument> trumpet;

    public List<PianoInstrument> getPiano() {
        return piano;
    }

    public void setPiano(List<PianoInstrument> piano) {
        this.piano = piano;
    }

    public List<TrumpetInstrument> getTrumpet() {
        return trumpet;
    }

    public void setTrumpet(List<TrumpetInstrument> trumpet) {
        this.trumpet = trumpet;
    }

    public List<GuitarInstrument> getGuitar() {
        return guitar;
    }

    public void setGuitar(List<GuitarInstrument> guitar) {
        this.guitar = guitar;
    }

    public String toString() {
        return "MusicShop has: Piano :" + piano.size() + "pcs, Guitar :" + guitar.size() + "pcs, Trumpet:" + trumpet.size() + "pcs";
    }

    public void createShop(int guitarNum, int pianoNum, int trumpetNum) {
        ArrayList<GuitarInstrument> guitarInstrumentArraysList = new ArrayList<>();
        for (int i = 0; i < guitarNum; i++) {
            guitarInstrumentArraysList.add(new GuitarInstrument());
        }
        setGuitar(guitarInstrumentArraysList);

        ArrayList<PianoInstrument> newPianoInstruments = new ArrayList<>();
        for (int i = 0; i < pianoNum; i++) {
            newPianoInstruments.add(new PianoInstrument());
        }
        setPiano(newPianoInstruments);
        ArrayList<TrumpetInstrument> newTrumpetInstruments = new ArrayList<>();
        for (int i = 0; i < trumpetNum; i++) {
            newTrumpetInstruments.add(new TrumpetInstrument());
        }
        setTrumpet(newTrumpetInstruments);
    }

}
