package ru.internet.shop.model;

public enum Role {
    CLIENT("Покупатель"),
    MANAGER("Менеджер"),
    ADMIN("Администратор");

    Role(String name) {
    }

    public String getName() {
        return name();
    }
}
