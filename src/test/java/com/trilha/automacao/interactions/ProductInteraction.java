package com.trilha.automacao.interactions;

import com.trilha.automacao.pages.PlaceOrderPage;
import com.trilha.automacao.pages.ProductPage;
import com.trilha.automacao.utils.Waits;
import net.datafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Locale;

public class ProductInteraction extends ProductPage {

    private WebDriver driver;
    private Waits waits;
    private PlaceOrderPage placeOrderPage;
    private Faker faker;

    public ProductInteraction(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.waits = new Waits(driver);
        this.placeOrderPage = new PlaceOrderPage(driver);
        this.faker = new Faker(new Locale("pt", "BR"));
    }

    public WebElement selecionarProduto(String produto) {
        By xpathExpression = By.xpath("//div[contains(@class, 'card')]//a[contains(text(), '" + produto + "')]");
        waits.waitElement(xpathExpression);
        return driver.findElement(xpathExpression);
    }

    public void addProductCart(){
         waits.waitClick(btnAddCar).click();
    }

    public void acceptAlert(){
        waits.waitAlertIsPresent().accept();
    }

    public void formOrder(String name, String country, String city, String credit, String month, String year){
        if(waits.waitVisibily(placeOrderPage.inputName).isDisplayed()){
            placeOrderPage.inputName.sendKeys(name);
            placeOrderPage.inputCountry.sendKeys(country);
            placeOrderPage.inputCity.sendKeys(city);
            placeOrderPage.inputCard.sendKeys(credit);
            placeOrderPage.inputMonth.sendKeys(month);
            placeOrderPage.inputYear.sendKeys(year);

            placeOrderPage.btnPurchase.click();
        }
    }

    public ArrayList<String> formdados(){

        ArrayList<String> data = new ArrayList();

        data.add(faker.name().fullName());
        data.add(faker.address().country());
        data.add(faker.address().city());
        data.add(faker.expression("#{numerify '########'}"));
        long monthlong = faker.number().numberBetween(1,12);
        data.add(String.valueOf(monthlong));
        long yearlong = faker.number().numberBetween(2025,2035);
        data.add(String.valueOf(yearlong));

        return data;
    }
}
