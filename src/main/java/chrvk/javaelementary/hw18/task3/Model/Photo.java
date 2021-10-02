package chrvk.javaelementary.hw18.task3.Model;

public class Photo {
    private int albumId;
    private int id;
    private String title;
    private String url;
    private String thumbnailUrl;

    public Photo() {
    }

    public Photo(int albumId, int id, String title, String url, String thumbnailUrl) {
        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
    }

    @Override
    public String toString() {
        return "{" +
                "\n albumId: " + albumId +
                "\n id: " + id +
                "\n title: '" + title + '\'' +
                "\n url: '" + url + '\'' +
                "\n thumbnailUrl: '" + thumbnailUrl + '\'' +
                "\n}";
    }
}
