package com.trilha.automacao.steps;

import com.trilha.automacao.interactions.RegisterInteraction;
import com.trilha.automacao.utils.Configuration;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class RegisterStep {

    private final RegisterInteraction registerInteraction;

    public RegisterStep() {
        registerInteraction = new RegisterInteraction(Configuration.getDriver());
    }

    @Dado("que estou na página inicial")
    public void que_estou_na_pagina_inicial() {
        Configuration.acessURL("https://www.demoblaze.com/index.html");
    }

    @Quando("eu clicar em sign up")
    public void eu_clicar_em_sign_up() {
        registerInteraction.clickButtonSignUp();
    }

    @Quando("inserir meu nome, {string} e {string} para cadastro")
    public void inserir_meu_nome_e_para_cadastro(String string, String string2) {

    }

    @Quando("clicar novamente em sign up")
    public void clicar_novamente_em_sign_up() {

    }

    @Então("deve aparecer a mensagem {string}")
    public void deve_aparecer_a_mensagem(String string) {

    }
}
