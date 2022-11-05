package iaam3.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/Employee")

public class employee {
	public int id;
	public String name;
	public String role;
	public  double salary;
	public int Annual_salary;
	
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("inh")
	public String getEmployee1() {
		employee1 e1=new employee1();
		e1.salary=25000;
		String d= e1.annualsalary();
		
		
		
	
	return d;
		
	}
}