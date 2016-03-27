package vasylchenko.module3.mod3_3;

/**
 * Created by v.vasilchenko on 09.03.2016.
 */
public abstract class MusicalInstrument {
    public abstract String getType();

    @Override
    public String toString() {
        return getType();
    }
}
