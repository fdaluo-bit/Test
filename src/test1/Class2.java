package test1;

import java.math.BigDecimal;
import java.util.Date;

import luotl.util.MyUtils;

public class Class2 implements Cloneable {
	private Integer i=100;
	private String s="goood";
	private Date d=MyUtils.currentDate();
	private BigDecimal b=BigDecimal.ZERO;
	public Object clone() {
        Class2 dest = null;  
        try{  
            dest = (Class2)super.clone();  
        }catch(CloneNotSupportedException e) {  
            e.printStackTrace();  
        }  
        return dest; 		
	}
	public Class2() {
		
	}
	public Class2(Integer i,String s,Date d,BigDecimal b) {
		this.i=i;
		this.s=s;
		this.d=d;
		this.b=b;
	}
	public Integer getI() {
		return i;
	}
	public void setI(Integer i) {
		this.i = i;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public Date getD() {
		return d;
	}
	public void setD(Date d) {
		this.d = d;
	}
	public BigDecimal getB() {
		return b;
	}
	public void setB(BigDecimal b) {
		this.b = b;
	}
	public String print() {
		return String.format("%d,%s,%tF,%f \n", i,s,d,b.doubleValue());
	}
}
