package com.trilha.automacao.interactions;

import com.trilha.automacao.pages.CartPage;
import com.trilha.automacao.utils.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartInteraction extends CartPage {

    private WebDriver driver;
    private Waits waits;

    public CartInteraction(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.waits = new Waits(driver);
    }

    public WebElement selectBtnDelete(String produto){
        String xpathExpression = "//td[contains(@class, 'success')][contains(., '" + produto + "')]//a[text()='Delete']";
        return driver.findElement(By.xpath(xpathExpression));
    }

    public WebElement searchProductAdd(String produto){
        By xpathExpression = By.xpath("//tr[contains(@class, 'success')][contains(., '" + produto + "')]");
        return waits.waitElement(xpathExpression);
    }

    public void clickButtonCart(){
        waits.waitClick(btnBuy).click();
    }
}
