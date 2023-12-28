package eanudaan.gov.in.web.scheme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "ngo_details")
public class NgoDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long ngodetailsId;

	@Column(name = "complete_address")
	private String completeAddress;

	@Column(name = "city")
	private String city;

	@Column(name = "district_master_id")
	private String districtMasterid;

	@Column(name = "code1")
	private String code1;

	@Column(name = "phone1")
	private String phone1;

	@Column(name = "code2")
	private String code2;

	@Column(name = "phone2")
	private String phone2;

	@Column(name = "mobile")
	private String mobile;

	@Column(name = "email")
	private String email;

	@Column(name = "fax_code")
	private String faxCode;

	@Column(name = "fax_number")
	private String faxNumber;

	@Column(name = "url")
	private String url;

	@Column(name = "states_master_id")
	private String statesMasterId;

	@Column(name = "remarks")
	private String remarks;

	public Long getNgodetailsId() {
		return ngodetailsId;
	}

	public void setNgodetailsId(Long ngodetailsId) {
		this.ngodetailsId = ngodetailsId;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrictMasterid() {
		return districtMasterid;
	}

	public void setDistrictMasterid(String districtMasterid) {
		this.districtMasterid = districtMasterid;
	}

	public String getCode1() {
		return code1;
	}

	public void setCode1(String code1) {
		this.code1 = code1;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFaxCode() {
		return faxCode;
	}

	public void setFaxCode(String faxCode) {
		this.faxCode = faxCode;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getStatesMasterId() {
		return statesMasterId;
	}

	public void setStatesMasterId(String statesMasterId) {
		this.statesMasterId = statesMasterId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "NgoDetails [ngodetailsId=" + ngodetailsId + ", completeAddress=" + completeAddress + ", city=" + city
				+ ", districtMasterid=" + districtMasterid + ", code1=" + code1 + ", phone1=" + phone1 + ", code2="
				+ code2 + ", phone2=" + phone2 + ", mobile=" + mobile + ", email=" + email + ", faxCode=" + faxCode
				+ ", faxNumber=" + faxNumber + ", url=" + url + ", statesMasterId=" + statesMasterId + ", remarks="
				+ remarks + "]";
	}

}
