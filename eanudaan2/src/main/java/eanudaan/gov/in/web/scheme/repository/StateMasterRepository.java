package eanudaan.gov.in.web.scheme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import eanudaan.gov.in.web.scheme.model.StateMaster;

public interface StateMasterRepository  extends JpaRepository<StateMaster, Long>{

//	StateMaster findByStateId (Long stateCode);
}
