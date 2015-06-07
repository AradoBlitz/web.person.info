package web.person.data.ejb;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.ejb.Singleton;

import web.person.data.model.PersonData;

@Singleton
public class PersonDataBean {
	PersonData manData = new PersonData();
	{
		//manData = manInfoBean.getBean();
		manData.setFirstName("Ivan");
		manData.setFathersName("Ivanovich");
		manData.setLastName("Ivanov");
		try {
			manData.setBearthDay(new SimpleDateFormat("dd.MM.yyyy").parse("12.12.1976"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public PersonData getBean() {
		// TODO Auto-generated method stub
		return manData;
	}
}
