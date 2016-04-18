package vasylchenko.module6;

public class ExceptionRage extends Exception{
    private int ageValue;

    public ExceptionRage(final int ageValue) {
        this.ageValue = ageValue;
    }

    public int getAgeValue() {
        return ageValue;
    }
}
