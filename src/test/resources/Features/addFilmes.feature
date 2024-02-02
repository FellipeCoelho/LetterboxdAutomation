Feature: Adicionar filme ao diario

  #    Scenario Outline: Adicionar filme assistido hoje
  #      Given estou conectado com as credenciais <login> <senha>
  #      When adiciono o filme <filme>
  #      And dou uma nota
  #      And dou like
  #      And faco uma review <review>
  #      And salvo a review
  #      Then o filme <filme> devera ser exibido no diario
  #      And o filme <filme> e <review> deverao estar corretos
  #      Examples:
  #        | login      | senha        | filme        | review                                                             |
  #        | Draculolly | 123690123690 | Titanic 1997 | Uma historia de amor tao tragica que ate o iceberg ficou com pena. |
  Scenario Outline: Adicionar filme assistido anteriormente
    Given estou conectado com as credenciais <login> <senha>
    When adiciono o filme <filme>
    And seleciono uma data <data>
    And dou uma nota
    And dou like
    And faco uma review <review>
    And salvo a review
    Then o filme <filme> devera ser exibido no diario
    And o filme <filme> e <review> e <data> deverao estar corretos

    Examples: 
      | login      | senha        | data             | filme     | review                                                |
      | Draculolly | 123690123690 | 01 February 2024 | Dune 2021 | Paul Atreides deve ter ficado com muita dor de cabeca |
