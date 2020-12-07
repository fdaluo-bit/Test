package test1;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import luotl.util.MyUtils;

public class WageAdapter extends TypeAdapter<Wage> {
	private Logger logger=LoggerFactory.getLogger(WageAdapter.class);

	@Override
	public void write(JsonWriter out, Wage wage) throws IOException {
		out.beginObject();
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		out.name("applicationId").value(wage.getInvoiceId());
		out.name("invoiceId").value(wage.getApplicationId());
		
		out.name("createDate").value(df.format(wage.getCreateDate()));
		out.name("year").value(wage.getYear());
		out.name("month").value(wage.getMonth());
		out.name("departmentTitle").value(wage.getDepartmentTitle());
		out.name("employeeNo").value(wage.getEmployeeNo());
		out.name("employeeName").value(wage.getEmployeeName());
		out.name("idNumber").value(wage.getIdNumber());
		out.name("income").value(wage.getIncome());
		out.name("taxFreeIncome").value(wage.getTaxFreeIncome());
		out.name("endowment").value(wage.getEndowment());
		out.name("medical").value(wage.getMedical());
		out.name("unemployment").value(wage.getUnemployment());
		out.name("providentFund").value(wage.getProvidentFund());
		out.name("childrenEducation").value(wage.getChildrenEducation());
		out.name("continuingEducation").value(wage.getContinuingEducation());
		out.name("interestExpense").value(wage.getInterestExpense());
		out.name("rent").value(wage.getRent());
		out.name("alimony").value(wage.getAlimony());
		out.name("annuity").value(wage.getAnnuity());
		out.name("healthInsurance").value(wage.getHealthInsurance());
		out.name("taxDeferredEndowment").value(wage.getTaxDeferredEndowment());
		out.name("other").value(wage.getOther());
		out.name("donation").value(wage.getDonation());
		out.name("totalDeduction").value(wage.getTotalDeduction());
		out.name("taxableIncome").value(wage.getTaxableIncome());
		out.name("rate").value(wage.getRate());
		out.name("tax").value(wage.getTax());
		out.name("taxY").value(wage.getTaxY());
		out.name("taxSaving").value(wage.getTaxSaving());
		out.name("actualPayment").value(wage.getActualPayment());
		out.name("userId").value(wage.getUserId());
		out.name("accountNo").value(wage.getAccountNo());
		out.name("bankName").value(wage.getBankName());
		out.name("bankCode").value(wage.getBankCode());
		out.name("cityName").value(wage.getCityName());
		out.name("remarks").value(wage.getRemarks());
		out.name("submitted").value(wage.getSubmitted());
		out.endObject();
	}

	@Override
	public Wage read(JsonReader in) throws IOException {
		Wage wage=new Wage();
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String fieldName,typeName,methodName;
		Field field;
		Object value;
		Method method;
		Class<?> type=Wage.class;
		in.beginObject();
		while(in.hasNext()) {
			try {
				fieldName=in.nextName();
				if(fieldName.equals("serialVersionUID"))
					continue;
				if(fieldName.equals("invoiceId"))
					fieldName="applicationId";
				else if(fieldName.equals("applicationId"))
					fieldName="invoiceId";
				
				field=type.getDeclaredField(fieldName);
				field.setAccessible(true);
				typeName=MyUtils.firstUpper(field.getType().getSimpleName());
				methodName="next"+typeName;
				
				if(typeName.equals("Integer"))
					methodName="nextInt";
				if(typeName.equals("Date"))
					methodName="nextString";
				else if(typeName.equals("BigDecimal"))
					methodName="nextDouble";
					
				method=null;
				try {
					method=JsonReader.class.getMethod(methodName);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				if(method==null) {
					System.out.println(methodName+" is Null");
					break;
				}
				value=method.invoke(in);
				if(typeName.equals("Date"))
					field.set(wage,df.parse((String)value));
				else if(typeName.equals("BigDecimal"))
					field.set(wage,BigDecimal.valueOf((Double)value));
				else
					field.set(wage, value);
			}
			catch(Exception e) {
				logger.error("error",e);
				break;
			}
		}
		in.endObject();
		return wage;
	}

}
