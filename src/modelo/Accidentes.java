package modelo;

public class Accidentes {
	private int idAccidente;
	private String fechaAccidente;
	private String horaAccidente;
	private String sucesoAccidente;
	private String lugarAccidente;
	private int clienteIdAcciedente;
	
	public Accidentes(int idAccidente, String fechaAccidente, String horaAccidente, String sucesoAccidente,
			String lugarAccidente, int clienteIdAcciedente) {
		this.idAccidente = idAccidente;
		this.fechaAccidente = fechaAccidente;
		this.horaAccidente = horaAccidente;
		this.sucesoAccidente = sucesoAccidente;
		this.lugarAccidente = lugarAccidente;
		this.clienteIdAcciedente = clienteIdAcciedente;
	}

	public Accidentes(String fechaAccidente, String horaAccidente, String sucesoAccidente,
			String lugarAccidente, int clienteIdAcciedente) {
		this.fechaAccidente = fechaAccidente;
		this.horaAccidente = horaAccidente;
		this.sucesoAccidente = sucesoAccidente;
		this.lugarAccidente = lugarAccidente;
		this.clienteIdAcciedente = clienteIdAcciedente;
	}
	
	public Accidentes() {
		
	}
	public int getIdAccidente() {
		return idAccidente;
	}

	public void setIdAccidente(int idAccidente) {
		this.idAccidente = idAccidente;
	}

	public String getFechaAccidente() {
		return fechaAccidente;
	}

	public void setFechaAccidente(String fechaAccidente) {
		this.fechaAccidente = fechaAccidente;
	}

	public String getHoraAccidente() {
		return horaAccidente;
	}

	public void setHoraAccidente(String horaAccidente) {
		this.horaAccidente = horaAccidente;
	}

	public String getSucesoAccidente() {
		return sucesoAccidente;
	}

	public void setSucesoAccidente(String sucesoAccidente) {
		this.sucesoAccidente = sucesoAccidente;
	}

	public String getLugarAccidente() {
		return lugarAccidente;
	}

	public void setLugarAccidente(String lugarAccidente) {
		this.lugarAccidente = lugarAccidente;
	}

	public int getClienteIdAcciedente() {
		return clienteIdAcciedente;
	}

	public void setClienteIdAcciedente(int clienteIdAcciedente) {
		this.clienteIdAcciedente = clienteIdAcciedente;
	}

	@Override
	public String toString() {
		return "Accidentes [idAccidente=" + idAccidente + ", fechaAccidente=" + fechaAccidente + ", horaAccidente="
				+ horaAccidente + ", sucesoAccidente=" + sucesoAccidente + ", lugarAccidente=" + lugarAccidente
				+ ", clienteIdAcciedente=" + clienteIdAcciedente + "]";
	}
	
	
	
	

} 
