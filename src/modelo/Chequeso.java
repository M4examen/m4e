package modelo;

public class Chequeso {
	private int idChequeo;
	private String detalleChequeo;
	private String estadoChequeo;
	private int idVisitaChequeo;
	
	public Chequeso(int idChequeo, String detalleChequeo, String estadoChequeo, int idVisitaChequeo) {
		this.idChequeo = idChequeo;
		this.detalleChequeo = detalleChequeo;
		this.estadoChequeo = estadoChequeo;
		this.idVisitaChequeo = idVisitaChequeo;
	}

	public int getIdChequeo() {
		return idChequeo;
	}

	public void setIdChequeo(int idChequeo) {
		this.idChequeo = idChequeo;
	}

	public String getDetalleChequeo() {
		return detalleChequeo;
	}

	public void setDetalleChequeo(String detalleChequeo) {
		this.detalleChequeo = detalleChequeo;
	}

	public String getEstadoChequeo() {
		return estadoChequeo;
	}

	public void setEstadoChequeo(String estadoChequeo) {
		this.estadoChequeo = estadoChequeo;
	}

	public int getIdVisitaChequeo() {
		return idVisitaChequeo;
	}

	public void setIdVisitaChequeo(int idVisitaChequeo) {
		this.idVisitaChequeo = idVisitaChequeo;
	}

	@Override
	public String toString() {
		return "Chequeso [idChequeo=" + idChequeo + ", detalleChequeo=" + detalleChequeo + ", estadoChequeo="
				+ estadoChequeo + ", idVisitaChequeo=" + idVisitaChequeo + "]";
	}
	
	

}
