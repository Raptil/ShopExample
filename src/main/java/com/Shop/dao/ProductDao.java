package com.Shop.dao;

import com.Shop.domain.Product;
import org.springframework.stereotype.Repository;

@Repository("ProductDao")
public class ProductDao extends CRUDDao<Product> {

    public ProductDao(){ super(Product.class);}
}
