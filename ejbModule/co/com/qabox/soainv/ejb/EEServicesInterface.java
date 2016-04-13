package co.com.qabox.soainv.ejb;

import java.util.List;

import co.com.qabox.soainv.exception.SoaInventoryException;

public interface EEServicesInterface<T> {

	public void edit(T entity) throws SoaInventoryException;
	public void remove(T entity) throws SoaInventoryException;
	public void create(T entity) throws SoaInventoryException;
	public List<T> findAll() throws SoaInventoryException;
	public T find(Object id) throws SoaInventoryException;
	public List<T> findRange(int[] range) throws SoaInventoryException;
	public int count() throws SoaInventoryException;
	
}
