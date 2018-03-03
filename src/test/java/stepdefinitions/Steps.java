package stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.Format;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import entidades.Cliente;
import entidades.Tienda;

public class Steps {
	
	private String nombre;
	private String apellido;
	private Cliente cliente;
	private List<Cliente> clientesRegistrados;
	private Tienda tienda;
	private List<Cliente> clientesRegistradosUltimaNavidad;

	@Dado("^que (.+) (.+) quiere convertirse en nuevo cliente$")
	public void quiere_convertirse_en_nuevo_cliente(String nombre, String apellido) {
	    this.nombre = nombre;
	    this.apellido = apellido;
	}
	
	@Dado("^que tenemos los siguiente clientes registrados:$")
	public void tenemos_los_siguientes_clientes_registrados(@Format("yyyy-MM-dd") List<Cliente> clientesRegistrados) {
	    this.clientesRegistrados = clientesRegistrados;
	}

	@Dado("^les asigno a mi tienda$")
	public void les_asigno_a_mi_tienda() {
		this.tienda = new Tienda();
	    for (Cliente cliente: clientesRegistrados) {
	    	this.tienda.asignarCliente(cliente);
	    }
	}
	
	@Cuando("^doy de alta sus datos en la plataforma$")
	public void doy_de_alta_sus_datos_en_la_plataforma() {
		this.cliente = new Cliente("123456789", nombre, apellido, new Date());
	}
	
	@Cuando("^solicito un listado de clientes registrados durante la pasada Navidad$")
	public void solicito_un_listado_de_clientes_registrados_durante_la_pasada_Navidad() throws ParseException {
		DateFormat formateadorFecha = new SimpleDateFormat("yyyy-MM-dd");
		Date ultimaNavidad = formateadorFecha.parse("2017-12-25");
		this.clientesRegistradosUltimaNavidad = this.tienda.obtenerClientesRegistradosEn(ultimaNavidad);
	}
	
	@Entonces("^empieza con (\\d+) puntos$")
	public void empieza_con_puntos(int puntosEsperados) {
	    assertEquals(puntosEsperados, this.cliente.obtenerPuntos());
	}
	
	@Entonces("^recibe un mensaje de bienvenida$")
	public void recibe_un_mensaje_de_bienvenida() {
		assertEquals("¡Gracias por confiar en DC Comics!", this.cliente.obtenerUltimaNotificacionRecibida().obtenerTitulo());
	}
	
	@Entonces("^obtengo los siguientes clientes:$")
	public void obtengo_los_siguientes_clientes(@Format("yyyy-MM-dd") DataTable clientesEsperadosConRegistroUltimaNavidad) {
		clientesEsperadosConRegistroUltimaNavidad.diff(this.clientesRegistradosUltimaNavidad);
	}
	
}
