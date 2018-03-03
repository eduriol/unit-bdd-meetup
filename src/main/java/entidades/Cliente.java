package entidades;

import java.util.ArrayList;
import java.util.List;

import entidades.Notificacion;

public class Cliente {

	private String numeroCliente;
	private String nombre;
	private String apellido;
	private int numeroDePuntos;
	private List<Notificacion> notificacionesRecibidas;
	private static final int NUMERO_INICIAL_DE_PUNTOS = 100;
	private static final String MENSAJE_DE_BIENVENIDA = "¡Gracias por confiar en DC Comics!";

	public Cliente(String numeroCliente, String nombre, String apellido) {
		this.numeroCliente = numeroCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroDePuntos = Cliente.NUMERO_INICIAL_DE_PUNTOS;
		this.notificacionesRecibidas = new ArrayList<Notificacion>();
		this.notificacionesRecibidas.add(new Notificacion(Cliente.MENSAJE_DE_BIENVENIDA, this));
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

	public Notificacion obtenerUltimaNotificacionRecibida() {
		return this.notificacionesRecibidas.get(this.notificacionesRecibidas.size() - 1);
	}

}
