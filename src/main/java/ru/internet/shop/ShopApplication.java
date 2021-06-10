package ru.internet.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.internet.shop.repository.UserRepository;

@SpringBootApplication
public class ShopApplication {

    private static ApplicationContext context = null;

    public ShopApplication(ApplicationContext context) {
        ShopApplication.context = context;
    }


    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);

//        System.out.println("Бины:");
//        Arrays.stream(MyTestContext.getContext().getBeanDefinitionNames()).forEach(System.out::println);

        UserRepository repository = context.getBean(UserRepository.class);
        System.out.println("Список юзеров: \n" + repository.findAll());
    }
}
