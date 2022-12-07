create database ventas;
use ventas;

CREATE TABLE `carritoVentasdb` (
  `idProduct` int(11) NOT NULL AUTO_INCREMENT,
  `idEvento` int(11) NOT NULL,
  `idUsuario` int(11) NOT NULL,
  `fechaCompra` DATE NOT NULL,
  PRIMARY KEY (`idProduct`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=latin1