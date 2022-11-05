package iaam3.rest;

public class child extends parent {
	
	
	public String getValue(int val) {
		String ch=super.getValue(25000);
		  return ch+"<br> child value:"+val*80/100;
	}
	

}
