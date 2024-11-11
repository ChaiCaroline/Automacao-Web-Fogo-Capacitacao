#language: pt

  @register
  Funcionalidade: Registro na página

    @Cenario1
    Cenário: Cadastro de um novo usuário

      Dado que estou na página inicial
      Quando eu clicar em sign up
      E inserir meu nome, 'Ricardo12' e '123' para cadastro
      E clicar novamente em sign up
      Então deve aparecer a mensagem 'Sign up successful.'

