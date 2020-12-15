package ec.ups.edu.ExamenSanchezLuisServidor.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.ups.edu.ExamenSanchezLuisServidor.modelo.Productos;

@Stateless
public class ProductosDao {
	
	@Inject
	private EntityManager em;
	
	private ResultSet res;
	
	/**
	 * Metodo para crear un Producto utilizando JPA
	 * 
	 * @param entity
	 * @return
	 * @throws SQLException
	 */
	public boolean insertProducto(Productos entity) throws SQLException {
		em.persist(entity);
		return true;
	}

	/**
	 * Metodo para leer un Producto mediante el nombre  con JPA
	 * 
	 * @param nombre
	 * @return
	 * @throws SQLException
	 */
	public Productos readProducto(String nombre) throws SQLException {
		Productos productos = em.find(Productos.class, nombre);
		return productos;
	}

	/**
	 * Metodo para actualizar un productos con JPA
	 * 
	 * @param productos
	 * @return
	 * @throws SQLException
	 */
	public boolean updateProducto(Productos productos) throws SQLException {
		em.merge(productos);
		return true;
	}

	/**
	 * Metodo para eliminar un productos mediante el nombre
	 * 
	 * @param nombre
	 * @return
	 * @throws SQLException
	 */
	public boolean deleteProducto(String nombre) throws SQLException {
		em.remove(readProducto(nombre));
		return true;
	}
	
	
	public List<Productos> getProducto(){
		String jpdl = "SELECT c FROM Productos c ";
		Query q = em.createQuery(jpdl, Productos.class);
		List<Productos> listado = q.getResultList();
		//q.setParameter(1, Nombre);
		return  listado;
	}
	
	public Productos buscaProducto(String nombre){
		Productos productos = new Productos();
		String jpdl = "SELECT c FROM Productos c WHERE nombre = ?1 ";
		Query q = em.createQuery(jpdl, Productos.class);
		q.setParameter(1, nombre);
		return  productos;
	}
	

}
