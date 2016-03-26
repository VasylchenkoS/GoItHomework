package vasylchenko.module3.mod3_1;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by v.vasilchenko on 26.03.2016.
 */
public class SortedFileList {

    public Set<File> createSortedFileList(List<File> fileList) {
        Set<File> sortedFileList = new TreeSet<>(fileList);
        return (sortedFileList);
    }
}
