use dr_pelos;

insert into JefeBodega(cedula, nombre, apellido, genero) values ("0931657365","Bryan","Davalos","M");
insert into JefeBodega(cedula, nombre, apellido, genero) values ("0958745698","Josue","Sanchez","M");
insert into JefeBodega(cedula, nombre, apellido, genero) values ("0956985889","Erick","Vaca","M");
insert into JefeBodega(cedula, nombre, apellido, genero) values ("0956592330","Eunice","Gorotiza","F");
insert into JefeBodega(cedula, nombre, apellido, genero) values ("0905899128","Carlos","Vazquez","M");
insert into JefeBodega(cedula, nombre, apellido, genero) values ("0296999941","Xiomara","Mera","F");
insert into JefeBodega(cedula, nombre, apellido, genero) values ("0795989541","Jocellyne","Luna","F");

insert into Cliente(cedula, nombre, apellido, FechaNacimiento, genero, correo, direccion, telefono) Values ("0931657365","Bryan","Sanchez","1999-12-18","M","brymsanc@espol.edu.ec","Acuarela del rio Mz 2 V1","0989195454");
insert into Cliente(cedula, nombre, apellido, FechaNacimiento, genero, correo, direccion, telefono) Values ("7894561230","Mois","Cabezas","1999-12-25","M","bmsa@espol.edu.ec","Sauces","0989845621");
insert into Cliente(cedula, nombre, apellido, FechaNacimiento, genero, correo, direccion, telefono) Values ("1234560785","Josue","Davalos","1990-01-02","M","josuetunene@gmail.com","Acuarela del rio Mz 2 V1","0935698745");
insert into Cliente(cedula, nombre, apellido, FechaNacimiento, genero, correo, direccion, telefono) Values ("7412589630","Galrer","Saltos","1975-01-18","M","gallarota@gmail.com","Sauces 9 V1","0956471236");
insert into Cliente(cedula, nombre, apellido, FechaNacimiento, genero, correo, direccion, telefono) Values ("9632587410","Ginger","Saltos","1960-02-04","F","gsaltos@espol.edu.ec","Ceibos","0956847125");
insert into Cliente(cedula, nombre, apellido, FechaNacimiento, genero, correo, direccion, telefono) Values ("8521479630","Eduardo","Cruz","1975-05-08","M","ecruz@espol.edu.ec","Entrada de la 8","0965748954");
insert into Cliente(cedula, nombre, apellido, FechaNacimiento, genero, correo, direccion, telefono) Values ("0254136987","Allan","Galarraga","1990-04-05","M","elgala@espol.edu.ec","Acuarela del rio Mz 2 V1","0984571659");
insert into Cliente(cedula, nombre, apellido, FechaNacimiento, genero, correo, direccion, telefono) Values ("8544961234","Kimberly","Suarez","1999-12-18","F","kimberlyprexiositaemoxitap@espol.edu.ec","Aquisito","0945687521");
insert into Cliente(cedula, nombre, apellido, FechaNacimiento, genero, correo, direccion, telefono) Values ("0931655365","Jefferson","Sanchez","1999-11-18","M","jeffer@espol.edu.ec","Mapasingue Oeste","0954645756");

insert into Producto(nombre, categoria, precio) values ("Pelota","Juguete",10.55);
insert into Producto(nombre, categoria, precio) values ("Hueso","Juguete",11.85);
insert into Producto(nombre, categoria, precio) values ("Camisa Avenger","Ropa",10.99);
insert into Producto(nombre, categoria, precio) values ("Lazo","Ropa",1.10);
insert into Producto(nombre, categoria, precio) values ("Antimoquillo","Medina",4.50);
insert into Producto(nombre, categoria, precio) values ("Paracetamol","Medina",4.55);
insert into Producto(nombre, categoria, precio) values ("Cereal grande","Alimento",14.15);
insert into Producto(nombre, categoria, precio) values ("Hueso comestible","Alimento",2.50);
insert into Producto(nombre, categoria, precio) values ("Pelota saltarina","Juguete",1.00);
insert into Producto(nombre, categoria, precio) values ("Cereal pequeño","Alimento",5.55);

