package idao;

import java.util.List;

import modelo.Clientes;

public interface IdaoClientes {

	public boolean agregar(Clientes cliente);
	public List<Clientes> listar();
	public boolean actualizar(Clientes cliente);
	public boolean eliminar(Clientes cliente);
	public Clientes buscar(int clienteid);
	
}
