package eanudaan.gov.in.web.scheme.service;

import org.springframework.stereotype.Service;

import eanudaan.gov.in.web.scheme.model.NgoDetails;

@Service
public interface DDRSProposalPartAService {
	
	NgoDetails saveDDRSPartAProposal(NgoDetails ngoformdetails);

}
