package dev.danvega.clients.album;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AlbumClientTest {

    @Autowired
    AlbumClient client;

    @Test
    void testFindAll() {
        List<Album> albums = client.findAll();
        assertEquals(100,albums.size());
    }
}
