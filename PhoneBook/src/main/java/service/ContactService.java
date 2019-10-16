package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Contact;
import repository.Database;

@Service
public class ContactService {
	
	@Autowired
	private Database database;
	
	
	public ContactService() {
		
	}
	
	public Contact saveContact(Contact contact) {
		database.save(contact);
		return contact;
	}
	
	public List<Contact> getAllContacts() {
		return (List<Contact>) database.findAll();
	}
	
	public Contact findContactByLastName(String lastName) {
		return database.findOne(lastName);
	}
	
	public List<Contact> findContactsByCity(String city){
		return database.findByCity(city);
	}
	
	public Contact findContactByNumber(String number) {
		return database.findContactByNumber(number);
	}
	
	public List<Contact> findByFirstName(String firstName){
		return database.findByFirstName(firstName);
	}
	
	public void deleteContact(String lastName) {
		database.delete(lastName);
	}
	
	public void deleteAll() {
		database.deleteAll();
	}
	
	public Contact updateContact(Contact contact) {
		database.save(contact);
		return contact;
	}
	

	
	
}
