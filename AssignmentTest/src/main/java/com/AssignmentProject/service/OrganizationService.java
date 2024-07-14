package com.AssignmentProject.service;

import com.AssignmentProject.ResponseDto.OrganizationDto;

public interface OrganizationService {

	OrganizationDto createOrganization(OrganizationDto organizationDto);
	OrganizationDto getOrganizationById(Long id);
	OrganizationDto updateOrganization(Long id, OrganizationDto organizationDto);

}
