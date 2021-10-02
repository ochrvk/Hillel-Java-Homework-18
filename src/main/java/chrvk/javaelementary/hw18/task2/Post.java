package chrvk.javaelementary.hw18.task2;

import com.google.gson.annotations.SerializedName;

public class Post {

    public Form form;
    public Headers headers;
    public Json json;
    public String url;

    private static class Form {
        public String foo1;
        public String foo2;

        @Override
        public String toString() {
            return "{\n" +
                    "       \"foo1\": " + '\"' + foo1 + '\"' +
                    "\n       \"foo2\": " + '\"' + foo2 + '\"' +
                    "\n   }";
        }
    }

    private static class Json {
        public String foo1;
        public String foo2;

        @Override
        public String toString() {
            return "{" +
                    "\n     \"foo1\": " + '\"' + foo1 + '\"' +
                    "\n     \"foo2\": " + '\"' + foo2 + '\"' +
                    "\n   }";
        }
    }

    private static class Headers {
        @SerializedName("x-forwarded-proto")
        public String xForwardedProto;
        @SerializedName("x-forwarded-port")
        public String xForwardedPort;
        public String host;
        @SerializedName("x-amzn-trace-id")
        public String xAmznTraceId;
        @SerializedName("content-length")
        public String contentLength;
        @SerializedName("user-agent")
        public String userAgent;
        public String accept;
        @SerializedName("content-type")
        public String contentType;

        @Override
        public String toString() {
            return "{" +
                    "\n     \"x-forwarded-proto\": \"" + xForwardedProto + '\"' +
                    "\n     \"x-forwarded-port\": \"" + xForwardedPort + '\"' +
                    "\n     \"host\": \"" + host + '\"' +
                    "\n     \"x-amzn-trace-id\": \"" + xAmznTraceId + '\"' +
                    "\n     \"content-length\": \"" + contentLength + '\"' +
                    "\n     \"user-agent\": \"" + userAgent + '\"' +
                    "\n     \"accept\": \"" + accept + '\"' +
                    "\n     \"content-type\": \"" + contentType + '\"' +
                    "\n   }";
        }
    }

    @Override
    public String toString() {
        return "{" +
                "\n   \"form\": " + form +
                "\n   \"headers\": " + headers +
                "\n   \"json\": " + json +
                "\n   \"url\": " + "\"" + url + '\"' +
                "\n}";
    }
}
