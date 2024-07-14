package com.AssignmentProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AssignmentProject.ResponseDto.OrganizationDto;
import com.AssignmentProject.service.OrganizationService;

@RestController
@RequestMapping("/api/organizations")
public class OrganizationController {

	@Autowired
	private OrganizationService organizationService;

	@PostMapping
	public ResponseEntity<OrganizationDto> createOrganization(@RequestBody OrganizationDto organizationDto) {
		OrganizationDto responseDto = organizationService.createOrganization(organizationDto);
		return new ResponseEntity<>(responseDto, HttpStatus.CREATED);

	}

	@GetMapping("/{id}")
	public ResponseEntity<OrganizationDto> getOrganizationById(@PathVariable Long id) {
		OrganizationDto responseDto = organizationService.getOrganizationById(id);
		return new ResponseEntity<>(responseDto, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<OrganizationDto> updateOrganizationById(@PathVariable Long id,
			@RequestBody OrganizationDto organizationDto) {
		OrganizationDto responseDto = organizationService.updateOrganization(id, organizationDto);
		return new ResponseEntity<>(responseDto, HttpStatus.OK);
	}

}
