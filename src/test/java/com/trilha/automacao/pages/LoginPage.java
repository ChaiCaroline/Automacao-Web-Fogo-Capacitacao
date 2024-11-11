package com.trilha.automacao.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "sign-username")
    public WebElement inputLogin;

    @FindBy(id = "sign-password")
    public WebElement inputSenha;

    @FindBy(xpath = "//button[@class='btn btn-primary' and contains(text(), 'Sign up')]")
    public WebElement btnSignUp;
}
