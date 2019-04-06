# Entretenimiento

ASP.NET MVC LINQ 
2 PARTES
    -Sitio Web - Josue Castro
    -APP (JQueryMobile) - Brandon Sandoval Mora


Proyecto final Ultima semana (27 de abril) (30%) Por cita
	
	Consiste: Reutilizar idea empresarial de la primara clase 
	hacerla dinamica aplicar servicios WCF, Aplicar seguridad

	Elegir una idea 	


*Requerimientos 

Analisis
Diagrama Arquitectura (MVC, WCF, Servicios(2 tecnologias diferentes(Java, .net))) (13 de abril)
Diagrama  entidad relacion  (13 de abril)
Manual uso (app)  (13 de abril)
Mockup (10 de abril)

Tema de Seguridad

Empresa de entretenimiento

Servicios:
Web Services(WCF)
-Java/node.js (Servicio: administra los usuarios)
-.net (Servicio: muestra todo lo relacionado a productos)


Requerimientos:
-JQueryMobile( app)
-Mostrar productos según la categoria
-Articulos de información
-Compra de productos
-Administar Usuarios(registrado, anonimo, opcional(administrador))
		-registro de usuario
		-inicio de sesión
		-olvido de contraseña
		-bloqueo de cuenta

-Usuario registrado
		-Compra de producto
		-Ofrece un producto
		-Ver perfil(compras)
		-Agregar/modificar/Elimnar comentarios del mismo usuario
-Usuario anonimo
		-Agregar comentarios de un producto

Concepto:
	Entretenimiento: 
	Venta de videojuegos,peliculas,musica
	Cada categoria que se trata tiene secciones
	Los usuarios registrados pueden ofrecer un producto segun las carategorias que ofrece la empresa(videojuegos, peliculas, musica)
	Los usuarios anonimos solo tienen derecho a ver informacion sobre los articulos y productos que se ofrecen
	Los usarios anonimo como registrado tiene la opcion de comentar y puntar un producto
	Articulos sobre noticias de tecnologias o productos que se ofrece (estatico)
	Los usuarios pueden intercambiar productos entre los propios usuarios

Analisis:
	
La empresa ofrecera un sitio web para la compra de productos que se ofrecen diferentes categorias por ejemplo: peliculas, videojuegos, musica,
cada producto tendra un precio respectivo con sus detalles y una sección para comentar y puntar dicho producto, como tambien podrá navegar por diferentes 
articulos de información.
El sitio web controla los usuarios por medio de un inicio de sesión  o sin un inicio de sesión lo que llamaremos usuario anonimo si este fuera el caso
el usuario anonimo tendra limites por ejemplo no tiene derecho a comprar ningun tipo de producto, y una vez agregado un comentario no lo podra eliminar ni modificar
En cambio, los usuarios registrados tendrán más participación en el sitio web tendra oportunidad de comprar, ofrecer sus prodcutos y 
intercambiar entre usuarios registrados.

Los usuarios registrados cuando quieran ofrecer o intercambiar sus productos tendran que cumplir con algunos requerimientos unos de ellos será que el producto
sea para todo publico es decir, que no tenga ninguna obscenanidad. Si no cumple con los estandares se continuará a su respectivo bloqueo de su cuenta

El usuario se le ofrecera pagina de busquedas amigables por categoria nombre y puntuacion de acuerdo por los usuarios que dieron su opinion

El sitio web manejara un sistema de puntuación, que se manejara de la siguiente forma:
	Usuario registrado compra un producto valorado mas de 5000 colonea tendra como beneficio 100 pts
	Usuario logra vender su producto que ofrecio en el sitio web tendra como beneficio 1000pts
	Los productos que se ofrecen en el sitio web no solo tiene como metodo de compra por medio de dinero "real" si no que el producto tambien tiene un costo 
	de puntuacion ejemplo si el usaurio tiene una puntuación de 1080 pts podra comprar un producto valorado por la misma cantidad de puntos.

