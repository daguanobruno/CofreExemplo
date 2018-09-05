# language: en
Feature: O Usuario entra com uma senha de 6 digitos

  Scenario: entrar com uma senha
    Given que eu entrei com 6 digitos
    When eu realizei a abertura da porta
    Then o resultado deve ser a mensagem "senha correta. Cofre aberto"
