package repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Contact;

@Repository
public interface Database extends CrudRepository<Contact,String> {

	public List<Contact> findByCity(String city);
	
	public Contact findContactByNumber(String number);
	
	public List<Contact> findByFirstName(String firstName);
 }
