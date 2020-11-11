package com.CapitalOne.OrganizationData.RelationalDB.Controller;

import com.CapitalOne.OrganizationData.RelationalDB.Entity.Customer;
import com.CapitalOne.OrganizationData.RelationalDB.Entity.Organization;
import com.CapitalOne.OrganizationData.RelationalDB.Service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class OrganizationDataController {

    @Autowired
    OrganizationService organizationService;

    @PostMapping("/setData")
    public ResponseEntity<Organization> setData(@Valid @RequestBody Organization organization){
        return ResponseEntity.ok(organizationService.saveOrgData(organization));
    }

    @GetMapping("/getOrg")
    public ResponseEntity<List<Organization>> getOrg () throws  Exception {
        return ResponseEntity.ok(organizationService.getListOfOrganization());
    }

    @GetMapping("/getOrg/{orgId}/customer")
    public ResponseEntity<List<Customer>> getCustomersOfOrg (@PathVariable int orgId) throws  Exception {
        return ResponseEntity.ok(organizationService.getListOfCustomerOfOrg(orgId));
    }

    @GetMapping("/getOrg/{orgId}/customer/{custId}/specData")
    public ResponseEntity<Customer> getSpecificCustomer (@PathVariable int orgId, @PathVariable int custId) throws  Exception {
        return ResponseEntity.ok(organizationService.getSpecificCustomer(orgId, custId));
    }

    @GetMapping("/getListOfCustomer")
    public ResponseEntity<List<Customer>>getSpecificCustomerByIDs (@RequestParam int[] custIds) throws  Exception {
        return ResponseEntity.ok(organizationService.listOfCustomerByIds(custIds));
    }

}
