package eanudaan.gov.in.web.scheme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="msje_ddrs_ngo_bank_details_of_grants")
@Data
public class NgoBankDetailsGrant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int ngoBankDetailsID;
	
	@Column(name="santion_letter_no")
	private String Santionletterno;
	
	
	@Column(name="dated")
	private String Dated;

	@Column(name="recurring_amount")
	private String NonRecurringAmount;
	
	@Column(name="bank_account_no")
	private String BankAccountNo;
	
	@Column(name="name_and_address_of_bank")
	private String NameandAddressofBank;
	
	@Column(name="person_operating_joint_accnt")
	private String PersonOperatingJointAccnt;
	
	@Column(name="msje_ngo_proposal_form_id")
	private String NgoProposalFormId;
	
	
}
