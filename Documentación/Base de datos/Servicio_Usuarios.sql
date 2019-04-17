create database UsuariosEntretenimiendo

use UsuariosEntretenimiendo

create table Persona(
idPersona int primary key identity(1,1),
Nombre varchar(50) not null,
Apellidos varchar(100) not null,
Direccion varchar(100) not null,
Cedula varchar(20) not null,
TipoTarjeta varchar(50) null,
NumeroTarjeta varchar(50) null,
Pregunta varchar(200) not null,
Respuesta varchar(200) not null,
FechaNach date null
)

create table Usuarios(
idUsuario int primary key identity(1,1),
idPersona int not null,
NombreUsuario varchar(50) not null,
Pass varchar(50) not null,
Puntuacion int not null,
Bloqueo varchar(10),
foreign key(idPersona) references Persona(idPersona)
)

create table BitacoraXusuario(
idBitacora int primary key identity(1,1),
idProducto int not null,
Tipo varchar(50) not null,
idUsuario int not null,
Descripcion varchar(500) not null,
Puntos int not null,
foreign key(idUsuario) references Usuarios(idUsuario)
)

create table CodigosXusuario(
idCodigo int primary key identity(1,1),
idUsuario int not null,
Codigo varchar(15) not null,
foreign key(idUsuario) references Usuarios(idUsuario)
)