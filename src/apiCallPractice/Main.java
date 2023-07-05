package apiCallPractice;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://the-one-api.dev/v2/book"))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = null;

        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        assert response != null;
        System.out.print(response.body());
    }
}
