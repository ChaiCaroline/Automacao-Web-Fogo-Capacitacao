package com.trilha.automacao.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavPage {

    public NavPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "nava")
    public WebElement iconLogo;

    @FindBy(xpath = "//a[@class='nav-link' and contains(text(), 'Home')]")
    public WebElement btnHome;

    @FindBy(xpath = "//a[@class='nav-link' and contains(text(), 'Contact')]")
    public WebElement btnContact;

    @FindBy(xpath = "//a[@class='nav-link' and contains(text(), 'About us')]")
    public WebElement btnAbout;

    @FindBy(xpath = "//a[@class='nav-link' and contains(text(), 'Cart')]")
    public WebElement btnCart;

    @FindBy(xpath = "//a[@class='nav-link' and contains(text(), 'Log in')]")
    public WebElement btnLogIn;

    @FindBy(xpath = "//a[@class='nav-link' and contains(text(), 'Sign up')]")
    public WebElement btnSignUp;

}
