@Shopping
Feature: Flujo de compras

    Scenario: Realizar una prueba funcional automatizada (Prueba E2E) de un flujo de compra en la pagina
      Given Usuario ingresa al sitio web
      When Me autentico con el usuario: standard_user y password: secret_sauce
      Then Agregar dos productos al carrito
      And Visualizar el carrito
      When Completar el formulario de compra
      Then Finalizar la compra hasta la confirmación:THANK YOU FOR YOUR ORDER

