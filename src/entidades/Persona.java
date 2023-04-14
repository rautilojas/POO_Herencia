package entidades;

public class Persona {
		
		private String nombre;
		private String apellido;
		private String numeroFiscal;
		private String direccion;
		
		private String getNombre() {
			return nombre;
		}
		private String getApellido() {
			return apellido;
		}
		private String getNumeroFiscal() {
			return numeroFiscal;
		}
		private String getDireccion() {
			return direccion;
		}
		
		public Persona(String nombre, String apellido, String numeroFiscal, String direccion) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.numeroFiscal = numeroFiscal;
			this.direccion = direccion;
		}
		
		@Override
		public String toString() {
			return "Nombre: " + nombre + "\nApellido: " + apellido + "\nNumero Fiscal: " + numeroFiscal + "\nDireccion: " + direccion;
		}
}