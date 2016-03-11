package vasylchenko.module3.mod3_2;

import java.util.List;

/**
 * Created by v.vasilchenko on 09.03.2016.
 */
public class Bouquet {
    private List<Aster> asters;
    private List<Chamomile> chamomiles;
    private List<Rose> roses;

    public List<Aster> getAsters() {
        return asters;
    }

    public void setAsters(List<Aster> asters) {
        this.asters = asters;
    }

    public List<Chamomile> getChamomiles() {
        return chamomiles;
    }

    public void setChamomiles(List<Chamomile> chamomiles) {
        this.chamomiles = chamomiles;
    }

    public List<Rose> getRoses() {
        return roses;
    }

    public void setRoses(List<Rose> roses) {
        this.roses = roses;
    }
}
