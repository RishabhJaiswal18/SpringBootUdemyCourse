package eanudaan.gov.in.web.scheme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "states_master")
public class StateMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long stateId;

	@Column(name = "state_code_lgd")
	private Long stateCodeLgd;

	@Column(name = "state_name")
	private String stateName;

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public Long getStateCodeLgd() {
		return stateCodeLgd;
	}

	public void setStateCodeLgd(Long stateCodeLgd) {
		this.stateCodeLgd = stateCodeLgd;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "StateMaster [stateId=" + stateId + ", stateCodeLgd=" + stateCodeLgd + ", stateName=" + stateName + "]";
	}

}
