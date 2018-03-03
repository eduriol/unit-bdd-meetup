package entidades;

public class Cliente {

	private String numeroCliente;
	private String nombre;
	private String apellido;
	private int numeroDePuntos;
	private static final int NUMERO_INICIAL_DE_PUNTOS = 100;

	public Cliente(String numeroCliente, String nombre, String apellido) {
		this.numeroCliente = numeroCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroDePuntos = Cliente.NUMERO_INICIAL_DE_PUNTOS;
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

	public int obtenerPuntos() {
		return numeroDePuntos;
	}

}
