package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import entidades.Cliente;

public class Steps {
	
	String nombre;
	String apellido;
	Cliente cliente;

	@Dado("^que (.+) (.+) quiere convertirse en nuevo cliente$")
	public void quiere_convertirse_en_nuevo_cliente(String nombre, String apellido) {
	    this.nombre = nombre;
	    this.apellido = apellido;
	}
	
	@Cuando("^doy de alta sus datos en la plataforma$")
	public void doy_de_alta_sus_datos_en_la_plataforma() {
		this.cliente = new Cliente("123456789", nombre, apellido);
	}	
	
}
