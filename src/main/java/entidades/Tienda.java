package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.Cliente;

public class Tienda {
	
	private List<Cliente> clientes = new ArrayList<Cliente>();

	public List<Cliente> obtenerClientesRegistradosEn(Date fecha) {
		List<Cliente> clientesRegistradosEnFecha = new ArrayList<Cliente>();
		for (Cliente cliente : this.clientes) {
			if (cliente.obtenerFechaDeRegistro().equals(fecha)) {
				clientesRegistradosEnFecha.add(cliente);
			}
		}
		return clientesRegistradosEnFecha;
	}

	public void asignarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
}
