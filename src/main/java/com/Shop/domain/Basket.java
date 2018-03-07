package com.Shop.domain;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="baskets")
public class Basket implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="basketId")
    private int basketId;
    @ManyToOne
    @JoinColumn(name="userId")
    private User userId;
    @OneToMany(mappedBy = "basket",fetch = FetchType.LAZY)
    private List<Product> products;

    public int getBasketId() {
        return basketId;
    }

    public void setBasketId(int basketId) {
        this.basketId = basketId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "basketId=" + basketId +
                ", userId=" + userId +
                ", products=" + products +
                '}';
    }
}
