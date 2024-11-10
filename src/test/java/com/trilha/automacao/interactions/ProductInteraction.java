package com.trilha.automacao.interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductInteraction {

    private WebDriver driver;

    public WebElement selecionarProduto(String produto) {
        String xpathExpression = "//div[contains(@class, 'card')][contains(., '" + produto + "')]/a";
        return driver.findElement(By.xpath(xpathExpression));
    }
}
