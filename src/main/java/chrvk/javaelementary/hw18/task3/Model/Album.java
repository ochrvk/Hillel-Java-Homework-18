package chrvk.javaelementary.hw18.task3.Model;

public class Album {
    private int userId;
    private int id;
    private String title;

    public Album() {
    }

    public Album(int userId, int id, String title) {
        this.userId = userId;
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "{" +
                "\n userId: " + userId +
                "\n id: " + id +
                "\n title: '" + title + '\'' +
                "\n}";
    }
}
