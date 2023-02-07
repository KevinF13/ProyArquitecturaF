CREATE DATABASE dbArqSwProyecto;
/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2/02/2023 10:55:25 a. m.                     */
/*==============================================================*/

USE dbArqSwProyecto;

drop table if exists GRUPOSANCION;

drop table if exists RAZON;

drop table if exists SANCION;

/*==============================================================*/
/* Table: GRUPOSANCION                                          */
/*==============================================================*/
create table GRUPOSANCION
(
   IDGRUPO              int not null AUTO_INCREMENT,
   NOMBREGRUPO          varchar(50),
   DESCRIPCIONART       varchar(100),
   primary key (IDGRUPO)
);

/*==============================================================*/
/* Table: RAZON                                                 */
/*==============================================================*/
create table RAZON
(
   IDRAZON              int not null AUTO_INCREMENT,
   IDSANCION            int,
   NOMBRERAZON          varchar(100),
   DESCRIPCIONRAZON     varchar(300),
   primary key (IDRAZON)
);

/*==============================================================*/
/* Table: SANCION                                               */
/*==============================================================*/
create table SANCION
(
   IDSANCION            int not null AUTO_INCREMENT,
   IDGRUPO              int,
   ARTICULOSANCION      varchar(10),
   NOMBRESANCION        varchar(100),
   DESCRIPCIONSANCION   text,
   primary key (IDSANCION)
);

alter table RAZON add constraint FK_RELATIONSHIP_2 foreign key (IDSANCION)
      references SANCION (IDSANCION) on delete restrict on update restrict;

alter table SANCION add constraint FK_RELATIONSHIP_1 foreign key (IDGRUPO)
      references GRUPOSANCION (IDGRUPO) on delete restrict on update restrict;

