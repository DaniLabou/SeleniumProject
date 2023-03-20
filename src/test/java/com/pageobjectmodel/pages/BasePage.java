package com.pageobjectmodel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class BasePage {
    public class BaseTest {
        protected WebDriver driver;
        final static String BASE_URL = "https://the-internet.herokuapp.com/";


        public BaseTest(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }
    }
}
