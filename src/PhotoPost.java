import java.time.LocalDate;

public class PhotoPost extends NewsInput {
    private String header;
    private String fileName;

    // Constructor
    public PhotoPost(User author, String text, int likes, Comment[] comments, LocalDate timestamp, int countReaders, String header, String fileName) {
        super(author, text, likes, comments, timestamp, countReaders);
        this.header = header;
        this.fileName = fileName;
    }

    // Getter + Setter
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    // toString
    @Override
    public String toString() {
        return "PhotoPost{" +
                "header='" + header + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
