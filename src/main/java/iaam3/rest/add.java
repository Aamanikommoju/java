package iaam3.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("aamani")
public class add {
	
	
@GET
@Produces("text/plain")
@Path("/add/{x}/{y}")
public String addd(@PathParam("x")int num1,@PathParam("y")int num2) {
return "sum:"+(num1+num2);

}
}
