package com.CapitalOne.OrganizationData.repository;

import com.CapitalOne.OrganizationData.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query(value = "Select * From Customer c where c.org_id = :orgId", nativeQuery = true)
    List<Customer> findAllCustomerByOrganizatio ( int orgId);

    @Query(value = "Select * From Customer c where c.org_id = :orgId and c.cust_id = :custId", nativeQuery = true)
    Customer findByCustIdAndOrganizatio (int orgId, int custId);

    Customer findById (int id);
}
