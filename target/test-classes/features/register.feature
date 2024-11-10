#language: pt

  @register
  Funcionalidade: Registro na página

    @Cenario1
    Cenário: Cadastro de um novo usuário

      Dado que estou na página inicial
      Quando eu clicar em sign up
      E inserir meu nome, 'e-mail' e 'senha' para cadastro
      E clicar novamente em sign up
      Então deve aparecer a mensagem 'Cadastro realizado com sucesso'

