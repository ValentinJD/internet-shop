package ru.internet.shop.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractNamedModel extends AbstractModel{

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
