# GestionTareasBack

> Esta es solamente una parte del proyecto, la parte de Frontend esta en el repositorio [GestionTareasFront](https://github.com/MCPikon/gestionTareasFront)

## Autor

* [Javier Picón](https://github.com/MCPikon)

## Descripción

Proyecto Final del Curso de Agrupo Sistemas que consiste en un Backend hecho enteramente con Java 17 y Spring Boot (versión 3.0.4).

## Tecnologías

* Java 17
* Spring Boot 3.0.4
* _**Dependencias Maven:**_
  * Spring Starter Data JPA
  * Spring Starter Web
  * MySQL Connector
  * Spring Starter Validation
  * Spring Starter Security
  * io.jsonwebtoken (0.11.5):
    * jjwt-api
    * jjwt-impl
    * jjwt-jackson
  * nimbus jose jwt (9.31)
  * lombok (1.18.26)

## Cómo funciona

Este proyecto consta de varias partes:

* **Parte de Seguridad** *(paquete security)*: Se encarga de la parte de Registrar al usuario en la BBDD, Iniciar la sesión del usuario que se le pase, crear, refrescar y borrar Tokens, crear y gestionar los roles de usuarios, y, gestionar y restringir el acceso mediante CORS a los distintos métodos de los Controllers de la API.

* **Parte de Usuarios y Tareas**: Se encarga del CRUD (Crear, Modificar y Eliminar) de las Tareas y los Usuarios. Disponen de entidades, repositorios, servicios e implementaciones de servicios.