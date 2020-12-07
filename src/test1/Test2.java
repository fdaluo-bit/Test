package test1;

import java.lang.reflect.Field;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

public class Test2 {
	private Character sex;
	public static void main(String[] args) {
		try {
			Test2 test2=new Test2();
			test2.setSex(null);
			Field field=Test2.class.getDeclaredField("sex");
			field.setAccessible(true);
			field.set(test2,null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public Character getSex() {
		return sex;
	}
	public void setSex(Character sex) {
		this.sex = sex;
	}

}
