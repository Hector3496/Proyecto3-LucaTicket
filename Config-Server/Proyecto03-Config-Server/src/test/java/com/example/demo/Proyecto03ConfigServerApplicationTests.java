package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class Proyecto03ConfigServerApplicationTests {

    @Autowired
    public Proyecto03ConfigServerApplication proyecto;
    @Test
    void contextLoads() {
        
        assertThat(proyecto).isNotNull();
    }
    

}