package eanudaan.gov.in.web.scheme.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import eanudaan.gov.in.web.scheme.model.DistrictMaster;

public interface DistrictMasterRepository extends JpaRepository<DistrictMaster, Long>{

//	List<DistrictMaster> getListByStateCode(Long stateCode);
}
