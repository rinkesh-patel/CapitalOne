package com.CapitalOne.OrganizationData.MongoDB.repository;

import com.CapitalOne.OrganizationData.MongoDB.Entity.Organization;
import com.CapitalOne.OrganizationData.RelationalDB.Entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrganizationRepositoryMongo extends MongoRepository<Organization, Integer> {

    Optional<Organization> findByOrgId (int orgId);
}