insert into Sucursal(direccion) values ("Sauce 2 C 3era. Av. 8va.");
insert into Sucursal(direccion) values ("Ceibos cuidadela Cumbres");
insert into Sucursal(direccion) values ("Mapsingue Oeste, 5 1/9 km Via daule");
insert into Sucursal(direccion) values ("Centro, boyaca y aguirre");
insert into Sucursal(direccion) values ("Villa España");
insert into Sucursal(direccion) values ("La joya");

insert into Repartidor(cedula, nombre, apellido, genero) values ("0931548765","Robert","Mera","M");
insert into Repartidor(cedula, nombre, apellido, genero) values ("0995648549","Domenica","Ochoa","F");
insert into Repartidor(cedula, nombre, apellido, genero) values ("0950095979","Xavier","Bermudez","M");
insert into Repartidor(cedula, nombre, apellido, genero) values ("0129997415","Carlos","Medina","M");
insert into Repartidor(cedula, nombre, apellido, genero) values ("0895659594","Dustin","Quinde","M");
insert into Repartidor(cedula, nombre, apellido, genero) values ("0987876598","Milena","suarez","F");
insert into Repartidor(cedula, nombre, apellido, genero) values ("0598985655","Melany","Cedeño","F");

insert into nCredito(monto, descripcion) values (45.45, "descripcion 1");
insert into nCredito(monto, descripcion) values (100.36, "descripcion 2");
insert into nCredito(monto, descripcion) values (12.65, "descripcion 3");
insert into nCredito(monto, descripcion) values (485.66, "descripcion 4");
insert into nCredito(monto, descripcion) values (153.55, "descripcion 5");
insert into nCredito(monto, descripcion) values (40.56, "descripcion 6");
insert into nCredito(monto, descripcion) values (89.23, "descripcion 7");

insert into Factura(monto, descripcion) values (89.23, "descripcion 7");
insert into Factura(monto, descripcion) values (45.45, "descripcion 1");
insert into Factura(monto, descripcion) values (100.36, "descripcion 2");
insert into Factura(monto, descripcion) values (12.65, "descripcion 3");
insert into Factura(monto, descripcion) values (485.66, "descripcion 4");
insert into Factura(monto, descripcion) values (153.55, "descripcion 5");
insert into Factura(monto, descripcion) values (40.56, "descripcion 6");
insert into Factura(monto, descripcion) values (89.23, "descripcion 7");

insert into cotizacion(monto, descripcion) values (89.23, "descripcion 7");
insert into cotizacion(monto, descripcion) values (45.45, "descripcion 1");
insert into cotizacion(monto, descripcion) values (100.36, "descripcion 2");
insert into cotizacion(monto, descripcion) values (12.65, "descripcion 3");
insert into cotizacion(monto, descripcion) values (485.66, "descripcion 4");
insert into cotizacion(monto, descripcion) values (153.55, "descripcion 5");
insert into cotizacion(monto, descripcion) values (40.56, "descripcion 6");
insert into cotizacion(monto, descripcion) values (89.23, "descripcion 7");

insert into FormaPago(factura,cotizacion) values (1,1);
insert into FormaPago(factura,cotizacion) values (2,2);
insert into FormaPago(factura,cotizacion) values (3,2);
insert into FormaPago(factura,cotizacion) values (4,3);
insert into FormaPago(factura,cotizacion) values (5,1);
insert into FormaPago(factura,cotizacion) values (6,2);
insert into FormaPago(factura,cotizacion) values (7,2);
insert into FormaPago(nCredito,cotizacion) values (1,1);
insert into FormaPago(nCredito,cotizacion) values (2,2);
insert into FormaPago(nCredito,cotizacion) values (3,4);
insert into FormaPago(nCredito,cotizacion) values (4,3);
insert into FormaPago(nCredito,cotizacion) values (5,6);
insert into FormaPago(nCredito,cotizacion) values (6,5);


