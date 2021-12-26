package github.regularrabbit05.fileIndexer.types;

import java.util.HashMap;

public class Index {
    public String name;
    public HashMap<Long, IndexedFileObject> index = new HashMap<>();
    public final byte version = 0x01;

    public Index(HashMap<Long, IndexedFileObject> index) {
        this.index = index;
        name = null;
    }

    public Index(String name, HashMap<Long, IndexedFileObject> index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Long, IndexedFileObject> getIndex() {
        return index;
    }

    public void setIndex(HashMap<Long, IndexedFileObject> index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Index{" +
                "name='" + name + '\'' +
                ", index=" + index +
                '}';
    }

    public IndexedFileObject appendFile(Long timestamp, IndexedFileObject file) {
        IndexedFileObject ret = null;
        if (index.containsKey(timestamp)) ret = index.get(timestamp);
        index.put(timestamp, file);
        return ret;
    }

    public boolean removeFile(Long timestamp) {
        if (!index.containsKey(timestamp)) return false;
        index.remove(timestamp);
        return true;
    }
}