package vasylchenko.module3.mod3_1;


import java.util.LinkedList;
import java.util.List;

/**
 * Created by v.vasilchenko on 26.03.2016.
 */
public class Runner {
    public static void main(String[] args) {
        Directory directory = new Directory();
        List<File> fileList = new LinkedList<>();
        java.io.File file = new java.io.File("d:\\home\\java\\temp\\files");
        for (java.io.File f : file.listFiles(java.io.File::isFile)) {
            String name = f.getName().substring(0, f.getName().lastIndexOf("."));
            String type = f.getName().substring(f.getName().lastIndexOf(".") + 1, f.getName().length());
            int size = (int) (f.length() / 1024);
            fileList.add(directory.addFileToList(name, type, size));
        }
        directory.setFileList(fileList);
        new PrintListAsTable(directory.getFileList());
        SortedFileList sortedFileList = new SortedFileList();
        new PrintListAsTable(sortedFileList.createSortedFileList(directory.getFileList()));
    }
}
