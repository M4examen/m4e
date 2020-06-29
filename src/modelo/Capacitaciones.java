package modelo;

public class Capacitaciones {
	private int idCapacitacion;
	private String fechaCapacitacion;
	private String horaCapacitacion;
	private int numAsistCapacitacion;
	private int idVisitaCapacitacion;
	
	
	public Capacitaciones(String fechaCapacitacion, String horaCapacitacion,
			int numAsistCapacitacion, int idVisitaCapacitacion) {
		this.fechaCapacitacion = fechaCapacitacion;
		this.horaCapacitacion = horaCapacitacion;
		this.numAsistCapacitacion = numAsistCapacitacion;
		this.idVisitaCapacitacion = idVisitaCapacitacion;
	}
	
	public Capacitaciones(int idCapacitacion, String fechaCapacitacion, String horaCapacitacion,
			int numAsistCapacitacion, int idVisitaCapacitacion) {
		this.idCapacitacion = idCapacitacion;
		this.fechaCapacitacion = fechaCapacitacion;
		this.horaCapacitacion = horaCapacitacion;
		this.numAsistCapacitacion = numAsistCapacitacion;
		this.idVisitaCapacitacion = idVisitaCapacitacion;
	}
	
	
	

	public int getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public String getFechaCapacitacion() {
		return fechaCapacitacion;
	}

	public void setFechaCapacitacion(String fechaCapacitacion) {
		this.fechaCapacitacion = fechaCapacitacion;
	}

	public String getHoraCapacitacion() {
		return horaCapacitacion;
	}

	public void setHoraCapacitacion(String horaCapacitacion) {
		this.horaCapacitacion = horaCapacitacion;
	}

	public int getNumAsistCapacitacion() {
		return numAsistCapacitacion;
	}

	public void setNumAsistCapacitacion(int numAsistCapacitacion) {
		this.numAsistCapacitacion = numAsistCapacitacion;
	}

	public int getIdVisitaCapacitacion() {
		return idVisitaCapacitacion;
	}

	public void setIdVisitaCapacitacion(int idVisitaCapacitacion) {
		this.idVisitaCapacitacion = idVisitaCapacitacion;
	}

	@Override
	public String toString() {
		return "Capacitaciones [idCapacitacion=" + idCapacitacion + ", fechaCapacitacion=" + fechaCapacitacion
				+ ", horaCapacitacion=" + horaCapacitacion + ", numAsistCapacitacion=" + numAsistCapacitacion
				+ ", idVisitaCapacitacion=" + idVisitaCapacitacion + "]";
	};
	
	
	
	

}
