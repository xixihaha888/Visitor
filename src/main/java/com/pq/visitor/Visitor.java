package com.pq.visitor;

import com.pq.entity.CompanyCustomer;
import com.pq.entity.PersonCustomer;

/**
 * @author github:xixihaha888
 * @data
 **/
public interface Visitor {
    void personCustomerFunction(PersonCustomer personCustomer);

    void companyCustomerFunction(CompanyCustomer companyCustomer);
}
