/*
    Написать класс MyApiService с использованием паттерна синглтон для доступа к API:
    (предварительно создать все необходимые модели List, Post, User...)
    Пример:
    ApiService service = ApiService.getInstance();
    List<Post> posts = service.getPosts();
    List<User> users = service.getUses();
 */
package chrvk.javaelementary.hw18.task3;

import chrvk.javaelementary.hw18.task3.Model.Post;
import chrvk.javaelementary.hw18.task3.Model.*;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void getApi() {
        ApiService service = ApiService.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("__________________");
            System.out.println("1. Get Album;");
            System.out.println("2. Get Comment;");
            System.out.println("3. Get Photo;");
            System.out.println("4. Get Post;");
            System.out.println("5. Get Todo;");
            System.out.println("6. Get User;");
            System.out.println("__________________");
            int j = scanner.nextInt();
            switch (j) {
                case 1:
                    List<Album> albums = service.getAlbum();
                    for (Album album : albums) {
                        System.out.println("____________________________");
                        System.out.println(album);
                    }
                    break;
                case 2:
                    List<Comment> comments = service.getComment();
                    for (Comment comment : comments) {
                        System.out.println("____________________________");
                        System.out.println(comment);
                    }
                    break;
                case 3:
                    List<Photo> photos = service.getPhoto();
                    for (Photo photo : photos) {
                        System.out.println("____________________________");
                        System.out.println(photo);
                    }
                    break;
                case 4:
                    List<Post> posts = service.getPosts();
                    for (Post post : posts) {
                        System.out.println("____________________________");
                        System.out.println(post);
                    }
                    break;
                case 5:
                    var todos = service.getTodo();
                    for (Todo todo : todos) {
                        System.out.println("____________________________");
                        System.out.println(todo);
                    }
                    break;
                case 6:
                    List<User> users = service.getUser();
                    for (User user : users) {
                        System.out.println("____________________________");
                        System.out.println(user);
                    }
                    break;
                default:
                    return;
            }
        }
    }

    public static void main(String[] args) {
        getApi();
    }
}
