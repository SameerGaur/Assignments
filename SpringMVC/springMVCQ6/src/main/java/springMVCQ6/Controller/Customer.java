package springMVCQ6.Controller;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Customer {
	private String username;
	private String password;
	private String email;
	private String city;
	private long contact;
	private long zipcode;
	
	public Customer() {
		
	}
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public String getCity() {
		return city;
	}
	public long getContact() {
		return contact;
	}
	public long getZipcode() {
		return zipcode;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}

}
