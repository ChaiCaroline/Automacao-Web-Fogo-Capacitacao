package com.trilha.automacao.asserts;

import com.trilha.automacao.pages.PlaceOrderPage;
import com.trilha.automacao.utils.Waits;
import org.openqa.selenium.WebDriver;

public class BuyAssert {

    private final Waits waits;
    private final PlaceOrderPage placeOrderPage;

    public BuyAssert(WebDriver driver) {
        this.waits = new Waits(driver);
        this.placeOrderPage = new PlaceOrderPage(driver);
    }

    public boolean verifyAlert(String text){
        return waits.waitAlertIsPresent().getText().contains(text);
    }

    public boolean verifyModalFinishBuy(){
        return waits.waitVisibily(placeOrderPage.btnPurchase).isDisplayed();
    }
}
