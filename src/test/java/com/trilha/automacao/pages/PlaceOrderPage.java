package com.trilha.automacao.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaceOrderPage {

    @FindBy(id = "name")
    public static WebElement inputName;

    @FindBy(id = "country")
    public static WebElement inputCountry;

    @FindBy(id = "city")
    public static WebElement inputCity;

    @FindBy(id = "card")
    public static WebElement inputCard;

    @FindBy(id = "month")
    public static WebElement inputMonth;

    @FindBy(id = "year")
    public static WebElement inputYear;

    @FindBy(className = "sweet-alert")
    public static WebElement modalSucess;

}
