package idao;
/**
 * Interfaz que contiene los metodo que se implementaran sobre el modelo
 * Clientes en este caso es un CRUD
 * */

import java.util.List;
import modelo.Clientes;

public interface IdaoCliente {
	
	public boolean agregar(Clientes cliente);
	public List<Clientes> listar();
	public boolean eliminar (Clientes cliente);
	public boolean actualizar(Clientes cliente);
	public Clientes buscar(int clienteid);

}
