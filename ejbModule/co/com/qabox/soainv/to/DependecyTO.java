package co.com.qabox.soainv.to;

import java.io.Serializable;
import java.util.HashMap;

public class DependecyTO extends AbstractTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -737559022289017314L;

	private HashMap<String, Object> features;

	public HashMap<String, Object> getFeatures() {
		return features;
	}

	public void setFeatures(HashMap<String, Object> features) {
		this.features = features;
	}
	
	
	
}
