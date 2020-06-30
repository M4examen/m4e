package idao;

import java.util.List;

import modelo.Reportes;

public interface IdaoReporte {
	
	public List<Reportes> listarMejoras(int idcli);
	public List<Reportes> listarAccidentes(int idcli);
	public List<Reportes> listarVisitas(int idcli);
	public List<Reportes> listarVisitasCapacitacion(int idcli);

}
