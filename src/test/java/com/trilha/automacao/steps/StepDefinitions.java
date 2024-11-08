package com.trilha.automacao.steps;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.trilha.automacao.steps.hooks.hook;
import io.cucumber.java.pt.*;

public class StepDefinitions {

    public static ExtentReports extent;
    public static ExtentSparkReporter spark;
    private final ExtentTest test;

    public StepDefinitions() {
        extent = new ExtentReports();
        spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
        test = extent.createTest("MeuPrimeiroTeste");
    }


    @Dado("que estou efetuando o teste")
    public void teste() {
        hook.driver.get("https://www.saucedemo.com/");
        test.log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
        test.assignDevice("Passou com sucesso");

    }

    @Entao("deve ser efetuado")
    public void theScenarioPasses() {
        test.assignAuthor("Chaiene").pass("Bem detalhado");
        test.fail(MediaEntityBuilder.createScreenCaptureFromPath("img.png").build());
        // Exemplo para flush caso queira salvar o relatório após este passo
        extent.flush();
    }

}
