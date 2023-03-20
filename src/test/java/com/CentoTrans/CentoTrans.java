package com.CentoTrans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CentoTrans {
    @Test
    public void curse(){
        System.setProperty("webdriver.chrome.drive","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.cento.ro/");
        driver.manage().window().maximize();

        /*WebElement curseButton = driver.findElement(By.xpath("/html/body/div/header/div[2]/nav/ul/li[2]/a"));
        curseButton.click();
        WebElement plecareButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/select"));
        plecareButton.click();
        WebElement sisireButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/select"));
        sisireButton.click();*/

        WebElement plecareButton = driver.findElement(By.id("loc_plecare"));
        plecareButton.click();
        WebElement orasPlecareButton = driver.findElement(By.cssSelector("#loc_plecare > option:nth-child(34)"));
        orasPlecareButton.click();

        WebElement sosireButton = driver.findElement(By.id("loc_sosire"));
        sosireButton.click();
        WebElement orasSosireButton = driver.findElement(By.cssSelector("#loc_sosire > option:nth-child(26)"));
        orasSosireButton.click();

        WebElement cautaButton = driver.findElement(By.cssSelector("#searchgo > span.txt"));
        cautaButton.click();

        String landingurl = "http://www.cento.ro/rezultat?plecare=15794&sosire=15784&zi";
        Assert.assertEquals(landingurl,"http://www.cento.ro/rezultat?plecare=15794&sosire=15784&zi");




    }

}
