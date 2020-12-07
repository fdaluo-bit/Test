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
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

//鐢ㄤ簬TaxMiddle
public class InvoiceAdapter extends TypeAdapter<Invoice> {
	private Logger logger=LoggerFactory.getLogger(InvoiceAdapter.class);

	@Override
	public void write(JsonWriter out, Invoice invoice) throws IOException {
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		Field[] fields=Invoice.class.getDeclaredFields();
		Object value;
		String fieldName;
		out.beginObject();
		try {
			for(Field field: fields) {
				field.setAccessible(true);
				value=field.get(invoice);
				if(value==null)
					continue;
				fieldName=field.getName();
				if(fieldName.equals("serialVersionUID"))
					continue;

				if(fieldName.equals("invoiceId"))
					fieldName="applicationId";
				else if(fieldName.equals("applicationId"))
					fieldName="invoiceId";
				else if(fieldName.equals("income"))
					fieldName="amount";
				else if(fieldName.equals("createDate"))
					fieldName="createTime";
				else if(fieldName.equals("employeeName"))
					fieldName="applicantName";
				else if(fieldName.equals("employeeNo"))
					fieldName="applicantNo";		
				
				if(field.getType()==Date.class)
					out.name(fieldName).value(df.format((Date)value));
				else if(field.getType()==BigDecimal.class)
					out.name(fieldName).value(((BigDecimal)value).doubleValue());
				else
					out.name(fieldName).value(value.toString());
			}
		} 
		catch (Exception e) {
			logger.error("",e);
		}
		out.endObject();
	}

	@Override
	public Invoice read(JsonReader in) throws IOException {
		Invoice invoice=new Invoice();
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		String fieldName,typeName,methodName;
		Field field;
		Object value;
		Method method;
		Class<?> type=Invoice.class;
		in.beginObject();
		while(in.hasNext()) {
			try {
				fieldName=in.nextName();
				if(fieldName.equals("serialVersionUID")) {
					value=in.nextString();
					continue;
				}
				if(fieldName.equals("invoiceId"))
					fieldName="applicationId";
				else if(fieldName.equals("applicationId"))
					fieldName="invoiceId";
				else if(fieldName.equals("amount"))
					fieldName="income";
				else if(fieldName.equals("createTime"))
					fieldName="createDate";
				else if(fieldName.equals("applicantName"))
					fieldName="employeeName";
				else if(fieldName.equals("applicantNo"))
					fieldName="employeeNo";
				
				JsonToken token=in.peek();
				value=null;
			    switch (token)
			    {
			    case STRING: 
			      value=in.nextString();
			      break;
			    case NUMBER: 
			      value=Double.valueOf(in.nextDouble());
			      break;
			    case BOOLEAN: 
			      value= Boolean.valueOf(in.nextBoolean());
			      break;
			    case NULL: 
			      in.nextNull();
			      value=null;
			      break;
			    default:
			    	throw new IllegalStateException();
			    }
			    
				field=null;
				try {
					field=type.getDeclaredField(fieldName);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
					continue;
				}				
				//值类型转换
				if(field.getType()==Date.class)
					value=df.parse((String)value);
				else if(field.getType()==Integer.class)
					value=((Double)value).intValue();
				else if(field.getType()==Long.class)
					value=((Double)value).longValue();
				else if(field.getType()==BigDecimal.class)
					value=BigDecimal.valueOf((Double)value);
				
				field.setAccessible(true);
				field.set(invoice, value);
				
			}
			catch(Exception e) {
				logger.error("error",e);
				break;
			}
		}
		in.endObject();
		return invoice;
	}

}
