@Shopping
Feature: Flujo de compras

  Scenario Outline: Realizar una prueba funcional automatizada (Prueba E2E) de un flujo de compra en la pagina
      Given Usuario ingresa al sitio web
    When Me autentico con el <username> y <password>
      Then Agregar dos productos al carrito
      And Visualizar el carrito
      When Completar el formulario de compra
      Then Finalizar la compra hasta la confirmación:THANK YOU FOR YOUR ORDER

    Examples:
      | username          | password          |
      | standard_user     | secret_sauce      |
