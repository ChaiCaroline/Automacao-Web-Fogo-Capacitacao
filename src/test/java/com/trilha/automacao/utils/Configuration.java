package com.trilha.automacao.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Configuration {

    protected static WebDriver driver;

    public static WebDriver startDriver(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        return driver;
    }

    public static WebDriver getDriver(){
        if(driver == null){
            driver = startDriver();
        }
        return driver;
    }

    public static void acessURL(String url){
        if(driver == null){
            System.out.println("Driver não iniciado");
        }
         driver.get(url);
    }

    public static void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}