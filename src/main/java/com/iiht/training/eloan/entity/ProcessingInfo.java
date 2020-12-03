package com.iiht.training.eloan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Min;
@Entity
@Table(name="Processing_Info")
public class ProcessingInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="loanAppId")
	private Long loanAppId;
	@Column(name="loanClerkId")
	private Long loanClerkId;
	@Column(name="acresOfLand")
	@NotNull(message="acresOfLand is mandate")
	@Min(value=1, message = "acresOfLand should be greater than 1")
	private Double acresOfLand;
	@Column(name="landValue")
	@NotNull(message="landValue is mandate")
	@Min(value=1, message = "landValue should be greater than 1")
	private Double landValue;
	@Column(name="appraisedBy")
	private String appraisedBy;
	@Column(name="valuationDate")
	private String valuationDate;
	@Column(name="addressOfProperty")
	private String addressOfProperty;
	@Column(name="suggestedAmountOfLoan")
	@NotNull(message="suggestedAmountOfLoan is mandate")
	@Min(value=1, message = "suggestedAmountOfLoan should be greater than 1")
	private Double suggestedAmountOfLoan;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getLoanAppId() {
		return loanAppId;
	}
	public void setLoanAppId(Long loanAppId) {
		this.loanAppId = loanAppId;
	}
	public Long getLoanClerkId() {
		return loanClerkId;
	}
	public void setLoanClerkId(Long loanClerkId) {
		this.loanClerkId = loanClerkId;
	}
	public Double getAcresOfLand() {
		return acresOfLand;
	}
	public void setAcresOfLand(Double acresOfLand) {
		this.acresOfLand = acresOfLand;
	}
	public Double getLandValue() {
		return landValue;
	}
	public void setLandValue(Double landValue) {
		this.landValue = landValue;
	}
	public String getAppraisedBy() {
		return appraisedBy;
	}
	public void setAppraisedBy(String appraisedBy) {
		this.appraisedBy = appraisedBy;
	}
	public String getValuationDate() {
		return valuationDate;
	}
	public void setValuationDate(String valuationDate) {
		this.valuationDate = valuationDate;
	}
	public String getAddressOfProperty() {
		return addressOfProperty;
	}
	public void setAddressOfProperty(String addressOfProperty) {
		this.addressOfProperty = addressOfProperty;
	}
	public Double getSuggestedAmountOfLoan() {
		return suggestedAmountOfLoan;
	}
	public void setSuggestedAmountOfLoan(Double suggestedAmountOfLoan) {
		this.suggestedAmountOfLoan = suggestedAmountOfLoan;
	}
	
	
}
