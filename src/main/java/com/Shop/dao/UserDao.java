package com.Shop.dao;

import com.Shop.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository("UserDao")
public class UserDao extends CRUDDao<User>{

    public UserDao(){ super(User.class);}

}
