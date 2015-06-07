package web.person.data.web;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import web.person.data.model.PersonData;

@Consumes({"application/json"})
public interface PersonDataService {

	@GET
	@Path("/person")
	PersonData getPersonData();

	@POST
	@Path("/person")
	void updatePersonData(PersonData update);

}
