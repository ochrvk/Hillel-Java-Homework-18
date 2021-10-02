package chrvk.javaelementary.hw18.task3.Model;

public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;

    public Post() {
    }

    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    @Override
    public String toString() {
        return "{" +
                "\n userId: " + userId +
                "\n id: " + id +
                "\n title: '" + title + '\'' +
                "\n body: '" + body + '\'' +
                "\n}";
    }
}
