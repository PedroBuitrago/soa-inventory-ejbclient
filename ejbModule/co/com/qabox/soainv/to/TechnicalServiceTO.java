/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.qabox.soainv.to;

import java.io.Serializable;
import java.util.HashMap;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Named;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pbuitrag
 */
@Named("techServTo")
@SessionScoped
@XmlRootElement
@Alternative
public class TechnicalServiceTO extends AbstractTO implements Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 5825675263364705679L;

	private BusinessServiceTO businssService;
    
    private ResponsibleTO opsResponsible;
    private ResponsibleTO devResponsible;
    private ResponsibleTO devOpsResponsible;
    private ServiceVersionTO version;
    private HashMap<String, Object> features;
    
    

    public HashMap<String, Object> getFeatures() {
		return features;
	}

	public void setFeatures(HashMap<String, Object> features) {
		this.features = features;
	}

	public ServiceVersionTO getVersion() {
		return version;
	}

	public void setVersion(ServiceVersionTO version) {
		this.version = version;
	}

	public BusinessServiceTO getBusinssService() {
        return businssService;
    }

    public void setBusinssService(BusinessServiceTO businssService) {
        this.businssService = businssService;
    }

	public ResponsibleTO getOpsResponsible() {
		return opsResponsible;
	}

	public void setOpsResponsible(ResponsibleTO opsResponsible) {
		this.opsResponsible = opsResponsible;
	}

	public ResponsibleTO getDevResponsible() {
		return devResponsible;
	}

	public void setDevResponsible(ResponsibleTO devResponsible) {
		this.devResponsible = devResponsible;
	}

	public ResponsibleTO getDevOpsResponsible() {
		return devOpsResponsible;
	}

	public void setDevOpsResponsible(ResponsibleTO devOpsResponsible) {
		this.devOpsResponsible = devOpsResponsible;
	}
    
    
    
}
