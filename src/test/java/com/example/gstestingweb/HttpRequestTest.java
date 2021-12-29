package com.example.gstestingweb;

import static org.mockito.ArgumentMatchers.contains;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void greetingShouldReturnDefaultMessage() throws Exception {
        Assertions.assertThat(restTemplate.getForObject("http://localhost:" + 
            port + "/greeting", String.class)).contains("world");
    }

    @Test
    void greetingShouldReturnNameAsMessage() throws Exception {
        final String name = "java";

        Assertions.assertThat(restTemplate.getForObject("http://localhost:" + 
            port + "/greeting?name=" + name, String.class)).contains("world");
    }
}
