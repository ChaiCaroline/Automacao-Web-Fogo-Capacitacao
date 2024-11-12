package com.trilha.automacao.interactions;

import com.trilha.automacao.pages.PlaceOrderPage;
import com.trilha.automacao.pages.ProductPage;
import com.trilha.automacao.utils.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductInteraction extends ProductPage {

    private WebDriver driver;
    private Waits waits;
    private PlaceOrderPage placeOrderPage;

    public ProductInteraction(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.waits = new Waits(driver);
        this.placeOrderPage = new PlaceOrderPage(driver);
    }

    public WebElement selecionarProduto(String produto) {
        By xpathExpression = By.xpath("//div[contains(@class, 'card')]//a[contains(text(), '" + produto + "')]");
        waits.waitElement(xpathExpression);
        return driver.findElement(xpathExpression);
    }

    public void addProductCart(){
         waits.waitClick(btnAddCar).click();
    }

    public void acceptAlert(){
        waits.waitAlertIsPresent().accept();
    }

    public void formOrder(String name, String country, String city, String credit, String month, String year){
        if(waits.waitVisibily(placeOrderPage.inputName).isDisplayed()){
            placeOrderPage.inputName.sendKeys(name);
            placeOrderPage.inputCountry.sendKeys(country);
            placeOrderPage.inputCity.sendKeys(city);
            placeOrderPage.inputCard.sendKeys(credit);
            placeOrderPage.inputMonth.sendKeys(month);
            placeOrderPage.inputYear.sendKeys(year);

            placeOrderPage.btnPurchase.click();
        }
    }
}
