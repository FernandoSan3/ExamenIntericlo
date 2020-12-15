package ec.ups.edu.ExamenSanchezLuisServidor.vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.inject.Inject;

import ec.ups.edu.ExamenSanchezLuisServidor.modelo.Productos;
import ec.ups.edu.ExamenSanchezLuisServidor.negocio.GestionProductosON;

@Named
@RequestScoped
public class ProductosBean {

	private Productos newproductos;

	private List<Productos> listproductos;

	@Inject
	private GestionProductosON on;

	public ProductosBean() {

	}

	@PostConstruct
	private void init() {
		// TODO Auto-generated method stub
		newproductos = new Productos();
		listproductos = on.getProducto();
		System.out.println(listproductos);

	}

	public Productos getNewproductos() {
		return newproductos;
	}

	public void setNewproductos(Productos newproductos) {
		this.newproductos = newproductos;
	}

	public List<Productos> getListproductos() {
		return listproductos;
	}

	public void setListproductos(List<Productos> listproductos) {
		this.listproductos = listproductos;
	}

	public String doGuardar() {
		System.out.println(newproductos);
		try {
			on.guardarProductos(newproductos);
			init();
			System.out.println("Guardado satisfactorio");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error al guardar " + e.getMessage());
			e.printStackTrace();
		}
		return "listado-Productos";
	}
	
	public String doActualizar() {
		System.out.println(newproductos);
		try {
			on.updateProducto(newproductos);
			init();
			System.out.println("Actualizacion satisfactorio");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error al actualizar " + e.getMessage());
			e.printStackTrace();
		}
		return "listado-Productos";
	}
	
	public String doEliminar(String nombre) {
		System.out.println(newproductos);
		try {
			on.deleteProducto(nombre);
			init();
			System.out.println("Elimacion satisfactorio");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error al eliminar " + e.getMessage());
			e.printStackTrace();
		}
		return "listado-Productos";
	}
	
	public String doBuscar(String nombre) {
		System.out.println(newproductos);
		try {
			System.out.println("Elimacion satisfactorio");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error al eliminar " + e.getMessage());
			e.printStackTrace();
		}
		return "listado-Productos";
	}
	
	

}
