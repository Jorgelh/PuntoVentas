/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     21/02/2023 11:53:58                          */
/*==============================================================*/

  

drop table if exists ADICIONAL;

drop table if exists DESCRIPCIONNOTAS;

drop table if exists DESCRI_ADICIONAL;

drop table if exists INGRESOS;

drop table if exists NOTAS;

drop table if exists PEDIDOS;

drop table if exists PRODUCTOS;

drop table if exists PRODUCTOS_INVENTARIO;

drop table if exists PRODUCTOS_PEDIDO;

/*==============================================================*/
/* Table: ADICIONAL                                             */
/*==============================================================*/
create table ADICIONAL
(
   ID_ADICIONAL         int not null AUTO_INCREMENT,
   ID_DESCRI_ADICIONAL  int,
   primary key (ID_ADICIONAL)
);

/*==============================================================*/
/* Table: DESCRIPCIONNOTAS                                      */
/*==============================================================*/
create table DESCRIPCIONNOTAS
(
   ID                   int not null AUTO_INCREMENT,
   DESCRIPCION          varchar(150),
   primary key (ID)
);

/*==============================================================*/
/* Table: DESCRI_ADICIONAL                                      */
/*==============================================================*/
create table DESCRI_ADICIONAL
(
   ID_DESCRI_ADICIONAL  int not null AUTO_INCREMENT,
   DESCRIPCION          varchar(75),
   primary key (ID_DESCRI_ADICIONAL)
);

/*==============================================================*/
/* Table: INGRESOS                                              */
/*==============================================================*/
create table INGRESOS
(
   ID_INGRESO           int not null AUTO_INCREMENT,
   CODIGO               int,
   primary key (ID_INGRESO)
);

/*==============================================================*/
/* Table: NOTAS                                                 */
/*==============================================================*/
create table NOTAS
(
   ID_NOTA              int not null AUTO_INCREMENT,
   ID_PRODUCTOS_PEDIDO  int,
   ID                   int,
   primary key (ID_NOTA)
);

/*==============================================================*/
/* Table: PEDIDOS                                               */
/*==============================================================*/
create table PEDIDOS
(
   ID_PEDIDO            int not null AUTO_INCREMENT,
   FECHA                date,
   TOTAL                decimal(5,2),
   primary key (ID_PEDIDO)
);

/*==============================================================*/
/* Table: PRODUCTOS                                             */
/*==============================================================*/
create table PRODUCTOS
(
   ID_PRODUCTO          int not null AUTO_INCREMENT,
   DESCRIPCION          varchar(150),
   PRECIO               decimal(4,2),
   TIPO                 int,
   primary key (ID_PRODUCTO)
);

/*==============================================================*/
/* Table: PRODUCTOS_INVENTARIO                                  */
/*==============================================================*/
create table PRODUCTOS_INVENTARIO
(
   CODIGO               int not null AUTO_INCREMENT,
   ID_PRODUCTO          int,
   DESCRIPCION          varchar(150),
   CANTIDAD             int,
   PRECIO               decimal(4,2),
   primary key (CODIGO)
);

/*==============================================================*/
/* Table: PRODUCTOS_PEDIDO                                      */
/*==============================================================*/
create table PRODUCTOS_PEDIDO
(
   ID_PRODUCTOS_PEDIDO  int not null AUTO_INCREMENT,
   ID_PEDIDO            int,
   ID_PRODUCTO          int,
   PRO_ID_PRODUCTOS_PEDIDO int,
   CANTIDAD             int,
   TIPO                 int,
   ADICIONAL            int,
   PRECIO               decimal(4,2),
   primary key (ID_PRODUCTOS_PEDIDO)
);

alter table ADICIONAL add constraint FK_REFERENCE_11 foreign key (ID_DESCRI_ADICIONAL)
      references DESCRI_ADICIONAL (ID_DESCRI_ADICIONAL) on delete restrict on update restrict;

alter table INGRESOS add constraint FK_REFERENCE_5 foreign key (CODIGO)
      references PRODUCTOS_INVENTARIO (CODIGO) on delete restrict on update restrict;

alter table NOTAS add constraint FK_REFERENCE_10 foreign key (ID)
      references DESCRIPCIONNOTAS (ID) on delete restrict on update restrict;

alter table NOTAS add constraint FK_REFERENCE_7 foreign key (ID_PRODUCTOS_PEDIDO)
      references PRODUCTOS_PEDIDO (ID_PRODUCTOS_PEDIDO) on delete restrict on update restrict;

alter table PRODUCTOS_INVENTARIO add constraint FK_REFERENCE_6 foreign key (ID_PRODUCTO)
      references PRODUCTOS (ID_PRODUCTO) on delete restrict on update restrict;

alter table PRODUCTOS_PEDIDO add constraint FK_REFERENCE_1 foreign key (ID_PEDIDO)
      references PEDIDOS (ID_PEDIDO) on delete restrict on update restrict;

alter table PRODUCTOS_PEDIDO add constraint FK_REFERENCE_2 foreign key (ID_PRODUCTO)
      references PRODUCTOS (ID_PRODUCTO) on delete restrict on update restrict;

alter table PRODUCTOS_PEDIDO add constraint FK_REFERENCE_9 foreign key (PRO_ID_PRODUCTOS_PEDIDO)
      references PRODUCTOS_PEDIDO (ID_PRODUCTOS_PEDIDO) on delete restrict on update restrict;

