Feature: Register

  Scenario: registro exitoso

    Given el usuario abre la pagina web
    When el usuario ingresa los datos
      | name   | username     | city | country  | identification | phone      | email                 | pass     | verypassword |
      | edward | eduardandres | cali | Honduras | 1035123123     | 3102351654 | edwinjero1@yopmail.com | 12345678 | 12345678     |
    And ingresar al menu post
    And ingresar a crear una categoria
    And crear una categoria
      | namecategory              | descriptioncategory                       |
      | automatización de pruebas | es la automatización del prceso de prueba |
    Then el usuario observa la categoria creada