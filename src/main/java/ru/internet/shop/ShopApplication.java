package ru.internet.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);

        System.out.println("Бины:");
        Arrays.stream(MyTestContext.getContext().getBeanDefinitionNames()).forEach(System.out::println);
    }
}