insert into Paquete(cliente,fechaEnvio,fechaEntrega,direccion,estado) values (3,"2020-01-25","2020-01-29","Loma de los Ceibos Mz 3 V1","Pendiente");
insert into Paquete(cliente,fechaEnvio,fechaEntrega,direccion,estado) values (3,"2020-01-25","2020-01-29","Acuarela del rio Mz 2 V1","Pendiente");
insert into Paquete(cliente,fechaEnvio,fechaEntrega,direccion,estado) values (1,"2020-01-23","2020-01-30","Ceibos Norte Mz 3 V5","Pendiente");
insert into Paquete(cliente,fechaEnvio,fechaEntrega,direccion,estado) values (2,"2020-01-22","2020-02-09","Martha de Roldos Mz 78 V112","Pendiente");
insert into Paquete(cliente,fechaEnvio,fechaEntrega,direccion,estado) values (6,"2020-01-25","2020-02-08","Sauces 29 Mz 09 V 99","Pendiente");
insert into Paquete(cliente,fechaEnvio,fechaEntrega,direccion,estado) values (8,"2020-01-25","2020-01-29","Alban Borja","Pendiente");
insert into Paquete(cliente,fechaEnvio,fechaEntrega,direccion,estado) values (1,"2020-01-24","2020-01-26","Prosperina V67","Pendiente");
insert into Paquete(cliente,fechaEnvio,fechaEntrega,direccion,estado) values (9,"2020-01-26","2020-01-25","Loma de los Ceibos Mz 7 V8","Pendiente");
insert into Paquete(cliente,fechaEnvio,fechaEntrega,direccion,estado) values (7,"2020-01-24","2020-01-27","Loma de los Ceibos Mz 3 V1","Pendiente");
insert into Paquete(cliente,fechaEnvio,fechaEntrega,direccion,estado) values (2,"2020-01-21","2020-01-29","Loma de los Ceibos Mz 74 V1","Pendiente");
insert into Paquete(cliente,fechaEnvio,fechaEntrega,direccion,estado) values (3,"2020-01-25","2020-01-29","Loma de los Ceibos Mz 3 V1","Pendiente");
insert into Paquete(cliente,fechaEnvio,fechaEntrega,direccion,estado) values (5,"2020-01-27","2020-01-29","Prosperina V1","Pendiente");
insert into Paquete(cliente,fechaEnvio,fechaEntrega,direccion,estado) values (7,"2020-01-21","2020-01-29","Sauces 7 Mz 3 V1","Pendiente");
insert into Paquete(cliente,fechaEnvio,fechaEntrega,direccion,estado) values (2,"2020-01-26","2020-01-29","Sauces 9 Mz 3 V1","Pendiente");



insert into DocumentoEntrega(descripcion,repartidor,jefeBodega,paquete) values ("Entrega del pedido 1",1,1,1);
insert into DocumentoEntrega(descripcion,repartidor,jefeBodega,paquete) values ("Entrega del pedido 2",2,3,5);
insert into DocumentoEntrega(descripcion,repartidor,jefeBodega,paquete) values ("Entrega del pedido 3",3,2,7);
insert into DocumentoEntrega(descripcion,repartidor,jefeBodega,paquete) values ("Entrega del pedido 4",4,2,14);
insert into DocumentoEntrega(descripcion,repartidor,jefeBodega,paquete) values ("Entrega del pedido 5",6,1,3);
insert into DocumentoEntrega(descripcion,repartidor,jefeBodega,paquete) values ("Entrega del pedido 6",5,7,4);
insert into DocumentoEntrega(descripcion,repartidor,jefeBodega,paquete) values ("Entrega del pedido 7",7,6,2);
insert into DocumentoEntrega(descripcion,repartidor,jefeBodega,paquete) values ("Entrega del pedido 8",1,5,8);
insert into DocumentoEntrega(descripcion,repartidor,jefeBodega,paquete) values ("Entrega del pedido 9",2,4,9);
insert into DocumentoEntrega(descripcion,repartidor,jefeBodega,paquete) values ("Entrega del pedido 10",4,3,10);
insert into DocumentoEntrega(descripcion,repartidor,jefeBodega,paquete) values ("Entrega del pedido 11",6,2,11);
insert into DocumentoEntrega(descripcion,repartidor,jefeBodega,paquete) values ("Entrega del pedido 12",3,1,12);

insert into DetallePago(repartidor,cantidad) values (3,11.11);
insert into DetallePago(repartidor,cantidad) values (4,659.21);
insert into DetallePago(repartidor,cantidad) values (5,12.36);
insert into DetallePago(repartidor,cantidad) values (6,15.65);
insert into DetallePago(repartidor,cantidad) values (1,55.66);
insert into DetallePago(repartidor,cantidad) values (2,102.36);
insert into DetallePago(repartidor,cantidad) values (3,123.36);
insert into DetallePago(repartidor,cantidad) values (4,125.66);
insert into DetallePago(repartidor,cantidad) values (5,145.88);

