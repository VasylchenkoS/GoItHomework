package vasylchenko.module6.mod6_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by v.vasilchenko on 09.03.2016.
 */
public class NewMusicShop {
    List<NewGuitarInstrument> guitar;
    List<NewPianoInstrument> piano;
    List<NewTrumpetInstrument> trumpet;

    public List<NewPianoInstrument> getPiano() {
        return piano;
    }

    public void setPiano(List<NewPianoInstrument> piano) {
        this.piano = piano;
    }

    public List<NewTrumpetInstrument> getTrumpet() {
        return trumpet;
    }

    public void setTrumpet(List<NewTrumpetInstrument> trumpet) {
        this.trumpet = trumpet;
    }

    public List<NewGuitarInstrument> getGuitar() {
        return guitar;
    }

    public void setGuitar(List<NewGuitarInstrument> guitar) {
        this.guitar = guitar;
    }

    public String toString() {
        return "MusicShop has: Piano :" + piano.size() + "pcs, Guitar :" + guitar.size() + "pcs, Trumpet:" + trumpet.size() + "pcs";
    }

    public void createShop(int guitarNum, int pianoNum, int trumpetNum) {
        ArrayList<NewGuitarInstrument> newGuitarInstrumentArraysList = new ArrayList<>();
        for (int i = 0; i < guitarNum; i++) {
            newGuitarInstrumentArraysList.add(new NewGuitarInstrument());
        }
        setGuitar(newGuitarInstrumentArraysList);

        ArrayList<NewPianoInstrument> newPianoInstruments = new ArrayList<>();
        for (int i = 0; i < pianoNum; i++) {
            newPianoInstruments.add(new NewPianoInstrument());
        }
        setPiano(newPianoInstruments);
        ArrayList<NewTrumpetInstrument> newTrumpetInstruments = new ArrayList<>();
        for (int i = 0; i < trumpetNum; i++) {
            newTrumpetInstruments.add(new NewTrumpetInstrument());
        }
        setTrumpet(newTrumpetInstruments);
    }

}
