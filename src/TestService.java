import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.hcl.library.request.Loan;

@Path("/")
public class TestService {
	
	@GET
	@Path("/")
	@Produces("application/json")
	public String getPage() {
		return "FUNCIONA";
	}
	
	@POST
	@Path("/")
	@Produces("application/json")
	@Consumes("application/json")
	public void getPage(Loan loan) {
		System.out.println(loan.getCustomerCurp() + " " + loan.getStaffUsername());
		for(String book : loan.getBooks()) {
			System.out.println(book);
		}
	}
	
	//

}
