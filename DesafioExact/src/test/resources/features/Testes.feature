Feature: Testes

    Background:
      Given estou na página inicial

    Scenario: Fazer login com sucesso
      And clico em 'My Account'
      And preencho 'email' e 'senha'
      When clico em LOGIN
      Then a mensagem de 'Hello usuário' deve ser exibida

    Scenario: Recuperar senha
      And clico em 'My Account'
      And clico em 'Lost your password?'
      And preencho o campo 'Username or email'
      When clico em RESET PASSWORD
      Then a mensagem 'Password reset email has been sent.' deve ser exibida

    Scenario: Fazer cadastro com sucesso
      And clico em 'My Account'
      And preencho 'email' e 'senha' de cadastro
      When clico em REGISTER
      Then a mensagem de cadastro 'Hello usuário' deve ser exibida