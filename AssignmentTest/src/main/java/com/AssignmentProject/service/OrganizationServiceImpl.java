package com.AssignmentProject.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AssignmentProject.Entity.Organizations;
import com.AssignmentProject.Repo.OrganizationRepository;
import com.AssignmentProject.ResponseDto.OrganizationDto;
import com.AssignmentProject.payload.ResourceNotFoundException;

@Service
public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	private OrganizationRepository organizationRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
    public Organizations dtoToEntity(OrganizationDto dto) {
        return modelMapper.map(dto, Organizations.class);
    }

    public OrganizationDto entityToDto(Organizations entity) {
        return modelMapper.map(entity, OrganizationDto.class);
    }

	@Override
	public OrganizationDto createOrganization(OrganizationDto organizationDto) {
		 Organizations organizations = dtoToEntity(organizationDto);
		 Organizations savedOrganizations = organizationRepository.save(organizations);
		return entityToDto(savedOrganizations);
	}

	@Override
	public OrganizationDto getOrganizationById(Long id) {
		Organizations organizations = organizationRepository.findById(id).orElseThrow(
				 ()-> new ResourceNotFoundException("Organization not found with id: " + id)
				);
	   return modelMapper.map(organizations, OrganizationDto.class);
	}

	@Override
	public OrganizationDto updateOrganization(Long id, OrganizationDto organizationDto) {
		Organizations organizations = organizationRepository.findById(id).orElseThrow(
				 ()-> new ResourceNotFoundException("Organization not found with id: " + id)
				);
		
		organizations.setAddress(organizationDto.getAddress())
		             .setCompany_land_line(organizationDto.getCompany_land_line())
		             .setCompany_size(organizationDto.getCompany_size());
		
		Organizations updatedOrganizations = organizationRepository.save(organizations);		
		return modelMapper.map(updatedOrganizations, OrganizationDto.class);
	}

}
