package eanudaan.gov.in.web.scheme.dto;

import jakarta.persistence.Column;

public interface NgoFormApplicationDto {
	
	@Column(name="id")
	public Long ngodetailsId(); 
	
	@Column( name = "complete_address")
	public String CompleteAddress();
	
	@Column(name="city")
	public String City();
	
	@Column(name="district_master_id")
	public String DistrictMasterid();
	
	
	@Column(name="code1")
	public String Code1();
	
	@Column(name="phone1")
	public String Phone1();


	@Column(name="code2")
	public String Code2();

	
	@Column(name="phone2")
	public String Phone2();

	@Column(name="mobile")
	public String mobile();
	

	@Column(name="email")
	public String Email();
	
	@Column(name="fax_code")
	public String faxCode();

	@Column(name="fax_number")
	public String faxNumber();
	
	@Column(name="url")
	public String Url();
	
	
	@Column(name="states_master_id")
	public String statesMasterId();
	
	@Column(name="remarks")
	public String Remarks();	


}
