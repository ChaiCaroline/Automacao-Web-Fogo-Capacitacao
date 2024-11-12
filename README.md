# Teste de Fluxo Completo de Compra

### 📋 Descrição

Este projeto automatiza o teste de um fluxo completo de compra em um site de e-commerce, utilizando BDD (Behavior-Driven Development) com Cucumber, JUnit e Selenium. O teste cobre todo o processo, desde a navegação na página inicial, seleção e adição de produtos ao carrinho, até o preenchimento dos dados de pagamento e finalização do pedido.

## 🚀 Funcionalidade Testada

A funcionalidade testada é realizar uma compra de um monitor, seguindo os passos abaixo:

- Navegar para a página inicial.
- Selecionar a categoria de produtos (por exemplo, 'monitors').
- Escolher um produto específico (ex.: monitor 'ASUS').
- Adicionar o produto ao carrinho.
- Verificar se o produto foi corretamente adicionado ao carrinho.
- Prosseguir para o checkout.
- Preencher corretamente os dados de pagamento e envio.
- Finalizar a compra com sucesso.

## Cenário de Teste (BDD)

```gherkin
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
    E eu verifico se o produto 'ASUS' foi adicionado ao carrinho
    Quando eu finalizo a compra
    E eu insiro as informações de pagamento e envio corretamente
    Então a compra deve ser concluída com sucesso

```

## Ferramentas Utilizadas

- Cucumber: Para definição de testes no formato BDD.
- JUnit: Para execução dos testes.
- Selenium WebDriver: Para automação de navegadores.

## 🔩 Relatório de Testes

A execução dos testes gera automaticamente um relatório que detalha cada etapa do fluxo de compra. Abaixo está uma captura de tela do relatório gerado:

### Detalhes do Relatório

- Status: Mostra se o teste passou (Pass) ou falhou (Fail).
- Timestamp: Indica o momento exato de cada ação.
- Detalhes: Explica cada etapa do teste, desde a navegação inicial até a finalização da compra.

#### Exemplo de Resultado

- Navegou para a página inicial.
- Clicou na categoria 'monitors'.
- Selecionou o monitor 'ASUS'.
- Produto adicionado ao carrinho com sucesso.
- Verificação de item no carrinho concluída.
- Dados de pagamento preenchidos.
- Pedido finalizado com sucesso.

## Estrutura de Pastas do Projeto

O projeto está organizado para facilitar a automação de testes usando **Java**, **JUnit**, **Cucumber**, e **Selenium**. Abaixo está a descrição detalhada da estrutura:

```plaintext
automacao-site/
├── src/
│   └── test/
│       ├── java/
│       │   └── com.trilha.automacao/
│       │       ├── asserts/
│       │       ├── interactions/
│       │       ├── pages/
│       │       ├── runner/
│       │       ├── steps/
│       │       │   ├── hooks/
│       │       │   ├── BuyStep.java
│       │       │   └── RegisterStep.java
│       │       └── utils/
│       └── resources/
│           └── features/
│               ├── buy.feature
│               └── register.feature
│           └── junit-platform.properties
├── target/
├── .gitignore
└── pom.xml
```

## 🔍 Como Clonar e Executar o Projeto

### Pré-requisitos

- Java JDK
- Maven (para gerenciamento de dependências)

### Passos para Configuração

1. Clonar o Repositório

   ```bash
   git clone https://github.com/usuario/projeto-teste-compra.git
   cd projeto-teste-compra
   ```

2. Instalar Dependências com Maven

   ```bash
   mvn clean install
   ```

3. Executar os Testes

   ```bash
   mvn test
   ```

4. Gerar Relatório Extent Reports

   Após a execução, os relatórios estarão disponíveis na pasta target/Spark.html.

## Tecnologias Adicionais

- Lombok (para simplificar código Java)
- Extent Reports (para relatórios detalhados)

## Conclusão

Este projeto foi desenvolvido para garantir que o fluxo de compra esteja funcionando corretamente. Ao automatizar esses testes, conseguimos minimizar erros e melhorar a confiabilidade do sistema.

## ✒️ Autores

Mencione todos aqueles que ajudaram a levantar o projeto desde o seu início

- Chaiene - [GitHub](https://github.com/ChaiCaroline) - [Linkedin](https://www.linkedin.com/in/chaiene-caroline/)
