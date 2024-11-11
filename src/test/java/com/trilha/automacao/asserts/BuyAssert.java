package com.trilha.automacao.asserts;

import com.trilha.automacao.utils.Waits;
import org.openqa.selenium.WebDriver;

public class BuyAssert {

    private final Waits waits;

    public BuyAssert(WebDriver driver) {
        this.waits = new Waits(driver);
    }

    public boolean verifyAlert(String text){
        return waits.waitAlertIsPresent().getText().contains(text);
    }
}
