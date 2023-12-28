package eanudaan.gov.in.web.scheme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="msje_ddrs_beneficiaries_details")
@Data
public class DdrsBeneficiariesDetails {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private Long ddrsBeneficiariesDetailsId;
		
		@Column(name="benficiaries_head_title")
		private String BenficiariesHeadTitle;
		
		@Column(name="oh_male")
		private String OhMale;
		
		@Column(name="oh_female")
		private String OhFemale;
		
		@Column(name="mr_male")
		private String Mrmale;
		
		@Column(name="vh_male")
		private String Vhmale;
	
		@Column(name="vh_female")
		private String Vhfemale;
		
		@Column(name="hh_male")
		private String Hhmale;
		
		@Column(name="hh_female")
		private String Hhfemale;
		
		@Column(name="mr_female")
		private String Mrfemale;
		
		@Column(name="lcp_male")
		private String Lcpmale;
		
		@Column(name="lcp_female")
		private String Lcpfemale;
		
		@Column(name="multiple_disabled_male")
		private String MultipleDisabledMale;
		
		@Column(name="multiple_disabled_female")
		private String MultipleDisabledFemale;
		
		@Column(name="others_specify_male")
		private String OthersSpecifyMale;
		
		@Column(name="others_specify_female")
		private String OthersSpecifyFemale;
		
		@Column(name="total_male")
		private String TotalMale;
		
		@Column(name="total_female")
		private String TotalFemale;
		
		@Column(name="msje_ngo_proposal_form_id")
		private String Ngoproposalformid;
		
}
