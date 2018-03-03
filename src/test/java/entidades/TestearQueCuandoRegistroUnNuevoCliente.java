package entidades;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import entidades.Cliente;

public class TestearQueCuandoRegistroUnNuevoCliente {

	@Test
	public void debe_resgistrarse_el_cliente_correctamente() {
		Cliente cliente = new Cliente("123456789", "Marty", "McFly");
		assertEquals("Marty", cliente.obtenerNombre());
		assertEquals("McFly", cliente.obtenerApellido());
		assertEquals("123456789", cliente.obtenerNumeroCliente());
	}
	
	@Test
	public void debe_asignarse_100_puntos_al_cliente() {
		Cliente cliente = new Cliente("123456789", "Marty", "McFly");
		assertEquals(100, cliente.obtenerPuntos());
	}

}