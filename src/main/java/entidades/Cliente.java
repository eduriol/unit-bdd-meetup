package entidades;

public class Cliente {

	private String numeroCliente;
	private String nombre;
	private String apellido;

	public Cliente(String numeroCliente, String nombre, String apellido) {
		this.numeroCliente = numeroCliente;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String obtenerNombre() {
		return this.nombre;
	}

	public String obtenerApellido() {
		return this.apellido;
	}

	public String obtenerNumeroCliente() {
		return this.numeroCliente;
	}

}
