package ru.internet.shop.model;

import java.util.Objects;

public abstract class AbstractNamedModel extends AbstractModel{
    protected String name;

    public AbstractNamedModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        AbstractNamedModel that = (AbstractNamedModel) o;

        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AbstractNamedModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
