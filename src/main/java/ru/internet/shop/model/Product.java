package ru.internet.shop.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product extends AbstractNamedModel{
    private Float price;

    private final List<Image> images = new ArrayList<>();

    private boolean available;

    private Integer count;

    private List<Option> options;

    private String SeoDescription;

    private String SeoKeyWords;

    private Language language;

    private ProductCategory category;

    private Manufacturer manufacturer;

    private String description;

    public Product(String name, Float price, Integer count, List<Option> options, Language language,
                   ProductCategory category, Manufacturer manufacturer, String description) {
        super(name);
        this.price = price;
        this.count = count;
        this.options = options;
        this.language = language;
        this.category = category;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public void addImage(Image image) {
        this.images.add(image);
    }

    public void addImages(List<Image> images) {
        this.images.addAll(images);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(Image image) {
        this.images.add(image);
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public String getSeoDescription() {
        return SeoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        SeoDescription = seoDescription;
    }

    public String getSeoKeyWords() {
        return SeoKeyWords;
    }

    public void setSeoKeyWords(String seoKeyWords) {
        SeoKeyWords = seoKeyWords;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Product product = (Product) o;

        if (available != product.available) return false;
        if (!Objects.equals(name, product.name)) return false;
        if (!Objects.equals(description, product.description)) return false;
        if (!images.equals(product.images)) return false;
        if (!Objects.equals(price, product.price)) return false;
        if (!Objects.equals(count, product.count)) return false;
        if (!Objects.equals(options, product.options)) return false;
        if (!Objects.equals(SeoDescription, product.SeoDescription))
            return false;
        if (!Objects.equals(SeoKeyWords, product.SeoKeyWords)) return false;
        if (!Objects.equals(language, product.language)) return false;
        if (!Objects.equals(category, product.category)) return false;
        return Objects.equals(manufacturer, product.manufacturer);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + images.hashCode();
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (available ? 1 : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + (options != null ? options.hashCode() : 0);
        result = 31 * result + (SeoDescription != null ? SeoDescription.hashCode() : 0);
        result = 31 * result + (SeoKeyWords != null ? SeoKeyWords.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", images=" + images +
                ", available=" + available +
                ", count=" + count +
                ", options=" + options +
                ", SeoDescription='" + SeoDescription + '\'' +
                ", SeoKeyWords='" + SeoKeyWords + '\'' +
                ", language=" + language +
                ", category=" + category +
                ", manufacturer=" + manufacturer +
                ", description='" + description + '\'' +
                '}';
    }
}
