package com.trilha.automacao.steps;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.trilha.automacao.interactions.CategoryInteraction;
import com.trilha.automacao.interactions.NavegationInteraction;
import com.trilha.automacao.interactions.ProductInteraction;
import com.trilha.automacao.utils.Configuration;
import io.cucumber.java.pt.*;

import static com.trilha.automacao.utils.ExtentReport.extent;

public class BuyStep {

    private final NavegationInteraction navegationInteraction;
    private final CategoryInteraction categoryInteraction;
    private final ProductInteraction productInteraction;
    private final ExtentTest test;

    public BuyStep() {
        navegationInteraction = new NavegationInteraction(Configuration.getDriver());
        categoryInteraction = new CategoryInteraction(Configuration.getDriver());
        productInteraction = new ProductInteraction(Configuration.getDriver());

        test = extent.createTest("Processo de Compra");
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

    }

    @Então("o produto deve ser exibido no carrinho")
    public void o_produto_deve_ser_exibido_no_carrinho() {

    }

    @E("eu navego até a página do {string}")
    public void eu_navego_até_a_página_do_carrinho(String navegacao) {
        navegationInteraction.clickButtonNav(navegacao);
    }

    @E("eu verifico que todos os produtos adicionados estão corretos")
    public void eu_verifico_que_todos_os_produtos_adicionados_estão_corretos() {

    }

    @Quando("eu finalizo a compra")
    public void eu_finalizo_a_compra() {

    }

    @E("eu insiro as informações de pagamento e envio corretamente")
    public void eu_insiro_as_informações_de_pagamento_e_envio_corretamente() {

    }

    @Então("a compra deve ser concluída com sucesso")
    public void a_compra_deve_ser_concluída_com_sucesso() {

        extent.flush();
    }
}
