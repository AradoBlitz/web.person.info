package web.person.data.web;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;

import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.junit.Before;
import org.junit.Test;

import web.person.data.model.PersonData;
import web.person.data.web.PersonDataService;
/* Assumed test would reruns each per applications redeploys */
public class WebPersonDataServiceIT {

	private PersonDataService service;
	

	@Before
	public void init() throws Exception{
		service = new ResteasyClientBuilder()
		.build()
		.target("http://localhost:8080/service")
		.proxy(PersonDataService.class);
		
	}
	
	@Test
	public void getManData() throws Exception {	
		PersonData manData = service.getPersonData();
		assertNotNull(manData);
		assertEquals("Ivan", manData.getFirstName());
		assertEquals("Ivanovich", manData.getFathersName());
		assertEquals("Ivanov", manData.getLastName());
		assertEquals(new SimpleDateFormat("dd.MM.yyyy").parse("12.12.1976"), manData.getBearthDay());
		
	}
	
	@Test
	public void updateManInfo() throws Exception {
		PersonData update = new PersonData();
		update.setFathersName("Petrovich");
		service.updatePersonData(update);
		PersonData manData = service.getPersonData();
		assertEquals("Ivan", manData.getFirstName());
		assertEquals("Petrovich", manData.getFathersName());
		assertEquals("Ivanov", manData.getLastName());
		assertEquals(new SimpleDateFormat("dd.MM.yyyy").parse("12.12.1976"), manData.getBearthDay());
		
	}
}
