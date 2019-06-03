package com.pq.visitor;

import com.pq.entity.CompanyCustomer;
import com.pq.entity.PersonCustomer;

/**
 * @author github:xixihaha888
 * @data
 **/
public class OrderFoodImpl implements Visitor {
    @Override
    public void personCustomerFunction(PersonCustomer personCustomer) {
        System.out.println("个人客户"+personCustomer.getUsername()+"点餐了");
    }

    @Override
    public void companyCustomerFunction(CompanyCustomer companyCustomer) {
        System.out.println("企业客户"+companyCustomer.getUsername()+"点餐了");
    }
}
