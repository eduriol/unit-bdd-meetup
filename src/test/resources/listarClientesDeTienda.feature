#language: es
Característica: Listar clientes de una tienda
Para conocer la actividad de mi tienda
Como manager de tienda
Quiero obtener listas de clientes registrados en una fecha dada
	
	Escenario: la plataforma debe proveer una lista de clientes registrados el pasado día de Navidad
		Dado que tenemos los siguiente clientes registrados:
			| nombre	| apellido	| fecha de registro	|
			| Marty		| McFly		| 2018-01-10		|
			| Jennifer	| Parker	| 2018-01-10		|
			| Emmett	| Brown		| 2017-12-25		|
			| Biff		| Tannen	| 2015-08-31		|
		Y les asigno a mi tienda
		Cuando solicito un listado de clientes registrados durante la pasada Navidad
		Entonces obtengo los siguientes clientes:
			| nombre	| apellido	| fecha de registro	|
			| Emmett	| Brown		| 2017-12-25		|
