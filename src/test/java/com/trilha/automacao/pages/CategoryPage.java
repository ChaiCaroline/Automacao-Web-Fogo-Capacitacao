package com.trilha.automacao.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage {

    @FindBy(xpath = "//a[@id='itemc' and contains(text(), 'Phones')]")
    public static WebElement categoryPhone;

    @FindBy(xpath = "//a[@id='itemc' and contains(text(), 'Laptops')]")
    public static WebElement categoryLaptop;

    @FindBy(xpath = "//a[@id='itemc' and contains(text(), 'Monitors')]")
    public static WebElement categoryMonitors;
}
