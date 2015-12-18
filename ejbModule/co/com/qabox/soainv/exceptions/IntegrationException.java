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
public class IntegrationException extends Exception{
    
    private static final long serialVersionUID = 5325129644378247562L;

	public IntegrationException(String message) {
        super(message);
    }
    
}
