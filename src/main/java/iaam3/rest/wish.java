package iaam3.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("wish")
public class wish{
	@GET
	@Produces("text/plain")
	@Path("aamani")
	public String wishes() {
		return "Hello aamani, Welcome to Rest";
		
	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("Student")
	
	public String student() {
		Student s1= new Student();
		Student s2= new Student();
		
		s1.id=101;
		s1.name="aamani";
		s1.course="M.sc";
		s1.age=25;
		
		s2.id=102;
		s2.name="sravss";
		s2.course="M-tech";
		s2.age=29;
		Student.college="Maris stella college";
		
		return   s1 +" <br> "+s2;
		
		
		
		
	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("employee")
	
	
	public String employee() {
		employee e1= new employee();
		employee e2= new employee();
		employee e3= new employee();
		
		e1.id = 1001;
		e1.name="karthik";
		e1.role="Developer";
		e1.salary=40000;
		e1.Annual_salary= e1.salary*12;
		
	
		e2.id = 1002;
		e2.name="krishna";
		e2.role="Analyst";
		e2.salary=50000;
		e2.Annual_salary=e2.salary*12;
		
		e3.id = 1003;
		e3.name="kishore";
		e3.role="Testing";
		e3.salary=30000;
		e3.Annual_salary=e3.salary*12;
		
		
	   	
		return e1 + "<br>" +e2 +"<br>" +e3 +"<br>";
		
		
		
		
		
		
	}
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("employee_arr")
	public String getEmparr() {
		employee arr[]= new employee[3];
		int ids[]= {1001,1002,1003};
		String names[]= {"kartik","krishna","kishore"};
		int salary[]= {25000,35000,45000};
		String s="<table border=5><tr><th>id</th><th>name</th><th>salary</tr>";
		for(int i=0;i<arr.length;i++) {
			arr[i]=new employee();
			arr[i].id=ids[i];
			arr[i].name=names[i];
			arr[i].salary=salary[i];
			s+="<tr><td>"+arr[i].id+"</td><td>"+arr[i].name+"</td><td>"+arr[i].salary+"</td></tr>";
		}
		s+="</table";
		return s;
	}
	
	
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("string/{str}")
	public String stringOp(@PathParam("str")String s) {
		int lengt = s.length();
		String inds="";
		String inds_temp="";
		int len_inds = 0;
		for(int i=0;i<lengt;i++) {
			if(s.charAt(i) == 'a'|| s.charAt(i) == 'e'||s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				inds+=s.charAt(i)+" at the index " + i+"<br>";
				inds_temp+=Character.toUpperCase(s.charAt(i));
				len_inds=len_inds+1;
			}
			else {
				inds_temp+=s.charAt(i);
			}
		}
		return inds + "<br>"+"Number of vowels is "+ len_inds + "<br>"+ inds_temp + "<br>";
 	 }
	 


	
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("array/{size}")
	
	public String array(@PathParam("size")int size) {
		int ar[]=new int[size];
		String s = " ";
		for(int i=0;i<size;i++) {
			ar[i]=10*(i+1);
			s+=ar[i]+" ";
		}
		return s;
	}
	
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("replace/{s}/{s1}/{s2}")
	public String replace(@PathParam("s")String s,@PathParam("s1")String s1,@PathParam("s2")String s2){
		return s.replace(s1, s2)+" ";
	}
	
	
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("str/{values}")
	public String str(@PathParam("values")String values) {
		String[] vals=values.split(",");
		//String s = "";
		int sum = 0;
		for(int i=0;i<vals.length;i++) {
			sum+=Integer.parseInt(vals[i]);
			
		}
		return sum+"";
	}
	
	
	
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("sting/{n}")
	public String sting(@PathParam("n")String n) {
		String[] n1 = n.split(",");
		String res="";
		for(int i=0;i<n1.length;i++) {
			res+=n1[i].charAt(n1[i].length()-1);
		}
		return res+"";
}

	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("int/{n}")
	public String getint(@PathParam("n") float n) {
		int num = (int) n;
		return num+" ";
}
	
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("square/{n}")
	public String getSquare(@PathParam("n")int n) {
		number number1=new number(n);
		//number number2=new number(n+5);
		return number1.square()+"";
		
	}
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("sum_int/{x},{y}")
	public String addNums(@PathParam("x")int x,@PathParam("y")int y) {
		overload od=new overload();
		return od.ad(x,y)+"";
	}
	
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("sum_int_float/{x},{y}")
	public String addNums(@PathParam("x")int x,@PathParam("y")float y) {
		overload od=new overload();
		return od.ad(x, y)+"";
	}
	
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("sum_float_float/{x},{y}")
	public String addNums(@PathParam("x")float x,@PathParam("y")float y) {
		overload od=new overload();
		return od.ad(x, y)+"";
	}
	
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("words_length/{n}")
	public String words_length(@PathParam("n")String n) {
		String n1=n;
		String[] words=n1.split("\\s");
		int length= words.length;
		return length+"";
		
       }
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("inh")
	public String getEmployee() {
		employee1 e1=new employee1();
		e1.salary=25000;
		String d= e1.annualsalary();
	return d;
		
	}
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("{value}")
	    public String getvalue(@PathParam("value")int x) {
	    child ch=new child();
	    return ch.getValue(x)+"";
	   
	}
}
		

   	
	
	
	
	
