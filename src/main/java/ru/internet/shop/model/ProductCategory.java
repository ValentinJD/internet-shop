package ru.internet.shop.model;

import java.util.HashSet;
import java.util.Set;

public class ProductCategory extends AbstractNamedModel{

    private Image image;

    private final Set<Product> products = new HashSet<>();

    public ProductCategory(String name, Image image) {
        super(name);
        this.image = image;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProducts(Set<Product> productList) {
        products.addAll(productList);
    }


}
