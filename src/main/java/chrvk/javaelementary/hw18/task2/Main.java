package chrvk.javaelementary.hw18.task2;

import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class Main {
    public static String urlParameters = "foo1=bar1&foo2=bar2";
    public static String urlString = "https://postman-echo.com/post";
    public static Gson gson = new Gson();

    public static Post sendPostRequest() {
        byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);
        int postDataLength = postData.length;

        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setInstanceFollowRedirects(false);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("charset", "utf-8");
            conn.setRequestProperty("Content-Length", Integer.toString(postDataLength));
            conn.setUseCaches(false);
            try (DataOutputStream wr = new DataOutputStream(conn.getOutputStream())) {
                wr.write(postData);
            }
            try (BufferedReader inputStream = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                String response;
                response = inputStream.lines().map(String::trim).collect(Collectors.joining());
                return gson.fromJson(response, Post.class);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Post post = sendPostRequest();
        System.out.println(post);
    }
}
