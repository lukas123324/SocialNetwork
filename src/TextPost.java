import java.time.LocalDate;

public class TextPost extends NewsInput {
    private String message;

    // Constructor
    public TextPost(User author, String text, int likes, Comment[] comments, LocalDate timestamp, int countReaders, String message) {
        super(author, text, likes, comments, timestamp, countReaders);
        this.message = message;
    }

    // Getter + Setter
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // toString
    @Override
    public String toString() {
        return "TextPost{" +
                "message='" + message + '\'' +
                '}';
    }

}
