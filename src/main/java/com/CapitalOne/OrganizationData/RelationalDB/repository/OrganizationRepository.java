package com.CapitalOne.OrganizationData.RelationalDB.repository;

import com.CapitalOne.OrganizationData.RelationalDB.Entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Integer> {
}
