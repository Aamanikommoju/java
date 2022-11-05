package iaam3.rest;

public class Student {
	public int id;
	public String name;
	public String course;
	public int age;
	public static String college;
	
	public String toString() {
		return id+","+name+","+course+","+age+","+college;
	}
	
}
