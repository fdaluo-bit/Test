package test1;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Wage")
public class Wage implements java.io.Serializable,Cloneable {
	private static final long serialVersionUID = 1L;
	private Integer wageId;
	private java.util.Date createDate;
	private String year;
	private String month;
	private String departmentTitle;
	private String employeeNo;
	private String employeeName;
	private String idNumber;
	private java.math.BigDecimal income;
	private java.math.BigDecimal taxFreeIncome;
	private java.math.BigDecimal endowment;
	private java.math.BigDecimal medical;
	private java.math.BigDecimal unemployment;
	private java.math.BigDecimal providentFund;
	private java.math.BigDecimal childrenEducation;
	private java.math.BigDecimal continuingEducation;
	private java.math.BigDecimal interestExpense;
	private java.math.BigDecimal rent;
	private java.math.BigDecimal alimony;
	private java.math.BigDecimal annuity;
	private java.math.BigDecimal healthInsurance;
	private java.math.BigDecimal taxDeferredEndowment;
	private java.math.BigDecimal other;
	private java.math.BigDecimal donation;
	private java.math.BigDecimal totalDeduction;
	private java.math.BigDecimal taxableIncome;
	private java.math.BigDecimal rate;
	private java.math.BigDecimal tax;
	private java.math.BigDecimal taxY;
	private java.math.BigDecimal taxSaving;
	private java.math.BigDecimal actualPayment;
	private Integer userId;
	private String remarks;
	private Integer invoiceId;
	private String accountNo;
	private String bankName;
	private String bankCode;
	private String cityName;
	private Boolean submitted;	
	private String deductionIds;
	private Integer applicationId;
	//¿ËÂ¡
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}	
		@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="WageId")
	public Integer getWageId(){
		return wageId;
	}
	public void setWageId(Integer wageId){
		this.wageId=wageId;
	}

	@Column(name="CreateDate")
	public java.util.Date getCreateDate(){
		return createDate;
	}
	public void setCreateDate(java.util.Date createDate){
		this.createDate=createDate;
	}

	@Column(name="Year")
	public String getYear(){
		return year;
	}
	public void setYear(String year){
		this.year=year;
	}

	@Column(name="Month")
	public String getMonth(){
		return month;
	}
	public void setMonth(String month){
		this.month=month;
	}

	@Column(name="DepartmentTitle")
	public String getDepartmentTitle(){
		return departmentTitle;
	}
	public void setDepartmentTitle(String departmentTitle){
		this.departmentTitle=departmentTitle;
	}

	@Column(name="EmployeeNo")
	public String getEmployeeNo(){
		return employeeNo;
	}
	public void setEmployeeNo(String employeeNo){
		this.employeeNo=employeeNo;
	}

	@Column(name="EmployeeName")
	public String getEmployeeName(){
		return employeeName;
	}
	public void setEmployeeName(String employeeName){
		this.employeeName=employeeName;
	}

	@Column(name="IdNumber")
	public String getIdNumber(){
		return idNumber;
	}
	public void setIdNumber(String idNumber){
		this.idNumber=idNumber;
	}

	@Column(name="Income")
	public java.math.BigDecimal getIncome(){
		return income;
	}
	public void setIncome(java.math.BigDecimal income){
		this.income=income;
	}

	@Column(name="TaxFreeIncome")
	public java.math.BigDecimal getTaxFreeIncome(){
		return taxFreeIncome;
	}
	public void setTaxFreeIncome(java.math.BigDecimal taxFreeIncome){
		this.taxFreeIncome=taxFreeIncome;
	}

	@Column(name="Endowment")
	public java.math.BigDecimal getEndowment(){
		return endowment;
	}
	public void setEndowment(java.math.BigDecimal endowment){
		this.endowment=endowment;
	}

	@Column(name="Medical")
	public java.math.BigDecimal getMedical(){
		return medical;
	}
	public void setMedical(java.math.BigDecimal medical){
		this.medical=medical;
	}

	@Column(name="Unemployment")
	public java.math.BigDecimal getUnemployment(){
		return unemployment;
	}
	public void setUnemployment(java.math.BigDecimal unemployment){
		this.unemployment=unemployment;
	}

	@Column(name="ProvidentFund")
	public java.math.BigDecimal getProvidentFund(){
		return providentFund;
	}
	public void setProvidentFund(java.math.BigDecimal providentFund){
		this.providentFund=providentFund;
	}

	@Column(name="ChildrenEducation")
	public java.math.BigDecimal getChildrenEducation(){
		return childrenEducation;
	}
	public void setChildrenEducation(java.math.BigDecimal childrenEducation){
		this.childrenEducation=childrenEducation;
	}

	@Column(name="ContinuingEducation")
	public java.math.BigDecimal getContinuingEducation(){
		return continuingEducation;
	}
	public void setContinuingEducation(java.math.BigDecimal continuingEducation){
		this.continuingEducation=continuingEducation;
	}

	@Column(name="InterestExpense")
	public java.math.BigDecimal getInterestExpense(){
		return interestExpense;
	}
	public void setInterestExpense(java.math.BigDecimal interestExpense){
		this.interestExpense=interestExpense;
	}

	@Column(name="Rent")
	public java.math.BigDecimal getRent(){
		return rent;
	}
	public void setRent(java.math.BigDecimal rent){
		this.rent=rent;
	}

	@Column(name="Alimony")
	public java.math.BigDecimal getAlimony(){
		return alimony;
	}
	public void setAlimony(java.math.BigDecimal alimony){
		this.alimony=alimony;
	}

	@Column(name="Annuity")
	public java.math.BigDecimal getAnnuity(){
		return annuity;
	}
	public void setAnnuity(java.math.BigDecimal annuity){
		this.annuity=annuity;
	}

	@Column(name="HealthInsurance")
	public java.math.BigDecimal getHealthInsurance(){
		return healthInsurance;
	}
	public void setHealthInsurance(java.math.BigDecimal healthInsurance){
		this.healthInsurance=healthInsurance;
	}

	@Column(name="TaxDeferredEndowment")
	public java.math.BigDecimal getTaxDeferredEndowment(){
		return taxDeferredEndowment;
	}
	public void setTaxDeferredEndowment(java.math.BigDecimal taxDeferredEndowment){
		this.taxDeferredEndowment=taxDeferredEndowment;
	}

	@Column(name="Other")
	public java.math.BigDecimal getOther(){
		return other;
	}
	public void setOther(java.math.BigDecimal other){
		this.other=other;
	}

	@Column(name="Donation")
	public java.math.BigDecimal getDonation(){
		return donation;
	}
	public void setDonation(java.math.BigDecimal donation){
		this.donation=donation;
	}

	@Column(name="TotalDeduction")
	public java.math.BigDecimal getTotalDeduction(){
		return totalDeduction;
	}
	public void setTotalDeduction(java.math.BigDecimal totalDeduction){
		this.totalDeduction=totalDeduction;
	}

	@Column(name="TaxableIncome")
	public java.math.BigDecimal getTaxableIncome(){
		return taxableIncome;
	}
	public void setTaxableIncome(java.math.BigDecimal taxableIncome){
		this.taxableIncome=taxableIncome;
	}

	@Column(name="Rate")
	public java.math.BigDecimal getRate(){
		return rate;
	}
	public void setRate(java.math.BigDecimal rate){
		this.rate=rate;
	}

	@Column(name="Tax")
	public java.math.BigDecimal getTax(){
		return tax;
	}
	public void setTax(java.math.BigDecimal tax){
		this.tax=tax;
	}

	@Column(name="TaxSaving")
	public java.math.BigDecimal getTaxSaving(){
		return taxSaving;
	}
	public void setTaxSaving(java.math.BigDecimal taxSaving){
		this.taxSaving=taxSaving;
	}

	@Column(name="ActualPayment",insertable=false,updatable=false)
	public java.math.BigDecimal getActualPayment(){
		return actualPayment;
	}
	public void setActualPayment(java.math.BigDecimal actualPayment){
		this.actualPayment=actualPayment;
	}

	@Column(name="UserId")
	public Integer getUserId(){
		return userId;
	}
	public void setUserId(Integer userId){
		this.userId=userId;
	}

	@Column(name="Remarks")
	public String getRemarks(){
		return remarks;
	}
	public void setRemarks(String remarks){
		this.remarks=remarks;
	}

	@Column(name="InvoiceId")
	public Integer getInvoiceId(){
		return invoiceId;
	}
	public void setInvoiceId(Integer invoiceId){
		this.invoiceId=invoiceId;
	}
	@Column(name="AccountNo")
	public String getAccountNo(){
		return accountNo;
	}
	public void setAccountNo(String accountNo){
		this.accountNo=accountNo;
	}

	@Column(name="BankName")
	public String getBankName(){
		return bankName;
	}
	public void setBankName(String bankName){
		this.bankName=bankName;
	}

	@Column(name="BankCode")
	public String getBankCode(){
		return bankCode;
	}
	public void setBankCode(String bankCode){
		this.bankCode=bankCode;
	}
	@Column(name="TaxY")
	public java.math.BigDecimal getTaxY() {
		return taxY;
	}
	public void setTaxY(java.math.BigDecimal taxY) {
		this.taxY = taxY;
	}
	@Column(name="CityName")
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Column(name="Submitted") 
	public Boolean getSubmitted() {
		return submitted;
	}
	public void setSubmitted(Boolean submitted) {
		this.submitted = submitted;
	}
	@Transient
	public String getDeductionIds() {
		return deductionIds; 
	}
	public void setDeductionIds(String deductionIds) {
		this.deductionIds = deductionIds;
	}
	@Column(name="ApplicationId") 
	public Integer getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}
}
