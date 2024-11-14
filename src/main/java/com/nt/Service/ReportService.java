package com.nt.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nt.Bind.CitizenBind;
import com.nt.Bind.SearchBind;

@Service
public interface ReportService {

	public List<String> getPlans();
	
	public List<String> getStatus();
	
	public List<CitizenBind> search(SearchBind bind);
	
	
}
