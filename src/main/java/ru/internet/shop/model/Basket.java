package ru.internet.shop.model;

import java.util.*;

public class Basket extends AbstractModel{
    private User client;

    private final Map<Product, Integer> itemList = new HashMap<>();

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public Map<Product, Integer> getItemList() {
        return itemList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Basket basket = (Basket) o;

        if (!Objects.equals(client, basket.client)) return false;
        return itemList.equals(basket.itemList);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (client != null ? client.hashCode() : 0);
        result = 31 * result + itemList.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "id=" + id +
                ", client=" + client +
                ", itemList=" + itemList +
                '}';
    }
}
