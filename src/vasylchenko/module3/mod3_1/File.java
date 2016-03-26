package vasylchenko.module3.mod3_1;

/**
 * Created by v.vasilchenko on 09.03.2016.
 */
abstract class File implements java.io.Serializable, Comparable<File> {
    private String name;
    private String type;
    private int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int compareTo(File o) {
        int result = this.type.compareTo(o.type);
        if (result != 0) return result;
        result = this.name.compareTo(o.name);
        if (result != 0) return result;
        result = this.size - o.size;
        if (result != 0) return result;
        return 0;
    }
}

