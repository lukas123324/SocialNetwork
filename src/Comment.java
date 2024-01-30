public class Comment {
    private User author;
    private String text;

    // Constructer
    public Comment(User author, String text) {
        this.author = author;
        this.text = text;
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

    // toString
    @Override
    public String toString() {
        return "Comment{" +
                "author=" + author +
                ", text='" + text + '\'' +
                '}';
    }
}
