package com.AssignmentProject.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class OrganizationDto {

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

}
