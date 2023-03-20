package com.Sagebrush;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Reservation {
    @Test
    public void orderOnline() {
        System.setProperty("webdriver.chrome.drive", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sagebrushbbq.com/");
        driver.manage().window().maximize();


        WebElement reservationsButton=driver.findElement(By.xpath("/html/body/header/div[1]/div[1]/nav/ul/li[1]/a"));
        reservationsButton.click();
        WebElement bookReservation=driver.findElement(By.xpath("/html/body/div[1]/main/div/center/div/div/button"));
        bookReservation.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement partySizeBox=driver.findElement(By.cssSelector("#sn-reservationSelectorPartySize"));
        partySizeBox.click();
        Select select=new Select(partySizeBox);
        select.selectByVisibleText("3");
    }
}
