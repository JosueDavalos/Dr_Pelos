drop database if exists dr_pelos;

Create database dr_pelos;
USE dr_pelos ;

-- -----------------------------------------------------
-- Table `dr_pelos`.`JefeBodega`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS dr_pelos.JefeBodega (
  ID INT NOT NULL AUTO_INCREMENT,
  cedula VARCHAR(10) NOT NULL,
  nombre VARCHAR(50) NOT NULL,
  apellido VARCHAR(50) NOT NULL,
  genero char(1)  NOT NULL,
  PRIMARY KEY (ID))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dr_pelos`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS dr_pelos.Cliente (
  ID INT NOT NULL AUTO_INCREMENT,
  cedula VARCHAR(10) NOT NULL,
  nombre VARCHAR(50) NOT NULL,
  apellido VARCHAR(50) NOT NULL,
  genero char(1)  NOT NULL,
  correo varchar(50) not null,
  FechaNacimiento DATE NOT NULL,
  direccion VARCHAR(100) NOT NULL,
  telefono VARCHAR(15) NOT NULL,
  PRIMARY KEY (ID))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `dr_pelos`.`Producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS dr_pelos.Producto (
  ID INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  categoria VARCHAR(50) NOT NULL,
  precio double not null,
  PRIMARY KEY (ID))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dr_pelos`.`Servicio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS dr_pelos.Servicio (
  ID INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  categoria VARCHAR(50) NOT NULL,
  PRIMARY KEY (ID))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dr_pelos`.`Sucursal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS dr_pelos.Sucursal (
  ID INT NOT NULL AUTO_INCREMENT,
  direccion VARCHAR(50) NOT NULL,
  PRIMARY KEY (ID))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `dr_pelos`.`Repartidor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS dr_pelos.Repartidor (
  ID INT NOT NULL AUTO_INCREMENT,
  cedula VARCHAR(10) NOT NULL,
  nombre VARCHAR(50) NOT NULL,
  apellido VARCHAR(50) NOT NULL,
  genero char(1)  NOT NULL,
  PRIMARY KEY (ID))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dr_pelos`.`nCredito`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS dr_pelos.nCredito (
  ID INT NOT NULL AUTO_INCREMENT,
  monto double NOT NULL,
  descripcion VARCHAR(50) NOT NULL,
  PRIMARY KEY (ID))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dr_pelos`.`Factura`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS dr_pelos.Factura (
  ID INT NOT NULL AUTO_INCREMENT,
  monto double NOT NULL,
  descripcion VARCHAR(50) NOT NULL,
  PRIMARY KEY (ID))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `dr_pelos`.`cotizacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS dr_pelos.cotizacion (
  ID INT NOT NULL AUTO_INCREMENT,
  monto double NOT NULL,
  descripcion VARCHAR(50) NOT NULL,
  PRIMARY KEY (ID))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `dr_pelos`.`FormaPago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS dr_pelos.FormaPago (
  ID INT NOT NULL AUTO_INCREMENT,
  factura INT,
  ncredito INT,
  cotizacion INT,
  PRIMARY KEY (ID),
  foreign key (factura) references dr_pelos.factura (ID),
  foreign key (ncredito) references dr_pelos.ncredito (ID),
  foreign key (cotizacion) references dr_pelos.cotizacion (ID))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dr_pelos`.`DocumentoEntrega`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS dr_pelos.DocumentoEntrega (
  ID INT NOT NULL AUTO_INCREMENT,
  descripcion VARCHAR(50) NOT NULL,
  repartidor INT NOT NULL,
  jefeBodega INT NOT NULL,
  PRIMARY KEY (ID),
  foreign key (repartidor) references dr_pelos.Repartidor (ID),
  foreign key (jefeBodega) references dr_pelos.JefeBodega (ID))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dr_pelos`.`DetallePago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS dr_pelos.DetallePago (
  ID INT NOT NULL AUTO_INCREMENT,
  repartidor INT NOT NULL,
  cantidad double NOT NULL,
  PRIMARY KEY (ID),
  foreign key (repartidor) references dr_pelos.Repartidor (ID))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dr_pelos`.`ProductoSucursal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS dr_pelos.ProductoSucursal (
  producto INT NOT NULL,
  sucursal INT NOT NULL,
  foreign key (producto) references dr_pelos.producto (ID),
  foreign key (sucursal) references dr_pelos.sucursal (ID))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dr_pelos`.`Pago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS dr_pelos.Pago (
  producto INT NOT NULL,
  cliente INT NOT NULL,
  fecha DATE NOT NULL,
  sucursal INT NOT NULL,
  formaPago INT NOT NULL,
  detallePago INT NOT NULL,
  foreign key (producto) references dr_pelos.producto (ID),
  foreign key (cliente) references dr_pelos.cliente (ID),
  foreign key (formaPago) references dr_pelos.formaPago (ID),
  foreign key (detallePago) references dr_pelos.detallePago (ID))
ENGINE = InnoDB;



