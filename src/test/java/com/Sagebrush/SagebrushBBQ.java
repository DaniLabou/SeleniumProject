package com.Sagebrush;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SagebrushBBQ {
    @Test
    public void menus(){
        System.setProperty("webdriver.chrome.drive","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sagebrushbbq.com/");
        driver.manage().window().maximize();

        WebElement menuButton = driver.findElement(By.xpath("/html/body/div[1]/main/section[2]/p[2]/a"));
        menuButton.click();

        /*WebElement banqetsButton = driver.findElement(By.xpath("//*[@id=\"tab-banquets\"]"));
        banqetsButton.click();*/

        WebElement banqetsButton = driver.findElement(By.cssSelector("#tab-banquets"));
        banqetsButton.click();

        String landingurl = "https://www.sagebrushbbq.com/menus/";
        Assert.assertEquals(landingurl,"https://www.sagebrushbbq.com/menus/");

    }
}
