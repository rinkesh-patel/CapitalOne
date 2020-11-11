package com.CapitalOne.OrganizationData.MongoDB.Controller;

import com.CapitalOne.OrganizationData.MongoDB.Entity.Organization;
import com.CapitalOne.OrganizationData.MongoDB.Service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mongo/org")
public class OrganizationDataControllerMongo {

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

    @GetMapping("/getOrg/{orgId}")
    public ResponseEntity<Optional<Organization>> getOrgById (@PathVariable int orgId) throws  Exception {
        return ResponseEntity.ok(organizationService.getOrganizationById(orgId));
    }
}
