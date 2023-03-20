package com.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTest {
        private WebDriver driver;
        @BeforeMethod
        private void setUp() {
            System.setProperty("webdriver.chrome.drive", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/dropdown");
            driver.manage().window().maximize();
        }
            @Test
            public void dropdownTest(){
                WebElement dropdown = driver.findElement(By.id("dropdown"));
                Select select = new Select(dropdown);
                //select.selectByValue("1");

                select.selectByVisibleText("Option 1");



                WebElement firstOption = driver.findElement(By.xpath("//*[@id=\"dropdown\"]/option[2]"));
                Assert.assertTrue(firstOption.isSelected());
            }
            @AfterMethod
            private void tearDown () {
                driver.close();
                System.out.println("Pagina a fost testata si inchisa");


    }
}
