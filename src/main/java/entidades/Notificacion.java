package entidades;

import entidades.Cliente;

public class Notificacion {

	private String titulo;
	private Cliente receptor;

	public Notificacion(String titulo, Cliente receptor) {
		this.titulo = titulo;
		this.receptor = receptor;
	}

	public String obtenerTitulo() {
		return this.titulo;
	}

	public String obtenerNombreReceptor() {
		return this.receptor.obtenerNombre() + " " + this.receptor.obtenerApellido();
	}

}
