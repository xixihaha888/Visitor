package com.pq.demo;

import com.pq.entity.PersonCustomer;
import com.pq.visitor.OrderFoodImpl;

/**
 * @author github:xixihaha888
 * @data
 **/
public class TestDemo {
    public static void main(String[] args){
        PersonCustomer personCustomer =new PersonCustomer();
        personCustomer.setUsername("zhangsan");
        personCustomer.accpet(new OrderFoodImpl());
    }


}
