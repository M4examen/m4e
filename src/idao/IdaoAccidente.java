package idao;

import java.util.List;

import modelo.Accidentes;

public interface IdaoAccidente {
	public boolean agregar(Accidentes accidente);
	public List<Accidentes> listar();
	public boolean eliminar (Accidentes accidente);
	public boolean actualizar(Accidentes accidente);
}
