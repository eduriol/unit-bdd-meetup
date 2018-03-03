#language: es
Característica: Registrar nuevos clientes desde la tienda
Para fidelizar compradores
Como dependiente de tienda de DC Comics
Quiero registrar nuevos clientes

	Escenario: los nuevos clientes deben empezar con 100 puntos
		Dado que Marty McFly quiere convertirse en nuevo cliente
		Cuando doy de alta sus datos en la plataforma 
		Entonces empieza con 100 puntos

	Escenario: los nuevos clientes deben recibir un notificación de bienvenida
		Dado que Jennifer Parker quiere convertirse en nuevo cliente
		Cuando doy de alta sus datos en la plataforma 
		Entonces recibe un mensaje de bienvenida