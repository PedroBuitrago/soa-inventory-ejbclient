package co.com.qabox.soainv.to.identity;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PermissionDTO")
@XmlAccessorType( XmlAccessType.FIELD )
public class PermissionDTO {

	@XmlAttribute
	@NotNull
	private Long id;
	@XmlAttribute
	@NotNull
	private String name;
	@XmlAttribute
	@NotNull
	private String businessObject;
	@XmlAttribute
	private byte[] CRUD = {0,0,0,0};
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBusinessObject() {
		return businessObject;
	}
	public void setBusinessObject(String businessObject) {
		this.businessObject = businessObject;
	}
	public byte[] getCRUD() {
		return CRUD;
	}
	public void setCRUD(byte[] cRUD) {
		CRUD = cRUD;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
}
