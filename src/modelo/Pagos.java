package modelo;

public class Pagos {
	private int idPago;
	private String mesAnioPago;
	private int montoRegularPago;
	private int montoAdicionalPago;
	private int idClientePago;
	
	public Pagos(int idPago, String mesAnioPago, int montoRegularPago, int montoAdicionalPago, int idClientePago) {
		this.idPago = idPago;
		this.mesAnioPago = mesAnioPago;
		this.montoRegularPago = montoRegularPago;
		this.montoAdicionalPago = montoAdicionalPago;
		this.idClientePago = idClientePago;
	}

	public int getIdPago() {
		return idPago;
	}

	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}

	public String getMesAnioPago() {
		return mesAnioPago;
	}

	public void setMesAnioPago(String mesAnioPago) {
		this.mesAnioPago = mesAnioPago;
	}

	public int getMontoRegularPago() {
		return montoRegularPago;
	}

	public void setMontoRegularPago(int montoRegularPago) {
		this.montoRegularPago = montoRegularPago;
	}

	public int getMontoAdicionalPago() {
		return montoAdicionalPago;
	}

	public void setMontoAdicionalPago(int montoAdicionalPago) {
		this.montoAdicionalPago = montoAdicionalPago;
	}

	public int getIdClientePago() {
		return idClientePago;
	}

	public void setIdClientePago(int idClientePago) {
		this.idClientePago = idClientePago;
	}

	@Override
	public String toString() {
		return "Pagos [idPago=" + idPago + ", mesAnioPago=" + mesAnioPago + ", montoRegularPago=" + montoRegularPago
				+ ", montoAdicionalPago=" + montoAdicionalPago + ", idClientePago=" + idClientePago + "]";
	}
	
	
	

}
