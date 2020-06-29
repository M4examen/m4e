package modelo;

public class MejorasVista {
	private int idmejora;
	private int idclientemejora;
	private String fechamejora;
	private String nombrecliente;
	private String motivomejora;
	private String actividadesmejora;
	private String estadomejora;
	
	public MejorasVista(int idmejora, int idclientemejora, String fechamejora, String nombrecliente,
			String motivomejora, String actividadesmejora, String estadomejora) {
		this.idmejora = idmejora;
		this.idclientemejora = idclientemejora;
		this.fechamejora = fechamejora;
		this.nombrecliente = nombrecliente;
		this.motivomejora = motivomejora;
		this.actividadesmejora = actividadesmejora;
		this.estadomejora = estadomejora;
	}
	
	public MejorasVista() {
		
	}

	public int getIdmejora() {
		return idmejora;
	}

	public void setIdmejora(int idmejora) {
		this.idmejora = idmejora;
	}

	public int getIdclientemejora() {
		return idclientemejora;
	}

	public void setIdclientemejora(int idclientemejora) {
		this.idclientemejora = idclientemejora;
	}

	public String getFechamejora() {
		return fechamejora;
	}

	public void setFechamejora(String fechamejora) {
		this.fechamejora = fechamejora;
	}

	public String getNombrecliente() {
		return nombrecliente;
	}

	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}

	public String getMotivomejora() {
		return motivomejora;
	}

	public void setMotivomejora(String motivomejora) {
		this.motivomejora = motivomejora;
	}

	public String getActividadesmejora() {
		return actividadesmejora;
	}

	public void setActividadesmejora(String actividadesmejora) {
		this.actividadesmejora = actividadesmejora;
	}

	public String getEstadomejora() {
		return estadomejora;
	}

	public void setEstadomejora(String estadomejora) {
		this.estadomejora = estadomejora;
	}

	@Override
	public String toString() {
		return "MejorasVista [idmejora=" + idmejora + ", idclientemejora=" + idclientemejora + ", fechamejora="
				+ fechamejora + ", nombrecliente=" + nombrecliente + ", motivomejora=" + motivomejora
				+ ", actividadesmejora=" + actividadesmejora + ", estadomejora=" + estadomejora + "]";
	}
	
}
