package com.pq.entity;

import com.pq.visitor.Visitor;

/**
 * @author github:xixihaha888
 * @data
 **/
public class PersonCustomer extends Customer {
    @Override
    public void accpet(Visitor visitor) {
          visitor.personCustomerFunction(this);
    }
}
