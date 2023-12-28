package eanudaan.gov.in.web.scheme.service;

import org.springframework.stereotype.Service;

import eanudaan.gov.in.web.scheme.dto.NgodetailsDto;
import eanudaan.gov.in.web.scheme.model.NgoDetails;


public interface NgoDetailsService {

	NgoDetails getDdrsngodetailsId(Long DdrsngodetailsId);
}
