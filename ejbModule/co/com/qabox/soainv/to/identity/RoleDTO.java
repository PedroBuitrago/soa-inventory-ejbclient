package co.com.qabox.soainv.to.identity;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="RoleDTO")
@XmlAccessorType( XmlAccessType.FIELD )
public class RoleDTO {

	@XmlAttribute
	@NotNull
	private Long id;
	@XmlAttribute
	@NotNull
	private String name;
	@XmlAttribute
	@NotNull
	private String code;
	
	@XmlAttribute
	private PermissionDTO[] permissions;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PermissionDTO[] getPermissions() {
		return permissions;
	}
	public void setPermissions(PermissionDTO[] permissions) {
		this.permissions = permissions;
	}
	
	
	
}
