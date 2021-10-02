package chrvk.javaelementary.hw18.task3.Model;

public class Comment {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;

    public Comment() {
    }

    public Comment(int postId, int id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    @Override
    public String toString() {
        return "{" +
                "\n postId: " + postId +
                "\n id: " + id +
                "\n name: '" + name + '\'' +
                "\n email: '" + email + '\'' +
                "\n body: '" + body + '\'' +
                "\n}";
    }
}