package chrvk.javaelementary.hw18.task3.Model;

public class Todo {
    private int userId;
    private int id;
    private String title;
    private boolean completed;

    public Todo() {
    }

    public Todo(int userId, int id, String title, boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "{" +
                "\n userId: " + userId +
                "\n id: " + id +
                "\n title: '" + title + '\'' +
                "\n completed: " + completed +
                "\n}";
    }
}
