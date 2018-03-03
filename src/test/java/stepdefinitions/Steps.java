package stepdefinitions;

import cucumber.api.java.es.Dado;

public class Steps {
	
	String nombre;
	String apellido;

	@Dado("^que (.+) (.+) quiere convertirse en nuevo cliente$")
	public void quiere_convertirse_en_nuevo_cliente(String nombre, String apellido) {
	    this.nombre = nombre;
	    this.apellido = apellido;
	}
	
}
