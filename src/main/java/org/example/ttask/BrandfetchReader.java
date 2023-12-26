package org.example.ttask;

import org.json.JSONObject;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BrandfetchReader {
    private static final String API_KEY =
            "LRxkiYwq6GrmW4S8jvcHR7nrSVxHai0DNsa/b5sopZA=";

    public static JSONObject fetchCompanyData(String domain)
            throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.brandfetch.io/v2/brands/"
                        + domain))
                .header("accept", "application/json")
                .header("Authorization", "Bearer " + API_KEY)
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());

        return new JSONObject(response.body());
    }
}
