/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.qabox.soainv.to;

import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author pbuitrag
 */
public class ContactInfoTO extends AbstractTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5240658609168547295L;
    
	private Collection<String> telephoneNumbers;
	private String email;
	private String url;
	public Collection<String> getTelephoneNumbers() {
		return telephoneNumbers;
	}
	public void setTelephoneNumbers(Collection<String> telephoneNumbers) {
		this.telephoneNumbers = telephoneNumbers;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
    
}
