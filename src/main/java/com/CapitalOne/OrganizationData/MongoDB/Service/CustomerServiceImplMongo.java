package com.CapitalOne.OrganizationData.MongoDB.Service;

import com.CapitalOne.OrganizationData.MongoDB.Entity.Customer;
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
    public Customer saveCustData(Customer customer) {
        return customerRepositoryMongo.save(customer);
    }

    @Override
    public List<Customer> getListOfCustomer() {
        return customerRepositoryMongo.findAll();
    }

    @Override
    public Optional<Customer> getCustomerById(int id) {
        return customerRepositoryMongo.findByCustId(id);
    }
}
