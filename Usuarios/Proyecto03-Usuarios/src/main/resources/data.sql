create database usuariosdb;
use usuariosdb;

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `password` varchar(45) NOT NULL,
  `fechaAlta` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1