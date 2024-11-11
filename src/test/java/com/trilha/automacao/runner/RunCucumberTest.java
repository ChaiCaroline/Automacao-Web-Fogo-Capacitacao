package com.trilha.automacao.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.trilha.automacao.steps",
        tags = "@compra",
        monochrome = false
)
public class RunCucumberTest {
}