package co.com.qabox.soainv.to.identity;

import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.Email;

@Named("identityDTO")
@XmlRootElement(name="IdentityDTO")
@XmlAccessorType( XmlAccessType.FIELD )
public class IdentityDTO {

	
	
	public IdentityDTO(RoleDTO role) {
		super();
		this.role = role;
	}
	@XmlAttribute
	@NotNull
	private Long id;
	@XmlAttribute
	@NotNull
	private String user;
	@XmlAttribute
	@NotNull
	private String pass;
	@XmlAttribute
	private String firstName;
	@XmlAttribute
	private String lastName;
	@XmlAttribute
	@NotNull
	private RoleDTO role;
	@XmlAttribute
	@NotNull @Email
	private String email;
	@XmlAttribute
	@NotNull
	private boolean authenticated;
	
	
		
	public RoleDTO getRole() {
		return role;
	}
	public void setRole(RoleDTO role) {
		this.role = role;
	}
	public boolean isAuthenticated() {
		return authenticated;
	}
	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static final boolean basicValidation(IdentityDTO identity){
		
		System.out.println("Ejecutando una validación básica de identity: " + identity);
		
		if ( identity != null && identity.getUser() != null && !identity.getUser().isEmpty() 
		&& identity.getPass() != null && !identity.getPass().isEmpty() 
		&& identity.getRole() != null && identity.getRole().getCode() != null && !identity.getRole().getCode().trim().isEmpty() 
		&& !identity.getRole().getCode().trim().equalsIgnoreCase("0")
		){
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "IdentityDTO [id=" + id + ", user=" + user + ", firtName="
				+ firstName + ", lastName=" + lastName + ", role=" + role + ", roleCode=" + role.getCode()
				+ ", email=" + email + ", authenticated=" + authenticated + "]";
	}
	
}
