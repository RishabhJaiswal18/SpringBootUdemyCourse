package eanudaan.gov.in.web.scheme.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eanudaan.gov.in.web.scheme.model.StateMaster;
import eanudaan.gov.in.web.scheme.repository.StateMasterRepository;
import eanudaan.gov.in.web.scheme.service.StateMasterService;
import jakarta.persistence.TypedQuery;

@Service
public class StateMasterServiceImpl implements StateMasterService {

	@Autowired
	private StateMasterRepository stateRepo;

	public List<StateMaster> findAll() {
		// TODO Auto-generated method stub
		
		return stateRepo.findAll();
	}

}
