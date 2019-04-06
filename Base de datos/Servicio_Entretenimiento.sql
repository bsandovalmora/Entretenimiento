create database Entretenimiento

use Entretenimiento


create table Secciones(
idSeccion int primary key identity(1,1),
Nombre varchar(100) not null
)

create table Categorias(
idCategoria int primary key identity(1,1),
idSeccion int not null,
Nombre varchar(100) not null,
foreign key (idSeccion) references Secciones(idSeccion)
)

create table Productos(
idProducto int primary key identity(1,1),
idCategoria int not null,
Nombre varchar(100) not null,
Descripcion varchar(500) not null,
Precio int not null,
foreign key(idCategoria) references Categorias(idCategoria)
)

create table ProductoXComentarios(
id int primary key identity(1,1),
idProducto int not null,
Comentario varchar(200) null,
Puntos int null,
foreign key(idProducto) references Productos (idProducto)
)

