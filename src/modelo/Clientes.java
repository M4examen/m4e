package modelo;

public class Clientes {
	private int idCliente;
	private String nombreCliente;
	private String telefonoCliente;
	private String emailCliente;
	private String rubroCliente;
	private String direccionCliente;
	
	
	
	
	public Clientes(int idCliente, String nombreCliente, String telefonoCliente, String emailCliente, String rubroCliente,
			String direccionCliente) {
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.telefonoCliente = telefonoCliente;
		this.emailCliente = emailCliente;
		this.rubroCliente = rubroCliente;
		this.direccionCliente = direccionCliente;
	}

	public Clientes(String nombreCliente, String telefonoCliente, String emailCliente, String rubroCliente,
			String direccionCliente) {
		this.nombreCliente = nombreCliente;
		this.telefonoCliente = telefonoCliente;
		this.emailCliente = emailCliente;
		this.rubroCliente = rubroCliente;
		this.direccionCliente = direccionCliente;
	}
	
	public Clientes() {
		
	}


	public int getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}


	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	public String getTelefonoCliente() {
		return telefonoCliente;
	}


	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}


	public String getEmailCliente() {
		return emailCliente;
	}


	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}


	public String getRubroCliente() {
		return rubroCliente;
	}


	public void setRubroCliente(String rubroCliente) {
		this.rubroCliente = rubroCliente;
	}


	public String getDireccionCliente() {
		return direccionCliente;
	}


	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}


	@Override
	public String toString() {
		return "Clientes [idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", telefonoCliente="
				+ telefonoCliente + ", emailCliente=" + emailCliente + ", rubroCliente=" + rubroCliente
				+ ", direccionCliente=" + direccionCliente + "]";
	}
	
	
	

}
