
public class Detalle {
	
	private String descripcion;
	private double total;
	private int cantCuotas;
	private double pagoxCuota;
	
	public Detalle(String descripcion, double total, int cantCuotas) {
		super();
		this.descripcion = descripcion;
		this.total = total;
		this.cantCuotas = cantCuotas;
		this.pagoxCuota  = total/ cantCuotas;
	}
	
	
	
	
	

}
