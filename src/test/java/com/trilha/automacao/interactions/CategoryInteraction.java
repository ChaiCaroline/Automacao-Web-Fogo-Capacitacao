package com.trilha.automacao.interactions;

import com.trilha.automacao.pages.CategoryPage;
import com.trilha.automacao.utils.Waits;
import org.openqa.selenium.WebDriver;

public class CategoryInteraction extends CategoryPage {

    private Waits waits;

    public CategoryInteraction(WebDriver driver) {
        super(driver);
        this.waits = new Waits(driver);
    }

    public void clickButtonCategory(String categoria){
        switch (categoria){
            case "phones":
                waits.waitClick(categoryPhone).click();
            case "laptops":
                waits.waitClick(categoryLaptop).click();
            case "monitors":
                waits.waitClick(categoryMonitors).click();
        }
    }
}
