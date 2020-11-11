package com.CapitalOne.OrganizationData.MongoDB.Service;

import com.CapitalOne.OrganizationData.MongoDB.Entity.CustomerMongo;
import com.CapitalOne.OrganizationData.MongoDB.repository.CustomerRepositoryMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImplMongo implements CustomerService {

    @Autowired
    CustomerRepositoryMongo customerRepositoryMongo;

    @Override
    public CustomerMongo saveCustData(CustomerMongo customerMongo) {
        return customerRepositoryMongo.save(customerMongo);
    }

    @Override
    public List<CustomerMongo> getListOfCustomer() {
        return customerRepositoryMongo.findAll();
    }

    @Override
    public Optional<CustomerMongo> getCustomerById(String id) {
        return customerRepositoryMongo.findById(id);
    }
}
