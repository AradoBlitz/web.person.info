package web.person.data.web;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import web.person.data.ejb.PersonDataBean;
import web.person.data.model.PersonData;
@ApplicationScoped
@Path("/")
@Produces({"application/json"})
public class PersonDataServiceImpl implements PersonDataService {

	
	
	@EJB
	private PersonDataBean personDataBean;
	
	@GET
	@Path("/person")
	public PersonData getPersonData() {
		// TODO Auto-generated method stub
		
		return personDataBean.getBean();
	}

	@POST
	@Path("/person")
	@Override
	public void updatePersonData(PersonData update) {
		
		if(isNotEmpty(update.getFirstName()))
			personDataBean.getBean().setFirstName(update.getFirstName());
		
		if(isNotEmpty(update.getFathersName()))
			personDataBean.getBean().setFathersName(update.getFathersName());
		
		if(isNotEmpty(update.getLastName()))
			personDataBean.getBean().setLastName(update.getLastName());
		
		if(update.getBearthDay() != null)
			personDataBean.getBean().setBearthDay(update.getBearthDay());
		
	}

	private boolean isNotEmpty(String firstName) {
		return firstName != null && !firstName.isEmpty();
	}

}
