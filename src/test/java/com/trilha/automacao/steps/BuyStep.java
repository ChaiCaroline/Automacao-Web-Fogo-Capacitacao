package com.trilha.automacao.steps;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.trilha.automacao.asserts.BuyAssert;
import com.trilha.automacao.interactions.CartInteraction;
import com.trilha.automacao.interactions.CategoryInteraction;
import com.trilha.automacao.interactions.NavegationInteraction;
import com.trilha.automacao.interactions.ProductInteraction;
import com.trilha.automacao.utils.Configuration;
import io.cucumber.java.pt.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static com.trilha.automacao.utils.ExtentReport.extent;

public class BuyStep {

    private final NavegationInteraction navegationInteraction;
    private final CategoryInteraction categoryInteraction;
    private final ProductInteraction productInteraction;
    private final CartInteraction cartInteraction;
    private final ExtentTest test;
    private BuyAssert buyAssert;

    public BuyStep() {
        navegationInteraction = new NavegationInteraction(Configuration.getDriver());
        categoryInteraction = new CategoryInteraction(Configuration.getDriver());
        productInteraction = new ProductInteraction(Configuration.getDriver());
        cartInteraction = new CartInteraction(Configuration.getDriver());
        buyAssert = new BuyAssert(Configuration.getDriver());

        test = extent.createTest("Processo de Compra");
    }

    @Dado("que estou na página inicial")
    public void que_estou_na_pagina_inicial() {
        Configuration.acessURL("https://www.demoblaze.com/index.html");
        test.log(Status.INFO, "Navegou para a página inicial");
    }

    @E("eu clico na categoria {string}")
    public void eu_clico_na_categoria(String categoria) {
        categoryInteraction.clickButtonCategory(categoria);
        test.log(Status.INFO, "Clicou no botão da categoria informado");
    }

    @E("eu seleciono o monitor {string}")
    public void eu_seleciono_o_monitor(String produto) {
        productInteraction.selecionarProduto(produto).click();
        test.log(Status.INFO, "Clicou no produto informado");
    }

    @Quando("eu adiciono o produto ao carrinho")
    public void eu_adiciono_o_produto_ao_carrinho() {
        productInteraction.addProductCart();
        test.log(Status.INFO, "Produto adicionado ao carrinho");
    }

    @Então("o produto deve ser exibido no carrinho")
    public void o_produto_deve_ser_exibido_no_carrinho() {
        if(buyAssert.verifyAlert("Product added")){
            productInteraction.acceptAlert();
            test.log(Status.PASS, "Mensagem de Produto adicionado o produto ao carrinho exibido");
            Assert.assertTrue(true);
        }else {
            test.log(Status.FAIL, "Mensagem de Produto adicionado o produto ao carrinho, não foi exibido");
            Assert.fail();
        }
    }

    @E("eu navego até a página do {string}")
    public void eu_navego_até_a_página_do_carrinho(String navegacao) {
        navegationInteraction.clickButtonNav(navegacao);
        test.log(Status.INFO, "Navegou até o menu "+navegacao);
    }

    @E("eu verifico se produto {string} foi adicionado ao carrinho")
    public void eu_verifico_se_produto_foi_adicionado_ao_carrinho(String produto) {

        if(cartInteraction.searchProductAdd(produto).isDisplayed()){
            test.log(Status.PASS, "Produto no carrinho");
            Assert.assertTrue(true);
        }else {
            test.log(Status.FAIL, "Produto informado não está no carrinho");
            Assert.fail();
        }
    }

    @Quando("eu finalizo a compra")
    public void eu_finalizo_a_compra() {
        cartInteraction.clickButtonCart();
        test.log(Status.INFO, "Clicou no botão placer order");
    }

    @E("eu insiro as informações de pagamento e envio corretamente")
    public void eu_insiro_as_informações_de_pagamento_e_envio_corretamente() {
        productInteraction.formOrder("Chaiene", "Brasil", "Taubate", "51912838192", "12", "2026");
        test.log(Status.INFO, "Preencheu o formulário, para finalizar o pedido");
    }

    @Então("a compra deve ser concluída com sucesso")
    public void a_compra_deve_ser_concluída_com_sucesso() {
        if(buyAssert.verifyModalFinishBuy()){
            test.pass("Pedido realizado com sucesso");
        Assert.assertTrue(buyAssert.verifyModalFinishBuy());
        }else {
            test.fail("Teste falhou para finalizar o pedido");
            Assert.fail();
        }
        extent.flush();
    }
}
