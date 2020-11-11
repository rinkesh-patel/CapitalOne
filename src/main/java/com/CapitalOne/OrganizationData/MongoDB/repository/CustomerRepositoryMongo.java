package com.CapitalOne.OrganizationData.MongoDB.repository;

import com.CapitalOne.OrganizationData.MongoDB.Entity.Customer;
import com.CapitalOne.OrganizationData.MongoDB.Entity.Organization;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepositoryMongo extends MongoRepository<Customer, Integer> {
    Optional<Customer> findByCustId (int custId);
}
