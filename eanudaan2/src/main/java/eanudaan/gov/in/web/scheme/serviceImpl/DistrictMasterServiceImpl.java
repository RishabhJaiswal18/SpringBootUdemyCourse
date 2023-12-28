package eanudaan.gov.in.web.scheme.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eanudaan.gov.in.web.scheme.model.DistrictMaster;
import eanudaan.gov.in.web.scheme.repository.DistrictMasterRepository;
import eanudaan.gov.in.web.scheme.service.DistrictMasterService;

@Service
public class DistrictMasterServiceImpl implements DistrictMasterService {
	
	@Autowired
	private DistrictMasterRepository districtRepo;

	public List<DistrictMaster> findAll() {
		// TODO Auto-generated method stub
		
		return districtRepo.findAll();
	}

}
