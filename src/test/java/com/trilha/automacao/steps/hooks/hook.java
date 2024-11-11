package com.trilha.automacao.steps.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.trilha.automacao.utils.Configuration.quitDriver;
import static com.trilha.automacao.utils.Configuration.startDriver;
import static com.trilha.automacao.utils.ExtentReport.finishReport;
import static com.trilha.automacao.utils.ExtentReport.setupReport;

public class hook {

    @Before
    public void inicialized(){
        startDriver();
        setupReport();
    }

    @After
    public void finish(){
        quitDriver();
        finishReport();
    }
}
