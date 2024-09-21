# ************************************************************
# Antares - SQL Client
# Version 0.7.28
# 
# https://antares-sql.app/
# https://github.com/antares-sql/antares
# 
# Host: 127.0.0.1 (MySQL Community Server - GPL 9.0.1)
# Database: rapigo
# Generation time: 2024-09-20T18:29:52-06:00
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
SET NAMES utf8mb4;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table clientes
# ------------------------------------------------------------

DROP TABLE IF EXISTS `clientes`;

CREATE TABLE `clientes` (
  `ClienteID` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(100) NOT NULL,
  `Correo` varchar(100) NOT NULL,
  `Telefono` varchar(15) DEFAULT NULL,
  `Direccion` varchar(255) DEFAULT NULL,
  `FechaRegistro` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ClienteID`),
  UNIQUE KEY `Correo` (`Correo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;





# Dump of table detallepedido
# ------------------------------------------------------------

DROP TABLE IF EXISTS `detallepedido`;

CREATE TABLE `detallepedido` (
  `DetallePedidoID` int NOT NULL AUTO_INCREMENT,
  `PedidoID` int DEFAULT NULL,
  `ProductoID` int DEFAULT NULL,
  `Cantidad` int NOT NULL,
  `PrecioUnitario` decimal(10,2) NOT NULL,
  PRIMARY KEY (`DetallePedidoID`),
  KEY `PedidoID` (`PedidoID`),
  KEY `ProductoID` (`ProductoID`),
  CONSTRAINT `detallepedido_ibfk_1` FOREIGN KEY (`PedidoID`) REFERENCES `pedidos` (`PedidoID`),
  CONSTRAINT `detallepedido_ibfk_2` FOREIGN KEY (`ProductoID`) REFERENCES `menu` (`ProductoID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;





# Dump of table empleados
# ------------------------------------------------------------

DROP TABLE IF EXISTS `empleados`;

CREATE TABLE `empleados` (
  `EmpleadoID` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(100) NOT NULL,
  `Correo` varchar(100) NOT NULL,
  `Telefono` varchar(15) DEFAULT NULL,
  `Cargo` varchar(50) DEFAULT NULL,
  `FechaContratacion` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`EmpleadoID`),
  UNIQUE KEY `Correo` (`Correo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;





# Dump of table historialpedidos
# ------------------------------------------------------------

DROP TABLE IF EXISTS `historialpedidos`;

CREATE TABLE `historialpedidos` (
  `HistorialID` int NOT NULL AUTO_INCREMENT,
  `PedidoID` int DEFAULT NULL,
  `Estado` enum('Aceptado','En proceso de elaborar','Entregado al repartidor','Entregado al cliente') DEFAULT NULL,
  `FechaCambio` datetime DEFAULT CURRENT_TIMESTAMP,
  `ComentarioEmpleado` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`HistorialID`),
  KEY `PedidoID` (`PedidoID`),
  CONSTRAINT `historialpedidos_ibfk_1` FOREIGN KEY (`PedidoID`) REFERENCES `pedidos` (`PedidoID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;





# Dump of table menu
# ------------------------------------------------------------

DROP TABLE IF EXISTS `menu`;

CREATE TABLE `menu` (
  `ProductoID` int NOT NULL AUTO_INCREMENT,
  `NombreProducto` varchar(100) NOT NULL,
  `Descripcion` varchar(255) DEFAULT NULL,
  `Precio` decimal(10,2) NOT NULL,
  `Disponible` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`ProductoID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;





# Dump of table pedidos
# ------------------------------------------------------------

DROP TABLE IF EXISTS `pedidos`;

CREATE TABLE `pedidos` (
  `PedidoID` int NOT NULL AUTO_INCREMENT,
  `ClienteID` int DEFAULT NULL,
  `FechaPedido` datetime DEFAULT CURRENT_TIMESTAMP,
  `Estado` enum('Aceptado','En proceso de elaborar','Entregado al repartidor','Entregado al cliente') NOT NULL,
  `ComentarioEmpleado` varchar(255) DEFAULT NULL,
  `FormaPago` varchar(50) DEFAULT NULL,
  `Total` decimal(10,2) NOT NULL,
  PRIMARY KEY (`PedidoID`),
  KEY `ClienteID` (`ClienteID`),
  CONSTRAINT `pedidos_ibfk_1` FOREIGN KEY (`ClienteID`) REFERENCES `clientes` (`ClienteID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;





# Dump of views
# ------------------------------------------------------------

# Creating temporary tables to overcome VIEW dependency errors


/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

# Dump completed on 2024-09-20T18:29:52-06:00
