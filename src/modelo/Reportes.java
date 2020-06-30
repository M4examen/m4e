package modelo;

public class Reportes {
	private int idcliente;
	private String nombrecliente;
	private String rubrocliente;
	
	private String fechamejora;
	private String motivomejora;
	private String estadomejora;
	
	private String fechaaccidente;
	private String horaaccidente;
	private String sucesoaccidente;
	private String lugaraccidente;
	
	private String direccionvisita;
	private String fechavisita;
	private String ciudadvisita;
	private String resumenvisita;
	private String nombremepleado;
	
	private String fechacapacitacion;
	private String horacapacitacion;
	private String numasistcapacitacion;
	
	
	public Reportes(int idcliente, String nombrecliente, String rubrocliente, String fechamejora, String motivomejora,
			String estadomejora, String fechaaccidente, String horaaccidente, String sucesoaccidente,
			String lugaraccidente, String direccionvisita, String fechavisita, String ciudadvisita,
			String resumenvisita, String nombremepleado, String fechacapacitacion, String horacapacitacion,
			String numasistcapacitacion) {
		this.idcliente = idcliente;
		this.nombrecliente = nombrecliente;
		this.rubrocliente = rubrocliente;
		this.fechamejora = fechamejora;
		this.motivomejora = motivomejora;
		this.estadomejora = estadomejora;
		this.fechaaccidente = fechaaccidente;
		this.horaaccidente = horaaccidente;
		this.sucesoaccidente = sucesoaccidente;
		this.lugaraccidente = lugaraccidente;
		this.direccionvisita = direccionvisita;
		this.fechavisita = fechavisita;
		this.ciudadvisita = ciudadvisita;
		this.resumenvisita = resumenvisita;
		this.nombremepleado = nombremepleado;
		this.fechacapacitacion = fechacapacitacion;
		this.horacapacitacion = horacapacitacion;
		this.numasistcapacitacion = numasistcapacitacion;
	}
	
	/*constuctor reporte mejoras especifico y global*/
	public Reportes(int idcliente, String nombrecliente, String rubrocliente, String fechamejora, String motivomejora,
			String estadomejora) {
		this.idcliente = idcliente;
		this.nombrecliente = nombrecliente;
		this.rubrocliente = rubrocliente;
		this.fechamejora = fechamejora;
		this.motivomejora = motivomejora;
		this.estadomejora = estadomejora;
	}
	
	
	/*constuctor reporte accidentes especifico y global*/
	public Reportes(int idcliente, String nombrecliente, String rubrocliente, String fechaaccidente, String horaaccidente, String sucesoaccidente,
			String lugaraccidente) {
		this.idcliente = idcliente;
		this.nombrecliente = nombrecliente;
		this.rubrocliente = rubrocliente;
		this.fechaaccidente = fechaaccidente;
		this.horaaccidente = horaaccidente;
		this.sucesoaccidente = sucesoaccidente;
		this.lugaraccidente = lugaraccidente;
	}
	
	/*constuctor reporte visita especifico y global*/
	public Reportes(int idcliente, String nombrecliente, String rubrocliente, String direccionvisita, String fechavisita, String ciudadvisita,
			String resumenvisita, String nombremepleado) {
		this.idcliente = idcliente;
		this.nombrecliente = nombrecliente;
		this.rubrocliente = rubrocliente;
		this.direccionvisita = direccionvisita;
		this.fechavisita = fechavisita;
		this.ciudadvisita = ciudadvisita;
		this.resumenvisita = resumenvisita;
		this.nombremepleado = nombremepleado;
	}
	
	/*constuctor reporte visita y capacitacion especifico y global*/
	public Reportes(int idcliente, String nombrecliente, String rubrocliente, String direccionvisita, String fechavisita, String ciudadvisita,
			String resumenvisita, String nombremepleado, String fechacapacitacion, String horacapacitacion,
			String numasistcapacitacion) {
		this.idcliente = idcliente;
		this.nombrecliente = nombrecliente;
		this.rubrocliente = rubrocliente;
		this.direccionvisita = direccionvisita;
		this.fechavisita = fechavisita;
		this.ciudadvisita = ciudadvisita;
		this.resumenvisita = resumenvisita;
		this.nombremepleado = nombremepleado;
		this.fechacapacitacion = fechacapacitacion;
		this.horacapacitacion = horacapacitacion;
		this.numasistcapacitacion = numasistcapacitacion;
	}
	
