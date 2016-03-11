package vasylchenko.module3.mod3_3;

import java.util.List;

/**
 * Created by v.vasilchenko on 09.03.2016.
 */
public class Music_shop {
    private List<Guitar> guitars;
    private List<Piano> pianos;
    private List<Trumpet> trumpets;

    public List<Guitar> getGuitars() {
        return guitars;
    }

    public void setGuitars(List<Guitar> guitars) {
        this.guitars = guitars;
    }

    public List<Piano> getPianos() {
        return pianos;
    }

    public void setPianos(List<Piano> pianos) {
        this.pianos = pianos;
    }

    public List<Trumpet> getTrumpets() {
        return trumpets;
    }

    public void setTrumpets(List<Trumpet> trumpets) {
        this.trumpets = trumpets;
    }
}
