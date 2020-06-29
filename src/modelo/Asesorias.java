package modelo;

public class Asesorias {
	private int idAsesoria;
	private String detalleAsesoria;
	private String gestionAsesoria;
	private String propuestaAsesoria;
	private String fechaAsesoria;
	private String especialAsesoria;
	private int idVisitaAsesoria;
	
	
	public Asesorias(int idAsesoria, String detalleAsesoria, String gestionAsesoria, String propuestaAsesoria,
			String fechaAsesoria, String especialAsesoria, int idVisitaAsesoria) {
		this.idAsesoria = idAsesoria;
		this.detalleAsesoria = detalleAsesoria;
		this.gestionAsesoria = gestionAsesoria;
		this.propuestaAsesoria = propuestaAsesoria;
		this.fechaAsesoria = fechaAsesoria;
		this.especialAsesoria = especialAsesoria;
		this.idVisitaAsesoria = idVisitaAsesoria;
	}


	public int getIdAsesoria() {
		return idAsesoria;
	}


	public void setIdAsesoria(int idAsesoria) {
		this.idAsesoria = idAsesoria;
	}


	public String getDetalleAsesoria() {
		return detalleAsesoria;
	}


	public void setDetalleAsesoria(String detalleAsesoria) {
		this.detalleAsesoria = detalleAsesoria;
	}


	public String getGestionAsesoria() {
		return gestionAsesoria;
	}


	public void setGestionAsesoria(String gestionAsesoria) {
		this.gestionAsesoria = gestionAsesoria;
	}


	public String getPropuestaAsesoria() {
		return propuestaAsesoria;
	}


	public void setPropuestaAsesoria(String propuestaAsesoria) {
		this.propuestaAsesoria = propuestaAsesoria;
	}


	public String getFechaAsesoria() {
		return fechaAsesoria;
	}


	public void setFechaAsesoria(String fechaAsesoria) {
		this.fechaAsesoria = fechaAsesoria;
	}


	public String getEspecialAsesoria() {
		return especialAsesoria;
	}


	public void setEspecialAsesoria(String especialAsesoria) {
		this.especialAsesoria = especialAsesoria;
	}


	public int getIdVisitaAsesoria() {
		return idVisitaAsesoria;
	}


	public void setIdVisitaAsesoria(int idVisitaAsesoria) {
		this.idVisitaAsesoria = idVisitaAsesoria;
	}


	@Override
	public String toString() {
		return "Asesorias [idAsesoria=" + idAsesoria + ", detalleAsesoria=" + detalleAsesoria + ", gestionAsesoria="
				+ gestionAsesoria + ", propuestaAsesoria=" + propuestaAsesoria + ", fechaAsesoria=" + fechaAsesoria
				+ ", especialAsesoria=" + especialAsesoria + ", idVisitaAsesoria=" + idVisitaAsesoria + "]";
	}
	
	
	
	

}
