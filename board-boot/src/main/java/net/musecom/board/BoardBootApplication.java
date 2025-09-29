package net.musecom.board;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("net.musecom.board.mapper")
public class BoardBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BoardBootApplication.class, args);
    }
}
