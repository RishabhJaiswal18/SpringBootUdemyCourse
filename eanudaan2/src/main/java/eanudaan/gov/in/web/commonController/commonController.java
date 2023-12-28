package eanudaan.gov.in.web.commonController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import eanudaan.gov.in.web.scheme.model.NgoDetails;
import eanudaan.gov.in.web.scheme.service.DDRSProposalPartAService;
import eanudaan.gov.in.web.scheme.service.DistrictMasterService;
import eanudaan.gov.in.web.scheme.service.NgoDetailsService;
import eanudaan.gov.in.web.scheme.service.StateMasterService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class commonController {

	@Autowired
	private StateMasterService stateService;
	@Autowired
	private DistrictMasterService districtService;
	@Autowired
	private NgoDetailsService ngoDetailsService;
	@Autowired 
	private DDRSProposalPartAService ddrsProposalPartAService;

	@GetMapping("/")
	String homePage(Model model) {
		return "index";
	}

	@GetMapping("/aboutus")
	String aboutusPage(Model model)

	{
		return "aboutus";
	}

	@GetMapping("/contactus")
	String contactusPage(Model model) {
		return "contactus";
	}

	@GetMapping("/user/dasboard")
	String userDasboard(Model model) {
		return "/user/dashboard";
	}

	@GetMapping("/admin/list_of_ngo")
	String listofNgo() {

		return "/admin/list_of_ngo";
	}

	@GetMapping("/user/forma")
	String ApplicationFormA(RedirectAttributes redirect, Model model, HttpSession session, HttpServletRequest request,
			HttpServletResponse respose) {
		model.addAttribute("listState", stateService.findAll());
		model.addAttribute("listDistrict", districtService.findAll());
		Long DdrsngodetailsId = 1L;
		NgoDetails formAdto = ngoDetailsService.getDdrsngodetailsId(DdrsngodetailsId);
	//	System.out.println(formAdto);
		model.addAttribute("formAdto", formAdto);
//		 System.out.println(formAdto);

		return "/user/forma";
	}
	@RequestMapping(value = "/user/saveforma",method = RequestMethod.POST)
	String saveFormA(@ModelAttribute("ngodetailsforma") NgoDetails ngodetails, RedirectAttributes redirect, Model model, HttpSession session, HttpServletRequest request,
			HttpServletResponse respose)throws Exception {
		
		System.out.println(ngodetails);
		
		
		NgoDetails savedAll = ddrsProposalPartAService.saveDDRSPartAProposal(ngodetails);
//		if(savedAll !=null) {
//			redirect.addFlashAttribute("message"," Successfully Data saved Proposal No is :"+ savedAll.getInstituteProposalId()+ " and form is "+ savedAll.getApprovedStatus()   );
//			//model.addAttribute("message", "Data saved successfully");
//	
//			return "redirect:/inst_proposal/admin_save_message";
//	
//		}
		System.out.println(savedAll);

		return	"user/dashboard";
	}
	
	@GetMapping("/user/formb")
	String ApplicationFormB(@ModelAttribute("ngodetailsforma") NgoDetails ngodetails, RedirectAttributes redirect, Model model, HttpSession session, HttpServletRequest request,
			HttpServletResponse respose) {
		model.addAttribute("listState", stateService.findAll());
		model.addAttribute("listDistrict", districtService.findAll());
		Long DdrsngodetailsId = 1L;
		NgoDetails formBdto = ngoDetailsService.getDdrsngodetailsId(DdrsngodetailsId);

		model.addAttribute("formBdto", formBdto);
////		 System.out.println(formAdto);

		return "/user/formb";
	}
	
	@GetMapping("/user/formc")
	String ApplicationFormC(@ModelAttribute("ngodetailsforma") NgoDetails ngodetails, RedirectAttributes redirect, Model model, HttpSession session, HttpServletRequest request,
			HttpServletResponse respose) {
		model.addAttribute("listState", stateService.findAll());
		model.addAttribute("listDistrict", districtService.findAll());
		Long DdrsngodetailsId = 1L;
		NgoDetails formCdto = ngoDetailsService.getDdrsngodetailsId(DdrsngodetailsId);

		model.addAttribute("formCdto", formCdto);
////		 System.out.println(formAdto);

		return "/user/formc";
	}
	
	
	
}
