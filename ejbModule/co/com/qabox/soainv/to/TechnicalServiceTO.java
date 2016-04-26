/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.qabox.soainv.to;

import java.io.Serializable;
import java.util.HashMap;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Named;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pbuitrag
 */
@Named("techServTo")
@RequestScoped
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.getId() == null) ? 0 : this.getId().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TechnicalServiceTO other = (TechnicalServiceTO) obj;
		if (this.getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!this.getId().equals(other.getId()))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TechnicalServiceTO [getId()=" + getId() + ", getDesc()="
				+ getDesc() + ", getName()=" + getName() + ", getAlias()="
				+ getAlias() + "]";
	}
    
    
    
}
