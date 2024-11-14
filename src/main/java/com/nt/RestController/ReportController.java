package com.nt.RestController;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.Bind.CitizenBind;
import com.nt.Bind.SearchBind;
import com.nt.Entity.EDDTLS;
import com.nt.Service.ReportService;

import jakarta.annotation.PostConstruct;

@RestController
public class ReportController {

	private ReportService reportService;
	
	@GetMapping("/plans")
	public List<String> getPlans(){
		return reportService.getPlans();
	}
	
	@GetMapping("/status")
	public List<String> getStatus(){
		return reportService.getStatus();
	}
	
	@PostMapping("/search")
	public ResponseEntity<CitizenBind> handelSerach(@RequestBody SearchBind bind){
		List<CitizenBind>list=reportService.search(bind);	
		return new ResponseEntity(list,HttpStatus.OK);
	}
	
}
