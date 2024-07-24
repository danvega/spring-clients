package dev.danvega.clients.todo;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class TodoClient {

    private final RestTemplate restTemplate;

    public TodoClient(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public List<Todo> findAll() {
        return restTemplate.exchange(
                "https://jsonplaceholder.typicode.com/todos",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Todo>>() {}
        ).getBody();
    }

}