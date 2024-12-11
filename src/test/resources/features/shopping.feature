@Shopping
Feature: Flujo de compras

<<<<<<< HEAD
  Scenario Outline: Realizar una prueba funcional automatizada (Prueba E2E) de un flujo de compra en la pagina
      Given Usuario ingresa al sitio web
    When Me autentico con el <username> y <password>
=======

    Scenario Outline: Realizar una prueba funcional automatizada (Prueba E2E) de un flujo de compra en la pagina
      Given Usuario ingresa al sitio web
      When Me autentico con el <username> and <password>
>>>>>>> 111bda151ec0af129578fad5e1a364d01ba3d21d
      Then Agregar dos productos al carrito
      And Visualizar el carrito
      When Completar el formulario de compra
      Then Finalizar la compra hasta la confirmación:THANK YOU FOR YOUR ORDER

<<<<<<< HEAD
    Examples:
      | username          | password          |
      | standard_user     | secret_sauce      |
=======
      Examples:
        | username          | password          |
        | standard_user     | secret_sauce      |
>>>>>>> 111bda151ec0af129578fad5e1a364d01ba3d21d
