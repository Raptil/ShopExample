package com.Shop.dao;

import com.Shop.domain.Basket;
import org.springframework.stereotype.Repository;

@Repository("BaksetDao")
public class BasketDao extends CRUDDao<Basket> {

    public BasketDao(){super(Basket.class);}
}
