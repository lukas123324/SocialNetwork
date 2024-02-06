import java.util.ArrayList;

public class NewsFeed {
    private ArrayList<NewsInput> newsInputs;
    private ArrayList<User> users;

    // Constructor
    public NewsFeed() {
        this.newsInputs = new ArrayList<NewsInput>();
        this.users = new ArrayList<User>();
    }

    // Getter + Setter
    public ArrayList<NewsInput> getNewsInputs() {
        return newsInputs;
    }

    public void setNewsInputs(ArrayList<NewsInput> newsInputs) {
        this.newsInputs = newsInputs;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    // toString
    @Override
    public String toString() {
        return "NewsFeed{" +
                "newsInputs=" + newsInputs +
                ", users=" + users +
                '}';
    }

    // Methods
    /**
     * This method adds a new NewsInput to the newsInputs ArrayList
     * @param newsInput
     */
    public void addNewsInput(NewsInput newsInput) {
        this.newsInputs.add(newsInput);
    }

    /**
     * This method removes a NewsInput from the newsInputs ArrayList
     * @param newsInput
     */
    public void removeNewsInput(NewsInput newsInput) {
        this.newsInputs.remove(newsInput);
    }

    /**
     * This method adds a new User to the users ArrayList
     * @param user
     */
    public void addUsers(User user) {
        this.users.add(user);
    }

    /**
     * This method removes a User from the users ArrayList
     * @param user
     */
    public void removeUsers(User user) {
        this.users.remove(user);
    }

    /**
     * This method returns a list of all NewsInputs by searching for the author
     * @param user
     * @return ArrayList<NewsInput>
     */
    public ArrayList<NewsInput> searchInThisNewsFeedByUser(User user){
        ArrayList<NewsInput> newsInputs = new ArrayList<>();
        for (NewsInput newsInput : this.newsInputs) {
            if (newsInput.getAuthor().equals(user)) {
                newsInputs.add(newsInput);
            }
        }
        return newsInputs;
    }

    /**
     * This method returns a list of all Photos by searching for the author
     * @param user
     * @return ArrayList<NewsInput>
     */
    public ArrayList<String> getAllPhotosOfUser(User user) {
        ArrayList<String> photos = new ArrayList<>();
        for (NewsInput newsInput : this.newsInputs) {
            if (newsInput.getAuthor().equals(user) && newsInput instanceof PhotoPost) {
                photos.add(((PhotoPost) newsInput).getFileName());
            }
        }
        return photos;
    }

    /**
     * This method prints all NewsInputs
     */
    public void printNewsFeed() {
        for (NewsInput newsInput : newsInputs) {
            System.out.println(newsInput);
        }
    }

}
