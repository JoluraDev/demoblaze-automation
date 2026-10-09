@compra @e2e
Feature: Combra de productos en Demoblaze
    Como usuario de Demoblaze
    Quiero agregar un producto al carrito y completar el formulario de pedido
    Para realizar una compra exitosa

    Scenario: Compra exitosa de un celular
        Given que el usuario ingresa a la pagina de compras
        When agrega el producto "Samsung galaxy s6" al carrito
        And completa el formulario de pago con los datos:
            | nombre          | pais       | ciudad     | tarjeta          | mes | anio |
            | Alphonse Elrick | Amestris   | Central    | 4532019283748291 | 10  | 2028 |
        Then deberia ver el mensaje de confirmacion "Gracias por su compra"

    