package com.AssignmentProject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AssignmentProject.Entity.Organizations;

public interface OrganizationRepository extends JpaRepository<Organizations, Long> {

}
