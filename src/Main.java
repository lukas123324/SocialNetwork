import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        NewsFeed newsFeed = new NewsFeed();

        User user1 = new User("Max", "Mustermann", "maxi", LocalDate.of(1990, 1, 1));
        User user2 = new User("Anna", "Musterfrau", "anna", LocalDate.of(1995, 1, 1));
        User user3 = new User("Hans", "Peter", "hans", LocalDate.of(1990, 1, 1));

        newsFeed.addUsers(user1);
        newsFeed.addUsers(user2);
        newsFeed.addUsers(user3);

        Comment comment1 = new Comment(user1, "123 Comment comment1 comment!");
        Comment comment2 = new Comment(user2, "Comment comment2 comment!");

        NewsInput newsInput1 = new TextPost(user1, "Hallo", 0, null, LocalDate.now(), 0, "Hallo");
        NewsInput newsInput2 = new PhotoPost(user2, "Servus", 0, null, LocalDate.now(), 0, "Servus", "Servus");
        NewsInput newsInput3 = new TextPost(user3, "Hallo", 0, null, LocalDate.now(), 0, "Hallo");
        NewsInput newsInput4 = new PhotoPost(user1, "Servus", 0, null, LocalDate.now(), 0, "Servus", "Servus");

        newsInput1.addComment(comment1);
        newsInput1.addComment(comment2);
        newsInput2.addComment(comment1);
        newsInput1.addLike();

        newsFeed.addNewsInput(newsInput1);
        newsFeed.addNewsInput(newsInput2);
        newsFeed.addNewsInput(newsInput3);
        newsFeed.addNewsInput(newsInput4);

        newsFeed.printNewsFeed();
        System.out.println(user1.getUserName() + ": " + newsFeed.searchInThisNewsFeedByUser(user1));
        System.out.println(user1.getUserName() + ": " + newsFeed.getAllPhotosOfUser(user1));

    }
}