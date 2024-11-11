package com.trilha.automacao.interactions;

import com.trilha.automacao.pages.ProductPage;
import com.trilha.automacao.utils.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductInteraction extends ProductPage {

    private WebDriver driver;
    private Waits waits;

    public ProductInteraction(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.waits = new Waits(driver);
    }

    public WebElement selecionarProduto(String produto) {
        By xpathExpression = By.xpath("//div[contains(@class, 'card')]//a[contains(text(), '" + produto + "')]");
        waits.waitElement(xpathExpression);
        return driver.findElement(xpathExpression);
    }

    public void addProductCart(){
         waits.waitClick(btnAddCar).click();
    }
}
