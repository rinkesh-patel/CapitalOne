package com.CapitalOne.OrganizationData.MongoDB.repository;

import com.CapitalOne.OrganizationData.MongoDB.Entity.CustomerMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepositoryMongo extends MongoRepository<CustomerMongo, Integer> {
    Optional<CustomerMongo> findById (String custId);
}
