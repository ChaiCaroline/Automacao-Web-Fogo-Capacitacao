package com.trilha.automacao.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    public ProductPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "name")
    public WebElement titleProduct;

    @FindBy(className = "price-container")
    public WebElement priceProduct;

    @FindBy(css = ".btn.btn-success.btn-lg")
    public WebElement btnAddCar;
}
