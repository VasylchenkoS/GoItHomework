package vasylchenko.Module3.Mod3_1;

import java.util.List;

/**
 * Created by v.vasilchenko on 09.03.2016.
 */
public class Directory {
    private List<Audio> audios;
    private List<Text> texts;
    private List<Image> images;

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Text> getTexts() {
        return texts;
    }

    public void setTexts(List<Text> texts) {
        this.texts = texts;
    }

    public List<Audio> getAudios() {
        return audios;
    }

    public void setAudios(List<Audio> audios) {
        this.audios = audios;
    }


}