	public Reportes() {
		
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNombrecliente() {
		return nombrecliente;
	}

	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}

	public String getRubrocliente() {
		return rubrocliente;
	}

	public void setRubrocliente(String rubrocliente) {
		this.rubrocliente = rubrocliente;
	}

	public String getFechamejora() {
		return fechamejora;
	}

	public void setFechamejora(String fechamejora) {
		this.fechamejora = fechamejora;
	}

	public String getMotivomejora() {
		return motivomejora;
	}

	public void setMotivomejora(String motivomejora) {
		this.motivomejora = motivomejora;
	}

	public String getEstadomejora() {
		return estadomejora;
	}

	public void setEstadomejora(String estadomejora) {
		this.estadomejora = estadomejora;
	}

	public String getFechaaccidente() {
		return fechaaccidente;
	}

	public void setFechaaccidente(String fechaaccidente) {
		this.fechaaccidente = fechaaccidente;
	}

	public String getHoraaccidente() {
		return horaaccidente;
	}

	public void setHoraaccidente(String horaaccidente) {
		this.horaaccidente = horaaccidente;
	}

	public String getSucesoaccidente() {
		return sucesoaccidente;
	}

	public void setSucesoaccidente(String sucesoaccidente) {
		this.sucesoaccidente = sucesoaccidente;
	}

	public String getLugaraccidente() {
		return lugaraccidente;
	}

	public void setLugaraccidente(String lugaraccidente) {
		this.lugaraccidente = lugaraccidente;
	}

	public String getDireccionvisita() {
		return direccionvisita;
	}

	public void setDireccionvisita(String direccionvisita) {
		this.direccionvisita = direccionvisita;
	}

	public String getFechavisita() {
		return fechavisita;
	}

	public void setFechavisita(String fechavisita) {
		this.fechavisita = fechavisita;
	}

	public String getCiudadvisita() {
		return ciudadvisita;
	}

	public void setCiudadvisita(String ciudadvisita) {
		this.ciudadvisita = ciudadvisita;
	}

	public String getResumenvisita() {
		return resumenvisita;
	}

	public void setResumenvisita(String resumenvisita) {
		this.resumenvisita = resumenvisita;
	}

	public String getNombremepleado() {
		return nombremepleado;
	}

	public void setNombremepleado(String nombremepleado) {
		this.nombremepleado = nombremepleado;
	}

	public String getFechacapacitacion() {
		return fechacapacitacion;
	}

	public void setFechacapacitacion(String fechacapacitacion) {
		this.fechacapacitacion = fechacapacitacion;
	}

	public String getHoracapacitacion() {
		return horacapacitacion;
	}

	public void setHoracapacitacion(String horacapacitacion) {
		this.horacapacitacion = horacapacitacion;
	}

	public String getNumasistcapacitacion() {
		return numasistcapacitacion;
	}

	public void setNumasistcapacitacion(String numasistcapacitacion) {
		this.numasistcapacitacion = numasistcapacitacion;
	}

	@Override
	public String toString() {
		return "Reportes [idcliente=" + idcliente + ", nombrecliente=" + nombrecliente + ", rubrocliente="
				+ rubrocliente + ", fechamejora=" + fechamejora + ", motivomejora=" + motivomejora + ", estadomejora="
				+ estadomejora + ", fechaaccidente=" + fechaaccidente + ", horaaccidente=" + horaaccidente
				+ ", sucesoaccidente=" + sucesoaccidente + ", lugaraccidente=" + lugaraccidente + ", direccionvisita="
				+ direccionvisita + ", fechavisita=" + fechavisita + ", ciudadvisita=" + ciudadvisita
				+ ", resumenvisita=" + resumenvisita + ", nombremepleado=" + nombremepleado + ", fechacapacitacion="
				+ fechacapacitacion + ", horacapacitacion=" + horacapacitacion + ", numasistcapacitacion="
				+ numasistcapacitacion + "]";
	}
	
	
}
