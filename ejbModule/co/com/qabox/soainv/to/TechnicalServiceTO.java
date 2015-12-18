/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.qabox.soainv.to;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pbuitrag
 */
@XmlRootElement
public class TechnicalServiceTO extends AbstractTO implements Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 5825675263364705679L;

	private BusinessServiceTO businssService;
    
    private ResponsibleTO opsResponsible;
    private ResponsibleTO devResponsible;
    private ResponsibleTO devOpsResponsible;

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
