package com.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/*public class NegativLoginTest {
@Test(priority = 2,groups = {"regression"})
    public void logIn(){
    System.setProperty("webdriver.chrome.drive","src/main/resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/login");
    driver.manage().window().maximize();

    WebElement username = driver.findElement(By.id("username"));
    username.sendKeys("Tomsmith");

    WebElement pasword = driver.findElement(By.name("password"));
    pasword.sendKeys("SuperSecretPassword!");

    WebElement loginButton = driver.findElement(By.className("radius"));
    loginButton.click();

    String landingurl = "https://the-internet.herokuapp.com/login";
    Assert.assertEquals(landingurl,"https://the-internet.herokuapp.com/login");

    WebElement alert = driver.findElement(By.id("flash"));
    String alertText = "Your username is invalid!";
    Assert.assertTrue(alert.isDisplayed());
    Assert.assertTrue(alert.getText().contains(alertText));

    driver.close();
    System.out.println("Pagina a fost testata si inchisa");
}

}*/
