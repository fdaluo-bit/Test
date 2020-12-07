package test1;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Invoice")
public class Invoice implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer invoiceId;
	private Date createDate;
	private String title;
	private String departmentCode;
	private String projectCode;
	private String projectTitle;
	private String contentCode;
	private String contentTitle;
	private String subjectCode;
	private String econSubjectCode;
	private Integer itemCount;
	private BigDecimal income;
	private BigDecimal tax;
	private BigDecimal taxY;
	private BigDecimal taxSaving;
	private BigDecimal actualPayment;
	private Integer createrId;
	private Integer batchId;
	private Integer taxRateTypeId;
	private Boolean isWage;
	private BigDecimal totalDeduction;
	private Boolean submitted;
	private Boolean accepted;
	private Integer acceptorId;
	private Integer applicationId;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="InvoiceId")
	public Integer getInvoiceId(){
		return invoiceId;
	}
	public void setInvoiceId(Integer invoiceId){
		this.invoiceId=invoiceId;
	}

	@Column(name="Title")
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title=title;
	}

	@Column(name="ProjectCode")
	public String getProjectCode(){
		return projectCode;
	}
	public void setProjectCode(String projectCode){
		this.projectCode=projectCode;
	}

	@Column(name="ProjectTitle")
	public String getProjectTitle(){
		return projectTitle;
	}
	public void setProjectTitle(String projectTitle){
		this.projectTitle=projectTitle;
	}

	@Column(name="ContentCode")
	public String getContentCode(){
		return contentCode;
	}
	public void setContentCode(String contentCode){
		this.contentCode=contentCode;
	}

	@Column(name="ContentTitle")
	public String getContentTitle(){
		return contentTitle;
	}
	public void setContentTitle(String contentTitle){
		this.contentTitle=contentTitle;
	}

	@Column(name="SubjectCode")
	public String getSubjectCode(){
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode){
		this.subjectCode=subjectCode;
	}

	@Column(name="EconSubjectCode")
	public String getEconSubjectCode(){
		return econSubjectCode;
	}
	public void setEconSubjectCode(String econSubjectCode){
		this.econSubjectCode=econSubjectCode;
	}

	@Column(name="ItemCount",insertable=false,updatable=false)
	public Integer getItemCount(){
		return itemCount;
	}
	public void setItemCount(Integer itemCount){
		this.itemCount=itemCount;
	}

	@Column(name="Income",insertable=false,updatable=false)
	public BigDecimal getIncome(){
		return income;
	}
	public void setIncome(BigDecimal income){
		this.income=income;
	}

	@Column(name="Tax",insertable=false,updatable=false)
	public BigDecimal getTax(){
		return tax;
	}
	public void setTax(BigDecimal tax){
		this.tax=tax;
	}

	@Column(name="TaxSaving",insertable=false,updatable=false)
	public BigDecimal getTaxSaving(){
		return taxSaving;
	}
	public void setTaxSaving(BigDecimal taxSaving){
		this.taxSaving=taxSaving;
	}

	@Column(name="ActualPayment",insertable=false,updatable=false)
	public BigDecimal getActualPayment(){
		return actualPayment;
	}
	public void setActualPayment(BigDecimal actualPayment){
		this.actualPayment=actualPayment;
	}

	@Column(name="CreaterId")
	public Integer getCreaterId(){
		return createrId;
	}
	public void setCreaterId(Integer createrId){
		this.createrId=createrId;
	}

	@Column(name="BatchId")
	public Integer getBatchId(){
		return batchId;
	}
	public void setBatchId(Integer batchId){
		this.batchId=batchId;
	}
	@Column(name="CreateDate")
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Column(name="TaxRateTypeId")
	public Integer getTaxRateTypeId() {
		return taxRateTypeId;
	}
	public void setTaxRateTypeId(Integer taxRateTypeId) {
		this.taxRateTypeId = taxRateTypeId;
	}
	@Column(name="IsWage")
	public Boolean getIsWage() {
		return isWage;
	}
	public void setIsWage(Boolean isWage) {
		this.isWage = isWage;
	}
	@Column(name="TotalDeduction",insertable=false,updatable=false)
	public BigDecimal getTotalDeduction() {
		return totalDeduction;
	}
	public void setTotalDeduction(BigDecimal totalDeduction) {
		this.totalDeduction = totalDeduction;
	}
	@Column(name="TaxY",insertable=false,updatable=false) 
	public BigDecimal getTaxY() {
		return taxY;
	}
	public void setTaxY(BigDecimal taxY) {
		this.taxY = taxY;
	}
	@Column(name="Submitted",insertable=false,updatable=false) 
	public Boolean getSubmitted() {
		return submitted;
	}
	public void setSubmitted(Boolean submitted) {
		this.submitted = submitted;
	}
	@Column(name="Accepted",insertable=false,updatable=false) 
	public Boolean getAccepted() {
		return accepted;
	}
	public void setAccepted(Boolean accepted) {
		this.accepted = accepted;
	}
	@Column(name="AcceptorId",insertable=false,updatable=false) 
	public Integer getAcceptorId() {
		return acceptorId;
	}
	public void setAcceptorId(Integer acceptorId) {
		this.acceptorId = acceptorId;
	}
	@Column(name="DepartmentCode")
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	@Column(name="ApplicationId")
	public Integer getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

}
