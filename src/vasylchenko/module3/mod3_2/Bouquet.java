package vasylchenko.module3.mod3_2;

import java.util.List;

/**
 * Created by v.vasilchenko on 09.03.2016.
 */
public class Bouquet {
    private List<AsterFlower> asters;
    private List<ChamomileFlower> chamomiles;
    private List<RoseFlower> roses;

    public List<AsterFlower> getAsters() {
        return asters;
    }

    public void setAsters(List<AsterFlower> asters) {
        this.asters = asters;
    }

    public List<ChamomileFlower> getChamomiles() {
        return chamomiles;
    }

    public void setChamomiles(List<ChamomileFlower> chamomiles) {
        this.chamomiles = chamomiles;
    }

    public List<RoseFlower> getRoses() {
        return roses;
    }

    public void setRoses(List<RoseFlower> roses) {
        this.roses = roses;
    }
}
