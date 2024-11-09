package com.trilha.automacao.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(id = "sign-username")
    public static WebDriver inputLogin;

    @FindBy(id = "sign-password")
    public static WebElement inputSenha;
}
