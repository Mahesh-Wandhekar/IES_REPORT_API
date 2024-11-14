package com.nt.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import com.nt.Bind.CitizenBind;
import com.nt.Bind.SearchBind;
import com.nt.Entity.ApplicationEntity;
import com.nt.Entity.EDDTLS;
import com.nt.Entity.PlansEntity;
import com.nt.Repository.EDDTLSRepo;
import com.nt.Repository.IESApplicationRepo;
import com.nt.Repository.IESPlansRepo;

public class ReportServiceImp implements ReportService {

	@Autowired
	private IESApplicationRepo applicationRepo;
	
	@Autowired
	private EDDTLSRepo eddtlsRepo;
	
	@Autowired
	private IESPlansRepo plansRepo;
	
	@Override
	public List<String> getPlans() {
		List<PlansEntity>entity=plansRepo.findAll();	
		List<String> plans=new ArrayList<String>();	
		for(PlansEntity entity2:entity) {
			plans.add(entity2.getPlanName());
		}	
		return plans;
	}
	
	@Override
	public List<String> getStatus() {
		List<EDDTLS> entity=eddtlsRepo.findAll();
		List<String> status=new ArrayList<String>();	
		for(EDDTLS eddtls:entity) {
			status.add(eddtls.getPlanStatus());
		}
		Set<String> set=new HashSet<String>(status);
		
		List<String> allStatus=new ArrayList<String>(set);
		
		return allStatus;
	}
	
	
	@Override
	public List<CitizenBind> search(SearchBind bind) {
		EDDTLS eddtls=new EDDTLS();
		if(null!=bind.getPlanname()&& !"".equals(bind.getPlanname())) {
			eddtls.setPlanName(bind.getPlanname());
		}
		if(null!=bind.getStatus()&& !"".equals(bind.getStatus())) {
			eddtls.setPlanStatus(bind.getStatus());
		}	
		List<EDDTLS> list =eddtlsRepo.findAll(Example.of(eddtls));	
		CitizenBind citizenBind=new CitizenBind();
		BeanUtils.copyProperties(list, citizenBind);	
		return (List<CitizenBind>) citizenBind;
	}
	
}
