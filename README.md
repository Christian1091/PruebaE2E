# Ejercicio de Automatización E2E con Serenity BDD Screeplay
Este es un proyecto de ejemplo donde se automatizan pruebas de una aplicación web utilizando el patrón **Screenplay** de Serenity.

## Funcionalidades
Este proyecto realiza pruebas funcionales automatizadas utilizando Serenity BDD screenplay, el cual, permite un flujo de compra en la página
https://www.saucedemo.com/ que incluya:

* Autenticarse con el usuario: standard_user y password: secret_sauce
* Agregar dos productos al carrito
* Visualizar el carrito
* Completar el formulario de compra
* Finalizar la compra hasta la confirmación: “THANK YOU FOR YOUR ORDER”
  
## Requisitos
* IntelliJ IDEA 2023.3.3
* JDK 17: Verificar Java en las variables de entorno.
* Maven 3.9.9 : Importante que tengan Maven en las variables de entorno.
* Serenity BDD Screenplay se instalará automáticamente al ejecutar el proyecto junto a otras dependencias necesarias, estas se encuentran en el pom.xml
* Navegador web de preferencia:
  * Google Chrome

## Plugins necesarios en el IDE
* Cucumber for Java
* Gherkin

## Instalación
* Clonar el repositorio en la máquina local: git clone https://github.com/YOUR-USERNAME/YOUR-REPOSITORY.
* Verificar dependencias en el pom.xml
* Ubicarse en la clase RunnerMain que se encuentra dentro de la carpeta /src/test/java y ejecutar el RunnerMain
