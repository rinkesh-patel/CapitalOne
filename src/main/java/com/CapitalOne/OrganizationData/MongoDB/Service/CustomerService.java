package com.CapitalOne.OrganizationData.MongoDB.Service;

import com.CapitalOne.OrganizationData.MongoDB.Entity.Customer;
import com.CapitalOne.OrganizationData.MongoDB.Entity.Organization;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer saveCustData(Customer organization);

    List<Customer> getListOfCustomer();

    Optional<Customer> getCustomerById(int id);
}
