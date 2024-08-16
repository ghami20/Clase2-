import java.time.LocalDate;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class TarjetaCredito extends Tarjeta {

	private double limiteCredito;
	private int limiteCuotas;
	private double deudaActual;
	private double deudaMensual;
	private LinkedList<Detalle> resumen = new LinkedList<Detalle>();
	public TarjetaCredito(Titular titular, String numeroTarjeta, LocalDate fechaExpiracion, String cvv,
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
	
	
	
	public LinkedList<Detalle> getResumen() {
		return resumen;
	}
	public void setResumen(LinkedList<Detalle> resumen) {
		this.resumen = resumen;
	}
	@Override
	public boolean pagar(double monto) {		
		//Valido que la fecha expiración de la tarjeta, sea despues de hoy
		if (this.getFechaExpiracion().isAfter(LocalDate.now())) {
			
			if (this.getLimiteCredito() >= this.getDeudaActual() + monto)  {
				String[] cuotas = {
						"1 cuota","3 cuotas","6 cuotas"
				};
				int cuotasElegidas = JOptionPane.showOptionDialog(null, "Elija cantidad de cuotas", "", 0, 0, null, cuotas, cuotas[0]);
				int cuotasFormt = 0 ;
				
				if (cuotasElegidas == 0) {
					cuotasFormt=1;
				} else if (cuotasElegidas == 1) {
					 
					cuotasFormt=3;
				}else if (cuotasElegidas == 2) {
					 
					cuotasFormt=6;
				}
				
			Detalle nuevo = new Detalle("Compra x" , monto, cuotasFormt);
			this.getResumen().add(nuevo);
			
			} else {
				JOptionPane.showMessageDialog(null, "Monto excedido");
				return false;
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "Tarjeta vencida");
			return false;
		}
			
				return true;
				
	}
	
}
