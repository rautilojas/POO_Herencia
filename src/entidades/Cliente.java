package entidades;

public class Cliente extends Persona{
	
	private int clienteId;

	private int getClienteId() {
		return clienteId;
	}

	public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int clienteId) {
		super(nombre, apellido, numeroFiscal, direccion);
		this.clienteId = clienteId;
	}

	@Override
	public String toString() {
		return "ClienteId: " + clienteId;
	}
}
