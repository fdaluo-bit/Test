package test1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Parameter")
public class Parameter implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer parameterId;
	private String parameterName;
	private String parameterTitle;
	private String parameterValue;
	private String memo;
		@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ParameterId")
	public Integer getParameterId(){
		return parameterId;
	}
	public void setParameterId(Integer parameterId){
		this.parameterId=parameterId;
	}

	@Column(name="ParameterName")
	public String getParameterName(){
		return parameterName;
	}
	public void setParameterName(String parameterName){
		this.parameterName=parameterName;
	}

	@Column(name="ParameterTitle")
	public String getParameterTitle(){
		return parameterTitle;
	}
	public void setParameterTitle(String parameterTitle){
		this.parameterTitle=parameterTitle;
	}

	@Column(name="ParameterValue")
	public String getParameterValue(){
		return parameterValue;
	}
	public void setParameterValue(String parameterValue){
		this.parameterValue=parameterValue;
	}

	@Column(name="Memo")
	public String getMemo(){
		return memo;
	}
	public void setMemo(String memo){
		this.memo=memo;
	}

}
