package com.CapitalOne.OrganizationData.MongoDB.Controller;

import com.CapitalOne.OrganizationData.MongoDB.Entity.CustomerMongo;
import com.CapitalOne.OrganizationData.MongoDB.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mongo/cust")
public class CustomerDataControllerMongo {

    @Autowired
    CustomerService customerService;

    @PostMapping("/setData")
    public ResponseEntity<CustomerMongo> setData(@Valid @RequestBody CustomerMongo customerMongo){
        return ResponseEntity.ok(customerService.saveCustData(customerMongo));
    }

    @GetMapping("/getCust")
    public ResponseEntity<List<CustomerMongo>> getOrg () throws  Exception {
        return ResponseEntity.ok(customerService.getListOfCustomer());
    }

    @GetMapping("/getCust/{custId}")
    public ResponseEntity<Optional<CustomerMongo>> getCustById (@PathVariable String custId) throws  Exception {
        return ResponseEntity.ok(customerService.getCustomerById(custId));
    }
}
