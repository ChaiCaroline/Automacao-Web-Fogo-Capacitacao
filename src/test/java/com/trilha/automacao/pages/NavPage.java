package com.trilha.automacao.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavPage {

    @FindBy(id = "nava")
    public static WebElement iconLogo;

    @FindBy(xpath = "//a[@class='nav-link' and contains(text(), 'Home')]")
    public static WebElement btnHome;

    @FindBy(xpath = "//a[@class='nav-link' and contains(text(), 'Contact')]")
    public static WebElement btnContact;

    @FindBy(xpath = "//a[@class='nav-link' and contains(text(), 'About us')]')]")
    public static WebElement btnAbout;

    @FindBy(xpath = "//a[@class='nav-link' and contains(text(), 'Cart')]")
    public static WebElement btnCart;

    @FindBy(xpath = "//a[@class='nav-link' and contains(text(), 'Log in')]")
    public static WebElement btnLogIn;

    @FindBy(xpath = "//a[@class='nav-link' and contains(text(), 'Sign up')]")
    public static WebElement btnSignUp;

}
