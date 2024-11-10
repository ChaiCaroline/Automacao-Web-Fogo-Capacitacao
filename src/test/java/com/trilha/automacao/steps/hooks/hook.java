package com.trilha.automacao.steps.hooks;

import io.cucumber.java.After;

import static com.trilha.automacao.utils.Configuration.quitDriver;

public class hook {

    @After
    public void finish(){
        quitDriver();
    }
}
