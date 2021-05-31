package ru.internet.shop.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Order extends AbstractModel{

    private final Map<Product, Integer> productAndCountMap = new HashMap<>();

    private Float totalPrice;

    private Date dateCreated;

    private Date dateReceived;

    private User client;

    private SystemPayment systemPayment;

    private DeliveryCompany deliveryCompany;

    private Status status;

    private String comment;

    public Map<Product, Integer> getProductAndCountMap() {
        return productAndCountMap;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Date dateReceived) {
        this.dateReceived = dateReceived;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public SystemPayment getSystemPayment() {
        return systemPayment;
    }

    public void setSystemPayment(SystemPayment systemPayment) {
        this.systemPayment = systemPayment;
    }

    public DeliveryCompany getDeliveryCompany() {
        return deliveryCompany;
    }

    public void setDeliveryCompany(DeliveryCompany deliveryCompany) {
        this.deliveryCompany = deliveryCompany;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Order order = (Order) o;

        if (!productAndCountMap.equals(order.productAndCountMap))
            return false;
        if (!Objects.equals(totalPrice, order.totalPrice)) return false;
        if (!Objects.equals(dateCreated, order.dateCreated)) return false;
        if (!Objects.equals(dateReceived, order.dateReceived)) return false;
        if (!Objects.equals(client, order.client)) return false;
        if (!Objects.equals(systemPayment, order.systemPayment))
            return false;
        if (!Objects.equals(deliveryCompany, order.deliveryCompany))
            return false;
        if (status != order.status) return false;
        return Objects.equals(comment, order.comment);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + productAndCountMap.hashCode();
        result = 31 * result + (totalPrice != null ? totalPrice.hashCode() : 0);
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        result = 31 * result + (dateReceived != null ? dateReceived.hashCode() : 0);
        result = 31 * result + (client != null ? client.hashCode() : 0);
        result = 31 * result + (systemPayment != null ? systemPayment.hashCode() : 0);
        result = 31 * result + (deliveryCompany != null ? deliveryCompany.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productAndCountMap=" + productAndCountMap +
                ", totalPrice=" + totalPrice +
                ", dateCreated=" + dateCreated +
                ", dateReceived=" + dateReceived +
                ", client=" + client +
                ", systemPayment=" + systemPayment +
                ", deliveryCompany=" + deliveryCompany +
                ", status=" + status +
                ", comment='" + comment + '\'' +
                '}';
    }
}
