package com.AssignmentProject.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Entity
@Table(name = "Organizations")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Organizations {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;	
	private String company_name;
	private String industry_type;
	private String address;
	private String sub_industry;
	private String location;
	private Double lat;
	private Double lon;
	private String company_linkedin_link;
	private String company_land_line;
	private String website;
	private String company_size;
	private String region;
	private Long person_id;
	private Boolean is_active;
	private Boolean is_selectable;
	
	private LocalDateTime createdOn;
	private LocalDateTime updatedOn;
	
	@PrePersist
	 protected void onCreate() {
	        createdOn = LocalDateTime.now();
	    }

	 @PreUpdate
	 protected void onUpdate() {
	        updatedOn = LocalDateTime.now();
	    }
	
	
	
	

}
