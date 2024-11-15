#language: pt

@compra
Funcionalidade: Realizar fluxo completo de compra

  Cenário: Realizar uma compra de um monitor com sucesso

    Dado que estou na página inicial
    E eu clico na categoria 'monitors'
    E eu seleciono o monitor 'ASUS'
    Quando eu adiciono o produto ao carrinho
    Então o produto deve ser exibido no carrinho
    E eu navego até a página do 'cart'
    E eu verifico se produto 'ASUS' foi adicionado ao carrinho
    Quando eu finalizo a compra
    E eu insiro as informações de pagamento e envio corretamente
    Então a compra deve ser concluída com sucesso


