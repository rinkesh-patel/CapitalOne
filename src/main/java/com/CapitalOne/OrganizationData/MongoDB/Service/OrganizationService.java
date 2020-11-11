package com.CapitalOne.OrganizationData.MongoDB.Service;

import com.CapitalOne.OrganizationData.MongoDB.Entity.Organization;

import java.util.List;
import java.util.Optional;

public interface OrganizationService {

    Organization saveOrgData(Organization organization);

    List<Organization> getListOfOrganization();

    Optional<Organization> getOrganizationById(int id);
}
