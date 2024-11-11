package com.trilha.automacao.interactions;

import com.trilha.automacao.pages.NavPage;
import com.trilha.automacao.utils.Waits;
import org.openqa.selenium.WebDriver;

public class NavegationInteraction extends NavPage {

    public NavegationInteraction(WebDriver driver) {
        super(driver);
    }

    public void clickButtonNav(String button) {
        switch (button) {
            case "home":
                btnHome.click();
                break;
            case "contact":
                btnContact.click();
                break;
            case "about":
                btnAbout.click();
                break;
            case "cart":
                btnCart.click();
                break;
            case "login":
                btnLogIn.click();
                break;
            case "sign":
                btnSignUp.click();
                break;
            default:
                System.out.println("Não foi encontrado o botão");
        }
    }
}
