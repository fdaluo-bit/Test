package test1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import luotl.ext.VerifyCodeHelper;
import luotl.util.MyUtils;

public class Test3 {

	public static void main(String[] args) {
		   try {
			   int i=Integer.parseInt("0001");
			   System.out.println(i);
			   String str=String.format("%d", 1);
			   System.out.println(str);

			} catch (Exception e) {
				e.printStackTrace();
			} 
	}

}
