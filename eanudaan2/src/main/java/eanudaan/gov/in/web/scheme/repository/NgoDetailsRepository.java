package eanudaan.gov.in.web.scheme.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import eanudaan.gov.in.web.scheme.model.NgoDetails;



public interface NgoDetailsRepository  extends JpaRepository<NgoDetails, Long>{
	
	NgoDetails findByngodetailsId(Long DdrsngodetailsId);
	
	/*
	 * @Query(value = "SELECT * from ngo_details where id = ?", nativeQuery = true)
	 * List<Object> getNGODetails(String ngodetailsId);
	 */
	
	
	//NgoDetails findByDdrsngodetailsId();
}
