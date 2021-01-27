package com.dilanka_a;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    private int cid;
    private String address;
    private String name;

    public Customer() {
    }

    public Customer(int cid, String address, String name) {
        this.cid = cid;
        this.address = address;
        this.name = name;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
