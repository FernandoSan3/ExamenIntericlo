package ec.ups.edu.ExamenSanchezLuisServidor.negocio;

import java.util.List;

import javax.ejb.Remote;

import ec.ups.edu.ExamenSanchezLuisServidor.modelo.Productos;
@Remote
public interface GestionProductoRemote {
	
	public boolean guardarProductos(Productos productos) throws Exception;

}
