package com.nt.Bind;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class CitizenBind {

	private Integer edId;
	private String planName;
	private String planStatus;
	private String eligstartDate;
	private String eligEndDate;
	private Double benefitAmt;
	private String denialReason;
	public Integer getEdId() {
		return edId;
	}
	public void setEdId(Integer edId) {
		this.edId = edId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public String getEligstartDate() {
		return eligstartDate;
	}
	public void setEligstartDate(String eligstartDate) {
		this.eligstartDate = eligstartDate;
	}
	public String getEligEndDate() {
		return eligEndDate;
	}
	public void setEligEndDate(String eligEndDate) {
		this.eligEndDate = eligEndDate;
	}
	public Double getBenefitAmt() {
		return benefitAmt;
	}
	public void setBenefitAmt(Double benefitAmt) {
		this.benefitAmt = benefitAmt;
	}
	public String getDenialReason() {
		return denialReason;
	}
	public void setDenialReason(String denialReason) {
		this.denialReason = denialReason;
	}
	
	
	
}
