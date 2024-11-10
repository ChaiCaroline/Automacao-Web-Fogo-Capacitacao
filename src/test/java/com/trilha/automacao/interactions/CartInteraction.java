package com.trilha.automacao.interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartInteraction {

    private WebDriver driver;

    public CartInteraction(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement selectBtnDelete(String produto){
        String xpathExpression = "//td[contains(@class, 'success')][contains(., '" + produto + "')]//a[text()='Delete']";
        return driver.findElement(By.xpath(xpathExpression));
    }

    public WebElement searchProductAdd(String produto){
        String xpathExpression = "//td[contains(@class, 'success')][contains(., '" + produto + "')]";
        return driver.findElement(By.xpath(xpathExpression));
    }
}
