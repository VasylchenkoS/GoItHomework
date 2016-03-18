package vasylchenko.module6.mod6_2;

/**
 * Created by v.vasilchenko on 09.03.2016.
 */
abstract class NewMusicalInstrument {
    public abstract String getType();

    @Override
    public String toString() {
        return getType();
    }
}
