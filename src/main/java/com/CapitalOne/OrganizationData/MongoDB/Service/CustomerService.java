package com.CapitalOne.OrganizationData.MongoDB.Service;

import com.CapitalOne.OrganizationData.MongoDB.Entity.CustomerMongo;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    CustomerMongo saveCustData(CustomerMongo organization);

    List<CustomerMongo> getListOfCustomer();

    Optional<CustomerMongo> getCustomerById(String id);
}
