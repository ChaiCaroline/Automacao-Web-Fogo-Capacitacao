package com.trilha.automacao.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPage {
    public PlaceOrderPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "name")
    public WebElement inputName;

    @FindBy(id = "country")
    public WebElement inputCountry;

    @FindBy(id = "city")
    public WebElement inputCity;

    @FindBy(id = "card")
    public WebElement inputCard;

    @FindBy(id = "month")
    public WebElement inputMonth;

    @FindBy(id = "year")
    public WebElement inputYear;

    @FindBy(className = "sweet-alert")
    public WebElement modalSucess;

    @FindBy(xpath = "//button[contains(@class, 'btn btn-primary')][contains(., 'Purchase')]")
    public WebElement btnPurchase;

}
