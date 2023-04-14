package entidades;

public class Empleado extends Persona{
	
	private Double remuneracion;
	private int empleadoId;
	private int salario;
	
	public void aumentarRemuneracion(int porcentaje) {
		
		salario = salario * (1 + porcentaje / 100);
		
	}

	private Double getRemuneracion() {
		return remuneracion;
	}

	private int getEmpleadoId() {
		return empleadoId;
	}

	public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion,
			int empleadoId) {
		super(nombre, apellido, numeroFiscal, direccion);
		this.remuneracion = remuneracion;
		this.empleadoId = empleadoId;
	}

	@Override
	public String toString() {
		return super.toString() + "\nRemuneracion: " + remuneracion + "\nEmpleadoId: " + empleadoId;
	}
}
