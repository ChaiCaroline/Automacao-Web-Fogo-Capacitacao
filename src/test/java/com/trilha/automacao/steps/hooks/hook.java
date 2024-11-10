package com.trilha.automacao.steps.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.trilha.automacao.utils.Configuration.quitDriver;
import static com.trilha.automacao.utils.Configuration.startDriver;

public class hook {

    @Before
    public void inicialized(){
        startDriver();
    }

    @After
    public void finish(){
        quitDriver();
    }
}
