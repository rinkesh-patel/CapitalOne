package com.CapitalOne.OrganizationData.RelationalDB.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Organization {

    public  Organization(){}

    public Organization(String name){
        this.orgName = name;
    }

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public int orgId;

    public int getId() {
        return orgId;
    }

    public void setId(int id) {
        this.orgId = id;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String orgName;

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }

    @OneToMany(targetEntity = Customer.class, cascade=CascadeType.ALL)
    @JoinColumn (name = "ORG_ID", referencedColumnName = "orgId")
    public List<Customer> customer;

}
