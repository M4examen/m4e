package modelo;

public class Visitas {
	private int idVisita;
	private String direccionVisita;
	private String ciudadVisita;
	private String fechaVisita;
	private String resumenVisita;
	private String observacionVisita;
	private int idClienteVisita;
	private int idEmpleadoVisita;
	
	
	public Visitas(int idVisita, String direccionVisita, String ciudadVisita, String fechaVisita, String resumenVisita,
			String observacionVisita, int idClienteVisita, int idEmpleadoVisita) {
		this.idVisita = idVisita;
		this.direccionVisita = direccionVisita;
		this.ciudadVisita = ciudadVisita;
		this.fechaVisita = fechaVisita;
		this.resumenVisita = resumenVisita;
		this.observacionVisita = observacionVisita;
		this.idClienteVisita = idClienteVisita;
		this.idEmpleadoVisita = idEmpleadoVisita;
	}
	
	public Visitas(String direccionVisita, String ciudadVisita, String fechaVisita, String resumenVisita,
			String observacionVisita, int idClienteVisita, int idEmpleadoVisita) {
		this.direccionVisita = direccionVisita;
		this.ciudadVisita = ciudadVisita;
		this.fechaVisita = fechaVisita;
		this.resumenVisita = resumenVisita;
		this.observacionVisita = observacionVisita;
		this.idClienteVisita = idClienteVisita;
		this.idEmpleadoVisita = idEmpleadoVisita;
	}

	public Visitas() {
		
	}

	public int getIdVisita() {
		return idVisita;
	}


	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}


	public String getDireccionVisita() {
		return direccionVisita;
	}


	public void setDireccionVisita(String direccionVisita) {
		this.direccionVisita = direccionVisita;
	}


	public String getCiudadVisita() {
		return ciudadVisita;
	}


	public void setCiudadVisita(String ciudadVisita) {
		this.ciudadVisita = ciudadVisita;
	}


	public String getFechaVisita() {
		return fechaVisita;
	}


	public void setFechaVisita(String fechaVisita) {
		this.fechaVisita = fechaVisita;
	}


	public String getResumenVisita() {
		return resumenVisita;
	}


	public void setResumenVisita(String resumenVisita) {
		this.resumenVisita = resumenVisita;
	}


	public String getObservacionVisita() {
		return observacionVisita;
	}


	public void setObservacionVisita(String observacionVisita) {
		this.observacionVisita = observacionVisita;
	}


	public int getIdClienteVisita() {
		return idClienteVisita;
	}


	public void setIdClienteVisita(int idClienteVisita) {
		this.idClienteVisita = idClienteVisita;
	}


	public int getIdEmpleadoVisita() {
		return idEmpleadoVisita;
	}


	public void setIdEmpleadoVisita(int idEmpleadoVisita) {
		this.idEmpleadoVisita = idEmpleadoVisita;
	}


	@Override
	public String toString() {
		return "Visitas [idVisita=" + idVisita + ", direccionVisita=" + direccionVisita + ", ciudadVisita="
				+ ciudadVisita + ", fechaVisita=" + fechaVisita + ", resumenVisita=" + resumenVisita
				+ ", observacionVisita=" + observacionVisita + ", idClienteVisita=" + idClienteVisita
				+ ", idEmpleadoVisita=" + idEmpleadoVisita + "]";
	}
	
	
	
	

}
