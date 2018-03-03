package entidades;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import entidades.Cliente;
import entidades.Notificacion;

public class TestearQueCuandoCreoUnaNuevaNotificacion {
	
	@Test
	public void debe_enviarse_correctamente_la_notificacion() {
		Cliente cliente = new Cliente("123456789", "Marty", "McFly", new Date());
		Notificacion notificacion = new Notificacion("¡Gracias por confiar en DC Comics!", cliente);
		assertEquals("¡Gracias por confiar en DC Comics!", notificacion.obtenerTitulo());
		assertEquals("Marty McFly", notificacion.obtenerNombreReceptor());
	}

}
