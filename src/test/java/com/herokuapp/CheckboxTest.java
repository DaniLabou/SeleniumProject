package com.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxTest {
       private WebDriver driver;
        @BeforeMethod
        private void setUp() {
            System.setProperty("webdriver.chrome.drive", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/checkboxes");
            driver.manage().window().maximize();
        }
            @Test
            public void checkboxTest(){
                WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));

                if (!checkbox2.isSelected()){
                    checkbox2.click();
                }

                Assert.assertTrue(checkbox2.isSelected(),"Checkbox selection is not working");
            }

        @AfterMethod
        private void tearDown() {
            driver.close();
            System.out.println("Pagina a fost testata si inchisa");
        }

}
