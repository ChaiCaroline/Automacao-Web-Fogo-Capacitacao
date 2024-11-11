package com.trilha.automacao.steps;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.trilha.automacao.asserts.RegisterAssert;
import com.trilha.automacao.interactions.RegisterInteraction;
import com.trilha.automacao.utils.Configuration;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import static com.trilha.automacao.utils.ExtentReport.extent;

public class RegisterStep {

    private final RegisterInteraction registerInteraction;
    private final RegisterAssert registerAssert;
    private final ExtentTest test;

    public RegisterStep() {
        registerInteraction = new RegisterInteraction(Configuration.getDriver());
        registerAssert = new RegisterAssert(Configuration.getDriver());

        test = extent.createTest("Registro de Usuário");
    }

    @Dado("que estou na página inicial")
    public void que_estou_na_pagina_inicial() {
        Configuration.acessURL("https://www.demoblaze.com/index.html");
        test.log(Status.INFO, "Navegou para a página inicial");
    }

    @Quando("eu clicar em sign up")
    public void eu_clicar_em_sign_up() {
        registerInteraction.clickButtonSignUp("menu");
        test.log(Status.INFO, "Clicou no botão Sign Up");
    }

    @Quando("inserir meu nome, {string} e {string} para cadastro")
    public void inserir_meu_nome_e_para_cadastro(String username, String password) {
        registerInteraction.RegisterUser(username, password);
        test.log(Status.INFO, "Inseriu nome de usuário e senha");
    }

    @Quando("clicar novamente em sign up")
    public void clicar_novamente_em_sign_up() {
        registerInteraction.clickButtonSignUp("registro");
        test.log(Status.INFO, "Clicou novamente em Sign Up");
    }

    @Então("deve aparecer a mensagem {string}")
    public void deve_aparecer_a_mensagem(String mensagem) {
        boolean resultado = registerAssert.verifyAlertRegister(mensagem);

        if (resultado) {
            test.log(Status.PASS, "Mensagem de alerta exibida com sucesso");
        } else {
            test.log(Status.FAIL, "Mensagem de alerta não exibida");
        }

        Assert.assertTrue(resultado);
    }

}
