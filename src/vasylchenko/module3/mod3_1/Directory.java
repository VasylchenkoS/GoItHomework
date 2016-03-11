package vasylchenko.module3.mod3_1;

import java.util.List;

/**
 * Created by v.vasilchenko on 09.03.2016.
 */
public class Directory {
    private List<AudioFile> audioFiles;
    private List<TextFile> texts;
    private List<ImageFile> images;

    public List<ImageFile> getImages() {
        return images;
    }

    public void setImages(List<ImageFile> images) {
        this.images = images;
    }

    public List<TextFile> getTexts() {
        return texts;
    }

    public void setTexts(List<TextFile> texts) {
        this.texts = texts;
    }

    public List<AudioFile> getAudioFiles() {
        return audioFiles;
    }

    public void setAudioFiles(List<AudioFile> audioFiles) {
        this.audioFiles = audioFiles;
    }


}
