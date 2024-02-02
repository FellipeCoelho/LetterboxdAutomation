Feature: Adicionar filme na watchlist

  Scenario Outline: Adicionar filme popular na semana
    Given estou conectado com as credenciais <login> <senha>
    When escolho um filme popular na semana
    And coloco esse filme na watchlist
    And retorno para a aba popular
    Then o filme escolhido devera ser exibido na watchlist

    Examples: 
      | login      | senha        |
      | Draculolly | 123690123690 |

  Scenario Outline: Adicionar filme popular na semana
    Given estou conectado com as credenciais <login> <senha>
    When vou para o menu
    And procuro por <categoria>
    And escolho o filtro <filtro> <genero>
    And escolho o filme <filme>
    And adiciono na watchlist
    And retorno
    Then o filme <filme> devera ser exibido na watchlist

    Examples: 
      | login      | senha        | categoria                  | filtro | genero  | filme  |
      | Draculolly | 123690123690 | Genre, country or language | Genre  | Fantasy | Avatar |
