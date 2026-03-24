package com.baohc.ProductService.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "proOrder")
    private int proOrder;

    @Column(name = "isActive")
    private boolean isActive;

    public Product() {
    }

    public Product(int id, String name, int proOrder, boolean isActive) {
        this.id = id;
        this.name = name;
        this.proOrder = proOrder;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProOrder() {
        return proOrder;
    }

    public void setProOrder(int proOrder) {
        this.proOrder = proOrder;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", proOrder=" + proOrder +
                ", isActive=" + isActive +
                '}';
    }
}
