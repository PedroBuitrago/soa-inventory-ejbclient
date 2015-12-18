/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.qabox.soainv.to;

import java.io.Serializable;
import java.util.Collection;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pbuitrag
 */
@XmlRootElement
public class BusinessServiceTO extends AbstractTO implements Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 7912357596998305889L;

	private BusinessDomainTO businessDomain;
    
    private Collection<TechnicalServiceTO> techServices;
    
    private Collection<OwnerTO> owners;
    
    

    public Collection<TechnicalServiceTO> getTechServices() {
        return techServices;
    }

    public void setTechServices(Collection<TechnicalServiceTO> techServices) {
        this.techServices = techServices;
    }
    
    

    public BusinessDomainTO getBusinessDomain() {
        return businessDomain;
    }

    public void setBusinessDomain(BusinessDomainTO businessDomain) {
        this.businessDomain = businessDomain;
    }

	public Collection<OwnerTO> getOwners() {
		return owners;
	}

	public void setOwners(Collection<OwnerTO> owners) {
		this.owners = owners;
	}
    
    
    
}