insert into ProductoSucursal(producto,sucursal) values (1,1);
insert into ProductoSucursal(producto,sucursal) values (2,2);
insert into ProductoSucursal(producto,sucursal) values (3,2);
insert into ProductoSucursal(producto,sucursal) values (4,3);
insert into ProductoSucursal(producto,sucursal) values (5,1);
insert into ProductoSucursal(producto,sucursal) values (6,2);
insert into ProductoSucursal(producto,sucursal) values (7,2);
insert into ProductoSucursal(producto,sucursal) values (1,1);
insert into ProductoSucursal(producto,sucursal) values (2,2);
insert into ProductoSucursal(producto,sucursal) values (3,4);
insert into ProductoSucursal(producto,sucursal) values (4,3);
insert into ProductoSucursal(producto,sucursal) values (5,6);
insert into ProductoSucursal(producto,sucursal) values (6,5);

insert into Pago(producto,cliente,sucursal,formaPago,detallePago,fecha) values (6,7,1,3,1,"2019-12-12");
insert into Pago(producto,cliente,sucursal,formaPago,detallePago,fecha) values (1,6,1,5,2,"2019-12-13");
insert into Pago(producto,cliente,sucursal,formaPago,detallePago,fecha) values (2,5,3,4,3,"2019-12-12");
insert into Pago(producto,cliente,sucursal,formaPago,detallePago,fecha) values (3,4,4,3,4,"2019-12-12");
insert into Pago(producto,cliente,sucursal,formaPago,detallePago,fecha) values (4,3,5,2,4,"2019-12-14");
insert into Pago(producto,cliente,sucursal,formaPago,detallePago,fecha) values (5,2,6,1,6,"2019-12-15");
insert into Pago(producto,cliente,sucursal,formaPago,detallePago,fecha) values (6,1,7,7,5,"2019-12-16");
insert into Pago(producto,cliente,sucursal,formaPago,detallePago,fecha) values (7,7,1,6,6,"2019-12-16");
insert into Pago(producto,cliente,sucursal,formaPago,detallePago,fecha) values (7,6,1,5,7,"2019-12-17");
insert into Pago(producto,cliente,sucursal,formaPago,detallePago,fecha) values (1,5,2,3,1,"2019-12-18");
insert into Pago(producto,cliente,sucursal,formaPago,detallePago,fecha) values (2,4,3,4,2,"2019-12-16");
insert into Pago(producto,cliente,sucursal,formaPago,detallePago,fecha) values (3,3,3,2,3,"2019-12-12");
insert into Pago(producto,cliente,sucursal,formaPago,detallePago,fecha) values (5,3,1,4,4,"2019-12-13");
insert into Pago(producto,cliente,sucursal,formaPago,detallePago,fecha) values (4,1,2,1,5,"2019-12-12");

insert into infoPaquete(paquete,producto) values (1,1);
insert into infoPaquete(paquete,producto) values (1,2);
insert into infoPaquete(paquete,producto) values (2,7);
insert into infoPaquete(paquete,producto) values (2,10);
insert into infoPaquete(paquete,producto) values (3,8);
insert into infoPaquete(paquete,producto) values (4,8);
insert into infoPaquete(paquete,producto) values (5,7);
insert into infoPaquete(paquete,producto) values (6,5);
insert into infoPaquete(paquete,producto) values (7,10);
insert into infoPaquete(paquete,producto) values (7,9);
insert into infoPaquete(paquete,producto) values (8,4);
insert into infoPaquete(paquete,producto) values (8,3);
insert into infoPaquete(paquete,producto) values (9,2);
insert into infoPaquete(paquete,producto) values (10,4);
insert into infoPaquete(paquete,producto) values (11,6);
insert into infoPaquete(paquete,producto) values (12,10);
insert into infoPaquete(paquete,producto) values (13,1);
insert into infoPaquete(paquete,producto) values (14,2);
insert into infoPaquete(paquete,producto) values (14,3);
insert into infoPaquete(paquete,producto) values (14,4);
insert into infoPaquete(paquete,producto) values (12,5);


