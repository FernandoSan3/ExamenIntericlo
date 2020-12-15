package ec.ups.edu.ExamenSanchezLuisServidor.negocio;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.ExamenSanchezLuisServidor.dao.ProductosDao;
import ec.ups.edu.ExamenSanchezLuisServidor.modelo.Productos;

@Stateless
public class GestionProductosON {

	@Inject
	private ProductosDao productosDao;

	public boolean guardarProductos(Productos productos) throws Exception {

		try {
			productosDao.insertProducto(productos);
			System.out.println("Guardar Ok");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Error al registra Producto");
		}
		return true;
	}

	public List<Productos> getProducto() {
		return productosDao.getProducto();
	}

	public boolean updateProducto(Productos productos) throws Exception {

		try {
			productosDao.updateProducto(productos);
			System.out.println("Actualizar Ok");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Error al actualizar Producto");
		}
		return true;
	}
	
	public boolean deleteProducto(String nombre) throws Exception {

		try {
			productosDao.deleteProducto(nombre);
			System.out.println("Elimina Ok");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Error al eliminar Producto");
		}
		return true;
	}
}
