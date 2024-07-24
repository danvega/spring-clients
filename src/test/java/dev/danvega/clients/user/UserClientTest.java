package dev.danvega.clients.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.test.StepVerifier;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserClientTest {

    @Autowired
    private UserClient userClient;

    @Test
    void testFindAll() {
        StepVerifier.create(userClient.findAll())
                .expectNextCount(10)
                .verifyComplete();
    }

}