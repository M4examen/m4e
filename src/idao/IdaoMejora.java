package idao;
/**
 * Interfaz que contiene los metodo que se implementaran sobre el modelo
 * Mejoras en este caso es un CRUD
 * */

import java.util.List;
import modelo.Mejoras;
import modelo.MejorasVista;
public interface IdaoMejora {
	
	public boolean agregar(Mejoras mejora);
	public List<Mejoras> listar();
	public List<MejorasVista> listarMejoras();
	public boolean eliminar (Mejoras mejora);
	public boolean actualizar(Mejoras mejora);
	public Mejoras buscar(int mejoraid);

}