insert into Mascota(dueño,nombre,tipo,fechaNacimiento) 
	values (1,"Firulais","Canino","2018-12-07"), 
			(2,"Chakira","Canino","2018-11-28"),
            (3,"Ebola","Felino","2018-02-28"),
            (4,"Mini","Felino","2017-12-18");
insert into Mascota(dueño,nombre,tipo,fechaNacimiento) values (5,"Luka","Felino","2018-12-11");
insert into Mascota(dueño,nombre,tipo,fechaNacimiento) values (6,"Nina","Felino","2018-02-07");
insert into Mascota(dueño,nombre,tipo,fechaNacimiento) values (7,"Rodolfo","Canino","2018-01-07");
insert into Mascota(dueño,nombre,tipo,fechaNacimiento) values (8,"Perro","Canino","2018-05-07");
insert into Mascota(dueño,nombre,tipo,fechaNacimiento) values (9,"Pitbull","Felino","2018-06-07");
insert into Mascota(dueño,nombre,tipo,fechaNacimiento) values (1,"Bethoven","Felino","2018-02-11");
insert into Mascota(dueño,nombre,tipo,fechaNacimiento) values (2,"Morza","Canino","2018-08-11");
insert into Mascota(dueño,nombre,tipo,fechaNacimiento) values (5,"Bender","Canino","2018-05-07");
insert into Mascota(dueño,nombre,tipo,fechaNacimiento) values (7,"Bony","Felino","2018-12-07");
insert into Mascota(dueño,nombre,tipo,fechaNacimiento) values (8,"Bob","Felino","2018-02-07");
insert into Mascota(dueño,nombre,tipo,fechaNacimiento) values (4,"Bagatele","Canino","2018-12-11");
insert into Mascota(dueño,nombre,tipo,fechaNacimiento) values (2,"Beatle","Canino","2018-12-02");

insert into TrasladoMascota(dueño,mascota,fechaEnvio,fechaEntrega,estado,direccion) values (1,1,"2020-01-25","2020-01-26","Pendiente","Acuarela del rio Mz2 V1");
insert into TrasladoMascota(dueño,mascota,fechaEnvio,fechaEntrega,estado,direccion) values (2,2,"2020-01-24","2020-01-25","Entregado","Colina de los Ceibos Mz 34");
insert into TrasladoMascota(dueño,mascota,fechaEnvio,fechaEntrega,estado,direccion) values (3,3,"2020-01-23","2020-01-27","Pendiente","Sauces 7 Mz 4");
insert into TrasladoMascota(dueño,mascota,fechaEnvio,fechaEntrega,estado,direccion) values (4,4,"2020-01-22","2020-01-25","Entregado","Alban Borja");
insert into TrasladoMascota(dueño,mascota,fechaEnvio,fechaEntrega,estado,direccion) values (5,5,"2020-01-24","2020-01-27","Pendiente","Ceibos Norte Mz 40");
insert into TrasladoMascota(dueño,mascota,fechaEnvio,fechaEntrega,estado,direccion) values (6,6,"2020-01-22","2020-01-25","Entregado","Guayacanes");
insert into TrasladoMascota(dueño,mascota,fechaEnvio,fechaEntrega,estado,direccion) values (7,7,"2020-01-22","2020-01-26","Pendiente","Colina de los Ceibos Mz 34");
insert into TrasladoMascota(dueño,mascota,fechaEnvio,fechaEntrega,estado,direccion) values (8,8,"2020-01-21","2020-01-25","Entregado","Alban Borja");
insert into TrasladoMascota(dueño,mascota,fechaEnvio,fechaEntrega,estado,direccion) values (9,9,"2020-01-20","2020-01-25","Entregado","Acuarela del rio Mz33 V1");
insert into TrasladoMascota(dueño,mascota,fechaEnvio,fechaEntrega,estado,direccion) values (1,10,"2020-01-20","2020-01-25","Entregado","Colina de los Ceibos Mz 34");
insert into TrasladoMascota(dueño,mascota,fechaEnvio,fechaEntrega,estado,direccion) values (2,11,"2020-01-20","2020-01-28","Pendiente","Acuarela del rio Mz25 V1");