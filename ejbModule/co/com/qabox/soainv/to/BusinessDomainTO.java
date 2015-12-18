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
public class BusinessDomainTO extends AbstractTO implements Serializable {
    

	private static final long serialVersionUID = -6584548379307267072L;
	
	private PortfolioTO portfolio;
    private BusinessEntityTO businessEntity;

    public PortfolioTO getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(PortfolioTO portfolio) {
        this.portfolio = portfolio;
    }

    public BusinessEntityTO getBusinessEntity() {
        return businessEntity;
    }

    public void setBusinessEntity(BusinessEntityTO businessEntity) {
        this.businessEntity = businessEntity;
    }
    
    
    
}
