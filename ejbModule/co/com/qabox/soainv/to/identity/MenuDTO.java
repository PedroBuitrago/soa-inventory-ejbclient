package co.com.qabox.soainv.to.identity;

import java.util.Collection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Menu")
@XmlAccessorType( XmlAccessType.FIELD )
public class MenuDTO {

	@XmlAttribute
	private String name;
	@XmlAttribute
	private String url;
	@XmlAttribute
	private String uri;
	@XmlAttribute
	private String level;
	@XmlAttribute
	private Collection<MenuDTO> subMenu;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public Collection<MenuDTO> getSubMenu() {
		return subMenu;
	}
	public void setSubMenu(Collection<MenuDTO> subMenu) {
		this.subMenu = subMenu;
	}

	
	
}
