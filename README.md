# Project-RedFlixPro-App

> Proyecto de formación de 2020 (reto 5 del ciclo II).

Aplicación de escritorio en Java para gestionar los usuarios de "RedFlix": permite crear, validar y eliminar usuarios (nombre, apellido, apodo, email, celular, fecha de nacimiento y contraseña) desde una interfaz Swing, guardándolos en MySQL con Spring Boot y JPA.

## Tecnologías
- Java 11
- Spring Boot (Data JPA) con Maven
- MySQL
- Swing para la interfaz

## Configuración

El proyecto está en la carpeta `reto5/`. Espera una base de datos MySQL en `localhost:3304` llamada `redlix5` (ver `reto5/src/main/resources/application.properties`). El usuario y la contraseña se leen del entorno:

```bash
export DB_USER=root
export DB_PASSWORD=tu_clave
cd reto5
./mvnw spring-boot:run
```

## Licencia
CC0 1.0 Universal. Ver [LICENSE](LICENSE).
