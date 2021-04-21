package net.zsoo.springdemo.controller;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoConfig config;

    @GetMapping("/get")
    public Map<String, String> httpGet() {
        try {
            var client = HttpClient.newHttpClient();
            var get = HttpRequest.newBuilder(URI.create(config.getGetUrl())).GET().build();
            var resp = client.sendAsync(get, HttpResponse.BodyHandlers.ofString());
            var text = resp.thenApply(HttpResponse::body).get();
            return Map.of("html", text);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }
}
