import java.time.LocalDate;

public class Tarjeta {

	private Titular titular;
	private String numeroTarjeta;
	private LocalDate fechaExpiracion;
	private String cvv;
	
	//Constructor
	public Tarjeta(Titular titular, String numeroTarjeta, LocalDate fechaExpiracion, String cvv) {
		super();
		this.titular = titular;
		this.numeroTarjeta = numeroTarjeta;
		this.fechaExpiracion = fechaExpiracion;
		this.cvv = cvv;
	}

	
	//Get y set
	public Titular getTitular() {
		return titular;
	}
	
	public void setTitular(Titular titular) {
		this.titular = titular;
	}
	
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	
	public LocalDate getFechaExpiracion() {
		return fechaExpiracion;
	}
	
	public void setFechaExpiracion(LocalDate fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}
	
	public String getCvv() {
		return cvv;
	}
	
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	//tostring

	@Override
	public String toString() {
		return "Tarjeta [titular=" + titular + ", numeroTarjeta=" + numeroTarjeta + ", fechaExpiracion="
				+ fechaExpiracion + ", cvv=" + cvv + "]";
	}
	

	public boolean pagar(double monto) {
		
		return true;
		
	}
	
	
	
}
