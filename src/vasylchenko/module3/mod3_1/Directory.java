package vasylchenko.module3.mod3_1;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by v.vasilchenko on 09.03.2016.
 */
public class Directory {
    private List<File> fileList;

    public List<File> getFileList() {
        return fileList;
    }

    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }

    public File addFileToList(String name, String type, int size) {
        File file;
        if (type.equals("mp3")) {
            file = new AudioFile();
        } else if (type.equals("jpg")) {
            file = new ImageFile();
        } else file = new TextFile();

        if (name.startsWith("_") || name.startsWith(" "))
            name = name.substring(1, name.length());
        file.setName(name);
        file.setType(type);
        file.setSize(size);

        return file;
    }

    public Directory createFileList(){
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
        return directory;
    }
}

