import java.time.LocalDate;
import java.util.ArrayList;

public class NewsInput {
    private User author;
    private String text;
    private int likes;
    private ArrayList<Comment> comments;
    private LocalDate timestamp;
    private int countReaders;

    // Constructer
    public NewsInput(User author, String text, int likes, Comment[] comments, LocalDate timestamp, int countReaders) {
        this.author = author;
        this.text = text;
        this.likes = likes;
        this.comments = new ArrayList<>();
        this.timestamp = timestamp;
        this.countReaders = countReaders;
    }

    // Getter + Setter
    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    public int getCountReaders() {
        return countReaders;
    }

    public void setCountReaders(int countReaders) {
        this.countReaders = countReaders;
    }

    // toString
    @Override
    public String toString() {
        return "NewsInput{" +
                "author=" + author +
                ", text='" + text + '\'' +
                ", likes=" + likes +
                ", comments=" + comments +
                ", timestamp=" + timestamp +
                ", countReaders=" + countReaders +
                '}';
    }

    // Methoden
    /**
     * Adds a like to the post.
     * a like can only be added and not removed
     */
    public void addLike() {
        likes++;
    }

    /**
     * Adds a comment to the post.
     *
     * @param comment the comment to add
     */
    public void addComment(Comment comment) {
        comments.add(comment);
    }

    /**
     * Removes a comment from the post.
     *
     * @param comment the comment to remove
     */
    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

}
