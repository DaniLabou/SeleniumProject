package com.pageobjectmodel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.pageobjectmodel.pages.BasePage.BaseTest.BASE_URL;

public class LoginPage extends BasePage {
    final static  String LOGIN_URL= BASE_URL +"login";
    @FindBy (id="username")
    private WebElement usernameImput;
    @FindBy (id="password")
    private WebElement passwordImput;
    @FindBy (css = "#login > button > i")
    private WebElement loginImput;
    public LoginPage(WebDriver driver) {
        //super(driver);
    }

    public void enterUsername(){
        usernameImput.sendKeys("tomsmith");
    }
    public void enterPassoword(){
        passwordImput.sendKeys("SuperSecretPassword!");
    }
    public void setLoginImput(){
        loginImput.click();
    }

}
