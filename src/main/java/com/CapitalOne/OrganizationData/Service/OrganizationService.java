package com.CapitalOne.OrganizationData.Service;

import com.CapitalOne.OrganizationData.Entity.Customer;
import com.CapitalOne.OrganizationData.Entity.Organization;

import java.util.List;

public interface OrganizationService {

    Organization saveOrgData (Organization organization);

    List<Organization> getListOfOrganization ();

    List<Customer> getListOfCustomerOfOrg (int orgId);

    Customer getSpecificCustomer (int orgId, int custId);

    List<Customer> listOfCustomerByIds (int[] customerIds);

}
