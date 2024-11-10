package com.trilha.automacao.interactions;

import com.trilha.automacao.pages.LoginPage;
import com.trilha.automacao.pages.NavPage;
import com.trilha.automacao.utils.Waits;
import org.openqa.selenium.WebDriver;

public class RegisterInteraction extends LoginPage {

    private WebDriver driver;
    private Waits waits;
    private NavPage navPage;

    public RegisterInteraction(WebDriver driver) {
        this.driver = driver;
        this.waits = new Waits(driver);
        this.navPage = new NavPage(driver);
    }

    public void clickButtonSignUp(){
        waits.waitVisibily(navPage.btnSignUp).click();
    }
}
