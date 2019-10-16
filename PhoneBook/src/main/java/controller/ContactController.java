package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Contact;
import service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	ContactService contactService;
	
	
	@PostMapping("/contacts/{lastName}")
	public Contact saveContact(@RequestBody Contact contact) {
		contactService.saveContact(contact);
		return contact;
	}
	
	@GetMapping("/contacts/")
	public List<Contact> getAllContacts(){
		return contactService.getAllContacts();
	}
	
	@GetMapping("/contacts/{lastName}")
	public Contact getContactByLastName(@PathVariable String lastName) {
		return contactService.findContactByLastName(lastName);
	}
	
	@DeleteMapping("/contacts/{lastName}")
	public void deleteContact(@PathVariable String lastName) {
		contactService.deleteContact(lastName);
	}
	
	@DeleteMapping("/contacts/")
	public void deleteAll() {
		contactService.deleteAll();
	}
	
	@PutMapping("/contacts/{lastName}")
	public Contact updateContact(@RequestBody Contact contact) {
		contactService.saveContact(contact);
		return contact;
	}
}
