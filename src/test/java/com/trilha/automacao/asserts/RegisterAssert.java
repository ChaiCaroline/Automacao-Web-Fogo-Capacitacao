package com.trilha.automacao.asserts;

import com.trilha.automacao.utils.Waits;
import org.openqa.selenium.WebDriver;

public class RegisterAssert {

    private final Waits waits;

    public RegisterAssert(WebDriver driver) {
        this.waits = new Waits(driver);
    }

    public boolean verifyAlertRegister(String text){
        return waits.waitAlertIsPresent().getText().equals(text);
    }
}
