import java.time.LocalDate;

public class TarjetaCredito extends Tarjeta {

	private double limiteCredito;
	private int limiteCuotas;
	private double deudaActual;
	private double deudaMensual;
	public TarjetaCredito(String titular, String numeroTarjeta, LocalDate fechaExpiracion, String cvv,
			double limiteCredito, int limiteCuotas, double deudaActual, double deudaMensual) {
		super(titular, numeroTarjeta, fechaExpiracion, cvv);
		this.limiteCredito = limiteCredito;
		this.limiteCuotas = limiteCuotas;
		this.deudaActual = deudaActual;
		this.deudaMensual = deudaMensual;
	}
	public double getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	public int getLimiteCuotas() {
		return limiteCuotas;
	}
	public void setLimiteCuotas(int limiteCuotas) {
		this.limiteCuotas = limiteCuotas;
	}
	public double getDeudaActual() {
		return deudaActual;
	}
	public void setDeudaActual(double deudaActual) {
		this.deudaActual = deudaActual;
	}
	public double getDeudaMensual() {
		return deudaMensual;
	}
	public void setDeudaMensual(double deudaMensual) {
		this.deudaMensual = deudaMensual;
	}
	@Override
	public String toString() {
		return "TarjetaCredito [limiteCredito=" + limiteCredito + ", limiteCuotas=" + limiteCuotas + ", deudaActual="
				+ deudaActual + ", deudaMensual=" + deudaMensual + "]";
	}
	
	@Override
	public boolean pagar(double monto) {
		
			
				return true;
				
	}
	
}
