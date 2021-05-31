package ru.internet.shop.model;

public enum OrderStatus {
    PROCESS("Заказ в процессе оформления"),
    CREATED("Заказ создан"),
    PRODUCT_RESERVED("Товар зарезервирован"),
    PAID("Деньги поступили"),
    ARRIVED_IN_MARKET("Товар поступил в магазин"),
    RECEIVED("Заказ выдан");

    public String msg;

    OrderStatus(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
