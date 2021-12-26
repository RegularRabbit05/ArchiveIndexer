package github.regularrabbit05.fileIndexer.types;

import java.io.Serializable;

public class IndexedFileObject implements Serializable {
    public long timestamp;
    public String path;
    public String name = null;
    public FileTypes fileType;
    public boolean dated = true;
    public Long startDate = null;
    public Long endDate = null;

    public IndexedFileObject(long timestamp, String path, FileTypes type) {
        this.timestamp = timestamp;
        this.path = path;
        this.fileType = type;
        dated = false;
    }

    public IndexedFileObject(long timestamp, String path, String name, FileTypes type) {
        this.timestamp = timestamp;
        this.path = path;
        this.name = name;
        this.fileType = type;
        dated = false;
    }

    public IndexedFileObject(long timestamp, String path, FileTypes fileType, Long startDate, Long endDate) {
        this.timestamp = timestamp;
        this.path = path;
        this.fileType = fileType;
        this.startDate = startDate;
        this.endDate = endDate;
        dated = true;
    }

    public IndexedFileObject(long timestamp, String path, String name, FileTypes fileType, Long startDate, Long endDate) {
        this.timestamp = timestamp;
        this.path = path;
        this.name = name;
        this.fileType = fileType;
        this.startDate = startDate;
        this.endDate = endDate;
        dated = true;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FileTypes getFileType() {
        return fileType;
    }

    public void setFileType(FileTypes fileType) {
        this.fileType = fileType;
    }

    public boolean isDated() {
        return dated;
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "IndexedFileObject{" +
                "timestamp=" + timestamp +
                ", path='" + path + '\'' +
                ", name='" + name + '\'' +
                ", fileType=" + fileType +
                ", dated=" + dated +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}