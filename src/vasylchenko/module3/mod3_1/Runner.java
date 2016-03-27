package vasylchenko.module3.mod3_1;


/**
 * Created by v.vasilchenko on 26.03.2016.
 */
public class Runner {
    public static void main(String[] args) {
        Directory directory = new Directory().createFileList();
        new PrintListAsTable(directory.getFileList());
        SortedFileList sortedFileList = new SortedFileList();
        new PrintListAsTable(sortedFileList.createSortedFileList(directory.getFileList()));
    }

}
