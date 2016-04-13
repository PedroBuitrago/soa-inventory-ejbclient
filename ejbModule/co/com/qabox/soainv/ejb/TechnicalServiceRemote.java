/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.qabox.soainv.ejb;

import javax.ejb.Remote;

import co.com.qabox.soainv.to.TechnicalServiceTO;

/**
 *
 * @author pbuitrag
 */
@Remote
public interface TechnicalServiceRemote extends EEServicesInterface<TechnicalServiceTO>{
	
}
