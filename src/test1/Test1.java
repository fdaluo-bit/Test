package test1;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;

import org.hibernate.Session;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import luotl.gson.GsonHelper;
import luotl.util.Empty;
import luotl.util.HibernateHelper;
import luotl.util.MyUtils;
import luotl.util.Result;

public class Test1 {
	public void method1() {
		
	}
	public Boolean method2() {
		return true;
	}
	public static void main(String[] args) {
		Session sx=null;
		try {
			System.out.println(System.getProperty("user.dir"));//user.dir指定了当前的路bai径
			Properties props=System.getProperties();
			Enumeration<Object> keys=props.keys();
			Object key;
			while(keys.hasMoreElements()) {
				key=keys.nextElement();
				System.out.println(key.toString());
			}
			Result<Empty> result=new Result<Empty>();
			Class1 c1=new Class1(100,"zhangsan");
			result.setData(c1);
			Gson gson=new Gson();
			String json=gson.toJson(result);
			Type type=GsonHelper.getResultType(Empty.class);
			result=gson.fromJson(json, type);
			c1=gson.fromJson(result.getData().toString(), Class1.class);
			System.out.println(c1.getValue2());
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			if(sx!=null)
				sx.close();
		}
	}

}
