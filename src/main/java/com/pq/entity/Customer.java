package com.pq.entity;

import com.pq.visitor.Visitor;

/**
 * @author github:xixihaha888
 * @data
 **/
public abstract class Customer {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public abstract void accpet(Visitor visitor);
}
