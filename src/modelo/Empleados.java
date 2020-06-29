package modelo;

public class Empleados {
	private int idEmpleado;
	private String nombreEmpleado;
	private String especialidadEmpleado;
	
	public Empleados(int idEmpleado, String nombreEmpleado, String especialidadEmpleado) {
		this.idEmpleado = idEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.especialidadEmpleado = especialidadEmpleado;
	}
	
	public Empleados(String nombreEmpleado, String especialidadEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
		this.especialidadEmpleado = especialidadEmpleado;
	}
	
	public Empleados() {
		
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getEspecialidadEmpleado() {
		return especialidadEmpleado;
	}

	public void setEspecialidadEmpleado(String especialidadEmpleado) {
		this.especialidadEmpleado = especialidadEmpleado;
	}

	@Override
	public String toString() {
		return "Empleados [idEmpleado=" + idEmpleado + ", nombreEmpleado=" + nombreEmpleado + ", especialidadEmpleado="
				+ especialidadEmpleado + "]";
	}
	
	

}
