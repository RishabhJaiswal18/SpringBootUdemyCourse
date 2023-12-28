package eanudaan.gov.in.web.scheme.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eanudaan.gov.in.web.scheme.model.NgoDetails;
import eanudaan.gov.in.web.scheme.repository.NgoDetailsRepository;
import eanudaan.gov.in.web.scheme.service.DDRSProposalPartAService;

@Component
public class DDRSProposalPartAServiceImpl implements DDRSProposalPartAService {

	@Autowired
	private NgoDetailsRepository ngoDetailsRepository;
	
	@Override
	public NgoDetails saveDDRSPartAProposal(NgoDetails ngoformdetails) {
		// TODO Auto-generated method stub
		return ngoDetailsRepository.save(ngoformdetails);
	}

}
