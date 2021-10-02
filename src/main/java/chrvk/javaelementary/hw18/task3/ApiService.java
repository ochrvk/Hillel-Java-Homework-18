package chrvk.javaelementary.hw18.task3;

import chrvk.javaelementary.hw18.task3.Model.Post;
import chrvk.javaelementary.hw18.task3.Model.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ApiService {
    private ApiService() {
    }

    private static ApiService instance;

    public static synchronized ApiService getInstance() {
        if (instance == null) {
            instance = new ApiService();
        }
        return instance;
    }

    private String sendRequest(String urlString) {
        try {
            URL url = new URL(urlString);
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url(url)
                    .build();
            Call call = client.newCall(request);
            Response response = call.execute();

            return response.body().string();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Post> getPosts() {
        String urlString = "https://jsonplaceholder.typicode.com/posts";
        Type listType = new TypeToken<ArrayList<Post>>() {
        }.getType();
        return new Gson().fromJson(sendRequest(urlString), listType);
    }

    public List<Comment> getComment() {
        String urlString = "https://jsonplaceholder.typicode.com/comments";
        Type listType = new TypeToken<ArrayList<Comment>>() {
        }.getType();
        return new Gson().fromJson(sendRequest(urlString), listType);
    }

    public List<Album> getAlbum() {
        String urlString = "https://jsonplaceholder.typicode.com/albums";
        Type listType = new TypeToken<ArrayList<Album>>() {
        }.getType();
        return new Gson().fromJson(sendRequest(urlString), listType);
    }

    public List<Photo> getPhoto() {
        String urlString = "https://jsonplaceholder.typicode.com/photos";
        Type listType = new TypeToken<ArrayList<Photo>>() {
        }.getType();
        return new Gson().fromJson(sendRequest(urlString), listType);
    }

    public List<User> getUser() {
        String urlString = "https://jsonplaceholder.typicode.com/users";
        Type listType = new TypeToken<ArrayList<User>>() {
        }.getType();
        return new Gson().fromJson(sendRequest(urlString), listType);
    }

    public List<Todo> getTodo() {
        String urlString = "https://jsonplaceholder.typicode.com/todos";
        Type listType = new TypeToken<ArrayList<Todo>>() {
        }.getType();
        return new Gson().fromJson(sendRequest(urlString), listType);
    }
}
