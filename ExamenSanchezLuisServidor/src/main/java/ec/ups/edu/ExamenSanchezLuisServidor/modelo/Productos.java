package ec.ups.edu.ExamenSanchezLuisServidor.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Productos{

	/**
	 * 
	 */

	@Id
	@Column(name="id_productos")
	private int id_productos;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="categoria")
	private String categoria;
	
	@Column(name="precio")
	private Double precio;
	

	public int getId_productos() {
		return id_productos;
	}

	public void setId_productos(int id_productos) {
		this.id_productos = id_productos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Productos [id_productos=" + id_productos + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", categoria=" + categoria + ", precio=" + precio + "]";
	}

	

}
