package co.com.qabox.soainv.ejb.identity;

import java.util.Collection;

import javax.ejb.Local;

import co.com.qabox.soainv.exception.IntegrationException;
import co.com.qabox.soainv.to.identity.IdentityDTO;
import co.com.qabox.soainv.to.identity.MenuDTO;



@Local
public interface IdentityServiceLocal {

	public IdentityDTO checkUser(IdentityDTO identity) throws IntegrationException;
	public Collection<MenuDTO> getMenu(String user) throws IntegrationException;
	public boolean logout(IdentityDTO identity) throws IntegrationException;
	
}
