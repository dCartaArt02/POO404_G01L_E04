# ************************************************************
# Antares - SQL Client
# Version 0.7.28
# 
# https://antares-sql.app/
# https://github.com/antares-sql/antares
# 
# Host: 127.0.0.1 (MySQL Community Server - GPL 9.0.1)
# Database: rapigo
# Generation time: 2024-09-25T22:37:58-06:00
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
  `User` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Contraseña` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Telefono` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Correo` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Nombre` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Direccion` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `FechaRegistro` datetime DEFAULT CURRENT_TIMESTAMP,
  `imagen` longblob,
  `ClienteID` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ClienteID`),
  UNIQUE KEY `Correo` (`Correo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;

INSERT INTO `clientes` (`User`, `Contraseña`, `Telefono`, `Correo`, `Nombre`, `Direccion`, `imagen`, `ClienteID`) VALUES
	("nayi", "123", "8888-8888", "ukelele@hotmail.com", "Nayib Bukele", "Casa Presidencial,  Alameda Manuel Enrique Araujo 5500, San Salvador", NULL, 2),
	("ye", "123", "6666-6666", "ye@dios.com", "Kanye West", "Atlanta, Georgia USA", NULL, 3);

/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;



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
  `User` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `contraseña` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `EmpleadoID` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Correo` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Telefono` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Cargo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `FechaContratacion` datetime DEFAULT CURRENT_TIMESTAMP,
  `imagen` longblob,
  PRIMARY KEY (`EmpleadoID`),
  UNIQUE KEY `Correo` (`Correo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;

INSERT INTO `empleados` (`User`, `contraseña`, `EmpleadoID`, `Nombre`, `Correo`, `Telefono`, `Cargo`, `imagen`) VALUES
	("Ceren", "123", 1, "Salvador Cerén", "sanchezceren@yahoo.com", "4444-4444", "Mesero", NULL),
	("nayi", "123", 2, "Farabundo Martí", "pasmado@idiota.com", "0000-0000", "Conserje", NULL);

/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;



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
  `NombreProducto` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Descripcion` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Precio` decimal(10,2) NOT NULL,
  `imagen` longblob,
  PRIMARY KEY (`ProductoID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;

INSERT INTO `menu` (`ProductoID`, `NombreProducto`, `Descripcion`, `Precio`, `imagen`) VALUES
	(1, "Lomo de res a la parrilla", "Lomo de cerdo asado a la parrilla, servido con ensalada y papas", 7, X''),
	(2, "Enchiladas", "Tortilla frita con frijoles, carne y ensalada encima", 2, X''),
	(3, "Sopa de pata", "Sopa espesa con patas de res, yuca, maíz y plátano.", 4.05, NULL),
	(4, "Pupusa de queso", "La pupusa es una tortilla gruesa a base de masa de maíz o de arroz rellena con uno o más ingredientes, como queso, chicharrón, ayote, frijoles refritos, loroco, pollo, camarones, pupusa loca que incluye todos los ingredientes antes mencionados etc", 0.45, NULL),
	(5, "Horchata", "a horchata de arroz es una bebida refrescante tradicional de amplio consumo. Es una de las muchas aguas frescas tradicionales de Centroamérica y México.", 0.65, NULL),
	(6, "Fajitas de carne", "Fajitas de res cocinadas con pimientos y cebollas", 3.25, NULL),
	(7, "Pollo a la plancha", "Pollo marinado y cocinado a la plancha, servido con vegetales", 4.25, NULL),
	(8, "Carne deshilada en salsa roja", "Carne de res desmenuzada en salsa de tomate con especias", 4.25, NULL),
	(9, "Sopa de res", "Sopa tradicional con carne de res, yuca, elote y plátano", 5.75, NULL);

/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;



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

# Dump completed on 2024-09-25T22:37:58-06:00
