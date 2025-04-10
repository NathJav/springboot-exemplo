package br.pucrs.avilanathalie.exemplospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.pucrs.avilanathalie.exemplospringboot")
public class SpringbootExemploApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootExemploApplication.class, args);
    }
}
