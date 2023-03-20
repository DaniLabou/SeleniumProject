package com.pageobjectmodel.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected static WebDriver driver;


    @BeforeMethod
    private void setUp() {
        System.setProperty("webdriver.chrome.drive","src/main/resources/chromedriver.exe");
        //driver = new ChromeDriver();
        //driver.get("https://the-internet.herokuapp.com/login");
        //driver.manage().window().maximize();
    }
    @AfterMethod
    private void tearDown() {
        driver.manage().deleteAllCookies();
        driver.close();

    }


}
