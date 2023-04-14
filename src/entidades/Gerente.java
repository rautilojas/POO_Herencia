package entidades;

public class Gerente extends Empleado {
	
	private Double presupuesto;

	private Double getPresupuesto() {
		return presupuesto;
	}

	private void setPresupuesto(Double presupuesto) {
		this.presupuesto = presupuesto;
	}

	public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion,
			int empleadoId, Double presupuesto) {
		super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadoId);
		this.presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		return super.toString() + "\nPresupuesto: " + presupuesto;
	}	
	
}