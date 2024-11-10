package com.trilha.automacao.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {

    @FindBy(className = "btn btn-success")
    public static WebElement btnBuy;

    @FindBy(id = "totalp")
    public static WebElement priceFinally;
}
