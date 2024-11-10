package com.trilha.automacao.interactions;

import com.trilha.automacao.pages.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CartInteraction extends CartPage {

    private WebDriver driver;

    public CartInteraction(WebDriver driver) {
        super(driver);
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
