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
        super(driver);
        this.driver = driver;
        this.waits = new Waits(driver);
        this.navPage = new NavPage(driver);
    }

    public void clickButtonSignUp(String button){

        if(button.equals("menu")){
        waits.waitVisibily(navPage.btnSignUp).click();
        }else if(button.equals("registro")){
            btnSignUp.click();
        }
    }

    public void RegisterUser(String username, String password){
        waits.waitVisibily(inputLogin).sendKeys(username);
        waits.waitVisibily(inputSenha).sendKeys(password);
    }
}
