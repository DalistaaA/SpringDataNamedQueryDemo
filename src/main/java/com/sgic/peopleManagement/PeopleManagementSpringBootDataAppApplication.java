package com.sgic.peopleManagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sgic.peopleManagement.entities.Person;
import com.sgic.peopleManagement.services.PersonService;

@SpringBootApplication
public class PeopleManagementSpringBootDataAppApplication implements CommandLineRunner {

	@Autowired
	private PersonService personService;
	
	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementSpringBootDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//getPersonsInfoByLastName();
		getPersonsInfoByFirstNameAndEmail();
	}

	private void getPersonsInfoByFirstNameAndEmail() {
		List<Person> personList = personService.getPersonsInfoByFirstNameAndEmail("Thinesh","thiharii@gmail.com");
		personList.forEach(System.out::println);
		
	}

	private void getPersonsInfoByLastName() {
		List<Person> personList = personService.getPersonsInfoByLastName("Arikari");
		personList.forEach(System.out::println);
		
	}

	
	

}
