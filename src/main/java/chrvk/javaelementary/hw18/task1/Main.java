package chrvk.javaelementary.hw18.task1;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class Main {
    public static String url
            = "https://dl.dropboxusercontent.com/s/vxnydq4xjkmefrp/CLUVAL.java";

    public static String getSize(int counter) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .head()
                .build();
        try {
            Response response = client.newCall(request).execute();
            String temp = String.valueOf(response
                            .headers("Content-Length"))
                    .replaceAll("[^0-9]+", "");
            int size = Integer.parseInt(temp) / 2;
            if (counter == 1) {
                return "bytes=1-" + size;
            } else if (counter == 2) {
                return "bytes=" + size + "-" + temp;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String readFile(String size) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .get()
                .header("Range", size)
                .build();
        Call call = client.newCall(request);

        try {
            Response response = call.execute();
            if (response.body() != null) {
                return response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {

        int firstHalf = 1;
        int secondHalf = 2;

        String size = getSize(firstHalf);
        System.out.println(readFile(size));

        System.out.println("------------------------");

        size = getSize(secondHalf);
        System.out.println(readFile(size));
    }
}
