package com.CapitalOne.OrganizationData.MongoDB.Service;

import com.CapitalOne.OrganizationData.MongoDB.Entity.Organization;
import com.CapitalOne.OrganizationData.MongoDB.repository.OrganizationRepositoryMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrganizationServiceImplMongo implements OrganizationService {
    
    @Autowired
    OrganizationRepositoryMongo organizationRepositoryMongo;

    @Override
    public Organization saveOrgData(Organization organization) {
        return organizationRepositoryMongo.save(organization);
    }

    @Override
    public List<Organization> getListOfOrganization() {
        return organizationRepositoryMongo.findAll();
    }

    @Override
    public Optional<Organization> getOrganizationById(int id) {
        return organizationRepositoryMongo.findByOrgId(id);
    }
}
