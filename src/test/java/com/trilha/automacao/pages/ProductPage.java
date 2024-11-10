package com.trilha.automacao.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {

    @FindBy(className = "name")
    public static WebElement titleProduct;

    @FindBy(className = "price-container")
    public static WebElement priceProduct;

    @FindBy(className = "btn btn-success btn-lg")
    public static WebElement btnAddCar;
}
