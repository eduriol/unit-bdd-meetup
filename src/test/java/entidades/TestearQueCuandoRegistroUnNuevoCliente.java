package entidades;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import entidades.Cliente;

public class TestearQueCuandoRegistroUnNuevoCliente {

	@Test
	public void debe_resgistrarse_el_cliente_correctamente() {
		Cliente cliente = new Cliente("123456789", "Marty", "McFly", new Date());
		assertEquals("Marty", cliente.obtenerNombre());
		assertEquals("McFly", cliente.obtenerApellido());
		assertEquals("123456789", cliente.obtenerNumeroCliente());
		assertEquals(new Date(), cliente.obtenerFechaDeRegistro());
	}

	@Test
	public void debe_asignarse_100_puntos_al_cliente() {
		Cliente cliente = new Cliente("123456789", "Marty", "McFly", new Date());
		assertEquals(100, cliente.obtenerPuntos());
	}

	@Test
	public void debe_enviarse_un_mensaje_de_bienvenida_al_cliente() {
		Cliente cliente = new Cliente("123456789", "Marty", "McFly", new Date());
		assertEquals("¡Gracias por confiar en DC Comics!", cliente.obtenerUltimaNotificacionRecibida().obtenerTitulo());
	}
	
}