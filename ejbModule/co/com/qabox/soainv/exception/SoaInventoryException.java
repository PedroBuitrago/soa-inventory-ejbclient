package co.com.qabox.soainv.exception;

public class SoaInventoryException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -666900188016211323L;

	public SoaInventoryException(String message, Throwable t){
		super(message, t);
	}
	
	public SoaInventoryException(String message){
		super(message);
	}
}
