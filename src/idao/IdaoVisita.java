package idao;
/**
 * Interfaz que contiene los metodo que se implementaran sobre el modelo
 * Visitas en este caso es un CRUD
 * */

import java.util.List;
import modelo.Visitas;
import modelo.VisitasGeneradas;

public interface IdaoVisita {
	
	public boolean agregar(Visitas visita);
	public List<Visitas> listar();
	public List<VisitasGeneradas> listaGenerada();
	public boolean eliminar (Visitas visita);
	public boolean actualizar(Visitas visita);
	public Visitas buscar(int visitaid);

}
