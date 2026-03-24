package com.baohc.ProductService.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotBlank(message = "Tên không được để trống")
    @Size(max = 64, message = "Tên không quá 64 ký tự")
    @Column(name = "name")
    private String name;

    @Min(value = 1, message = "Giá trị nên lớn hơn 0")
    @Column(name = "pro_order")
    private int pro_order;

    @Column(name = "is_active")
    private boolean is_active;

    public Product() {
    }

    public Product(int id, String name, int pro_order, boolean is_active) {
        this.id = id;
        this.name = name;
        this.pro_order = pro_order;
        this.is_active = is_active;
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

    public int getPro_order() {
        return pro_order;
    }

    public void setPro_order(int pro_order) {
        this.pro_order = pro_order;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pro_order=" + pro_order +
                ", is_active=" + is_active +
                '}';
    }
}
