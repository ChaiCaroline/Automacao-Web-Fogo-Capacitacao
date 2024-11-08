package com.trilha.automacao.steps.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hook {

    public static WebDriver driver;

    @Before
    public void createWebDriver() {
            driver = new ChromeDriver();
    }



    @After
    public void finalizar(){
    driver.quit();
    }
}
