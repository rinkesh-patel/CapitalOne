package com.CapitalOne.OrganizationData.RelationalDB.Service;

import com.CapitalOne.OrganizationData.RelationalDB.Entity.Customer;
import com.CapitalOne.OrganizationData.RelationalDB.Entity.Organization;
import com.CapitalOne.OrganizationData.RelationalDB.repository.CustomerRepository;
import com.CapitalOne.OrganizationData.RelationalDB.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    CustomerRepository customerRepository;
    
    @Autowired
    OrganizationRepository organizationRepository;

    @Override
    public Organization saveOrgData(Organization organization) {
        return organizationRepository.save(organization);
    }

    @Override
    public List<Organization> getListOfOrganization() {
        return organizationRepository.findAll();
    }


    @Override
    public List<Customer> getListOfCustomerOfOrg(int orgId) {
        return customerRepository.findAllCustomerByOrganizatio(orgId);
    }



    @Override
    public Customer getSpecificCustomer(int orgId, int custId) {
        return customerRepository.findByCustIdAndOrganizatio(custId, orgId);
    }


    @Override
    public List<Customer> listOfCustomerByIds(int[] customerIds) {
        List<Customer> customerList = new ArrayList<>();
        for (int id : customerIds) {
            customerList.add(customerRepository.findById(id));
        }
        return customerList;
    }
}
