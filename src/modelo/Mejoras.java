package modelo;

public class Mejoras {
	private int idMejora;
	private String fechaMejora;
	private String motivoMejora;
	private String actividadesMejora;
	private String estadoMejora;
	private int idClienteMejora;
	
	public Mejoras(int idMejora, String fechaMejora, String motivoMejora, String actividadesMejora, String estadoMejora,
			int idClienteMejora) {
		this.idMejora = idMejora;
		this.fechaMejora = fechaMejora;
		this.motivoMejora = motivoMejora;
		this.actividadesMejora = actividadesMejora;
		this.estadoMejora = estadoMejora;
		this.idClienteMejora = idClienteMejora;
	}

	public Mejoras(String fechaMejora, String motivoMejora, String actividadesMejora, String estadoMejora,
			int idClienteMejora) {
		this.fechaMejora = fechaMejora;
		this.motivoMejora = motivoMejora;
		this.actividadesMejora = actividadesMejora;
		this.estadoMejora = estadoMejora;
		this.idClienteMejora = idClienteMejora;
	}

	public Mejoras() {
		
	}
	
	public int getIdMejora() {
		return idMejora;
	}

	public void setIdMejora(int idMejora) {
		this.idMejora = idMejora;
	}

	public String getFechaMejora() {
		return fechaMejora;
	}

	public void setFechaMejora(String fechaMejora) {
		this.fechaMejora = fechaMejora;
	}

	public String getMotivoMejora() {
		return motivoMejora;
	}

	public void setMotivoMejora(String motivoMejora) {
		this.motivoMejora = motivoMejora;
	}

	public String getActividadesMejora() {
		return actividadesMejora;
	}

	public void setActividadesMejora(String actividadesMejora) {
		this.actividadesMejora = actividadesMejora;
	}

	public String getEstadoMejora() {
		return estadoMejora;
	}

	public void setEstadoMejora(String estadoMejora) {
		this.estadoMejora = estadoMejora;
	}

	public int getIdClienteMejora() {
		return idClienteMejora;
	}

	public void setIdClienteMejora(int idClienteMejora) {
		this.idClienteMejora = idClienteMejora;
	}

	@Override
	public String toString() {
		return "Mejoras [idMejora=" + idMejora + ", fechaMejora=" + fechaMejora + ", motivoMejora=" + motivoMejora
				+ ", actividadesMejora=" + actividadesMejora + ", estadoMejora=" + estadoMejora + ", idClienteMejora="
				+ idClienteMejora + "]";
	}
		
	
	
	
	

}
