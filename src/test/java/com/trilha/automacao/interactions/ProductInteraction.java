package com.trilha.automacao.interactions;

import com.trilha.automacao.pages.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductInteraction extends ProductPage {

    private WebDriver driver;

    public ProductInteraction(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public WebElement selecionarProduto(String produto) {
        String xpathExpression = "//div[contains(@class, 'card')][contains(., '" + produto + "')]/a";
        return driver.findElement(By.xpath(xpathExpression));
    }
}
