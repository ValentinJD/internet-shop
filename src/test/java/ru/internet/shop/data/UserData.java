package ru.internet.shop.data;

import ru.internet.shop.model.Role;
import ru.internet.shop.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserData {

    public static final User user100002 = new User("ФестНейм", "ЛастНейм", "login", "pass", "911",
            "a@mmm.com");

    public static final User ADMIN_100000 = new User(100000, "Admin", "Adminov",
            "admin", "password", "+71234567890",
            "admin@gmail.com");

    public static final User USER_100001 = new User(100001, "User", "Userov",
            "user", "password", "+79999999999",
            "user@gmail.com");

    public static final List<User> USER_LIST = Arrays.asList(ADMIN_100000, USER_100001);


}
