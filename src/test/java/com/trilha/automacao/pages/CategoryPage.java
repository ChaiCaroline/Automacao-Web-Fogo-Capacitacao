package com.trilha.automacao.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {

    public CategoryPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='itemc' and contains(text(), 'Phones')]")
    public WebElement categoryPhone;

    @FindBy(xpath = "//a[@id='itemc' and contains(text(), 'Laptops')]")
    public WebElement categoryLaptop;

    @FindBy(xpath = "//a[@id='itemc' and contains(text(), 'Monitors')]")
    public WebElement categoryMonitors;
}
