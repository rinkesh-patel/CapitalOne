package com.CapitalOne.OrganizationData.MongoDB.Entity;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

@Document
public class Organization {

    public  Organization(){}

    public Organization(String name){
        this.orgName = name;
    }

    @Id
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

    public List<CustomerMongo> getCustomerMongo() {
        return customerMongo;
    }

    public void setCustomerMongo(List<CustomerMongo> customerMongo) {
        this.customerMongo = customerMongo;
    }

    public String orgName;

    @DBRef
    public List<CustomerMongo> customerMongo;
}
