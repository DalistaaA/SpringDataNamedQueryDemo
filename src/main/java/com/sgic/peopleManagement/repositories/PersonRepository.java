package com.sgic.peopleManagement.repositories;
import java.util.List;

import org.springframework.data.repository.Repository;

import com.sgic.peopleManagement.entities.Person;

public interface PersonRepository extends Repository<Person, Integer>{

	List<Person> getPersonInfoByLastName(String lastName);
	
	List<Person> getPersonInfoByFirstNameAndEmail(String firstName, String email);
	
}
