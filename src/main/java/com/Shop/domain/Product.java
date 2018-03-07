package com.Shop.domain;



import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="products")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="productId")
    private int productId;
    @Column(name="name")
    @NotNull
    private int name;
    @Column(name="cost")
    @NotNull
    private int cost;
    @ManyToOne
    @JoinColumn(name="basketId")
    private Basket basket;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name=" + name +
                ", cost=" + cost +
                ", basket=" + basket +
                '}';
    }
}
