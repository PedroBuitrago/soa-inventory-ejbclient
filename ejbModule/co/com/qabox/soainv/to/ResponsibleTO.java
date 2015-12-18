/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.qabox.soainv.to;

import co.com.qabox.soainv.util.ResponsibleType;
import java.io.Serializable;

/**
 *
 * @author pbuitrag
 */
public class ResponsibleTO extends AbstractTO implements Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 4655659645962388473L;
	private ResponsibleType type;
    private ContactInfoTO contactInfo;

    public ResponsibleType getType() {
        return type;
    }

    public void setType(ResponsibleType type) {
        this.type = type;
    }

	public ContactInfoTO getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(ContactInfoTO contactInfo) {
		this.contactInfo = contactInfo;
	}

   
    
    
    
}
