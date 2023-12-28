package eanudaan.gov.in.web.scheme.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eanudaan.gov.in.web.scheme.dto.NgodetailsDto;
import eanudaan.gov.in.web.scheme.model.NgoDetails;
import eanudaan.gov.in.web.scheme.repository.NgoDetailsRepository;
import eanudaan.gov.in.web.scheme.service.NgoDetailsService;

@Service
public class NgodetailsFormADTOService implements NgoDetailsService{

	@Autowired private NgoDetailsRepository ngoDetailsRepository;
	
	
	


	@Override
	public NgoDetails getDdrsngodetailsId(Long DdrsngodetailsId) {
		NgoDetails ngodetails = ngoDetailsRepository.findByngodetailsId(DdrsngodetailsId);
		
		return ngodetails;
	}

}
