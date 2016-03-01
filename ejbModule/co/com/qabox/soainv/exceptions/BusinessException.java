/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.qabox.soainv.exceptions;

/**
 *
 * @author pbuitrag
 */
public class BusinessException extends RuntimeException{
    
    private static final long serialVersionUID = 3408869317186517461L;

	public BusinessException(String message) {
        super(message);
    }
    
}
