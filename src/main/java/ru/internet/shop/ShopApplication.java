package ru.internet.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.internet.shop.model.User;
import ru.internet.shop.repository.UserRepository;

import java.util.List;

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

        // Тестируем UserRepository
//        UserRepository repository = context.getBean(UserRepository.class);
//
//        System.out.println("Список юзеров: \n" + repository.findAll());
//
//        User user = new User("ФестНейм", "ЛастНейм", "login", "pass", "911",
//                "a@mmm.com");
//
//
//        User userDB = repository.save(user);
//        System.out.println("Юзер из бд: " + userDB);
//
//
//        List<User> userList = repository.findAll();
//        System.out.println("Лист с новым юзером \n");
//        userList.forEach((System.out::println));
//
//        System.out.printf("Удаляем %s \n", userDB.getId());
//        repository.deleteById(userDB.getId());
//
//        System.out.println("Лист без нового юзера: \n");
//        repository.findAll().forEach((System.out::println));
//
//        User userAdmin = repository.findById(100000).get();
//
//        System.out.println("Получаем Юзера по id бд: " + userAdmin);

    }


}
