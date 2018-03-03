package entidades;

import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import entidades.Tienda;
import entidades.Cliente;

public class TestearQueCuandoSolicitoUnListadoDeClientes {
	
	DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
	
	@Test
	public void debe_generarse_correctamente_el_listado_de_clientes() throws ParseException {
		Tienda miTienda = new Tienda();
		Date hoy = new Date();
		Date ayer = new Date(System.currentTimeMillis()-24*60*60*1000);
		miTienda.asignarCliente(new Cliente("123456789", "Marty", "McFly", hoy));
		miTienda.asignarCliente(new Cliente("123456788", "Jennifer", "Parker", hoy));
		miTienda.asignarCliente(new Cliente("123456787", "Emmett", "Brown", ayer));
		miTienda.asignarCliente(new Cliente("123456786", "Biff", "Tannen", dateFormatter.parse("2015-12-25")));
		assertEquals(1, miTienda.obtenerClientesRegistradosEn(ayer).size());	
	}

}
