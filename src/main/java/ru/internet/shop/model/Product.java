package ru.internet.shop.model;

import java.util.List;

public class Product extends AbstractModel{

    private String name;

    private String description;

    private Images images;

    private Float price;

    private boolean available;

    private Integer count;

    private List<Option> options;

    private String SeoDescription;

    private String SeoKeyWords;

    private Language language;

    private ProductCategory category;

    private Manufacturer manufacturer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
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
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        if (description != null ? !description.equals(product.description) : product.description != null) return false;
        if (images != null ? !images.equals(product.images) : product.images != null) return false;
        if (price != null ? !price.equals(product.price) : product.price != null) return false;
        if (count != null ? !count.equals(product.count) : product.count != null) return false;
        if (options != null ? !options.equals(product.options) : product.options != null) return false;
        if (SeoDescription != null ? !SeoDescription.equals(product.SeoDescription) : product.SeoDescription != null)
            return false;
        if (SeoKeyWords != null ? !SeoKeyWords.equals(product.SeoKeyWords) : product.SeoKeyWords != null) return false;
        if (language != null ? !language.equals(product.language) : product.language != null) return false;
        if (category != null ? !category.equals(product.category) : product.category != null) return false;
        return manufacturer != null ? manufacturer.equals(product.manufacturer) : product.manufacturer == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (images != null ? images.hashCode() : 0);
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
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", images=" + images +
                ", price=" + price +
                ", available=" + available +
                ", count=" + count +
                ", options=" + options +
                ", SeoDescription='" + SeoDescription + '\'' +
                ", SeoKeyWords='" + SeoKeyWords + '\'' +
                ", language=" + language +
                ", category=" + category +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
