/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.qabox.soainv.ejb;

import javax.ejb.Local;

import co.com.qabox.soainv.to.TechnicalServiceTO;

/**
 *
 * @author pbuitrag
 */
@Local
public interface TechnicalServiceLocal extends EEServicesInterface<TechnicalServiceTO> {
	
}
