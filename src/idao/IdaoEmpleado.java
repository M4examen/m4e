package idao;

/**
 * Interfaz que contiene los metodo que se implementaran sobre el modelo
 * Empleados en este caso es un CRUD
 * */

import java.util.List;
import modelo.Empleados;

public interface IdaoEmpleado {
	
	public boolean agregar(Empleados empleado);
	public List<Empleados> listar();
	public boolean eliminar (Empleados empleado);
	public boolean actualizar(Empleados empleado);
	public Empleados buscar(int empleadoid);

}
