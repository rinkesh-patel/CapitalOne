package com.CapitalOne.OrganizationData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.CapitalOne.OrganizationData.repository.OrganizationRepository;

@SpringBootApplication
public class OrganizationDataApplication {

    @Autowired
    private OrganizationRepository organizationRepository;

	public static void main(String[] args) {
		SpringApplication.run(OrganizationDataApplication.class, args);
	}
}
