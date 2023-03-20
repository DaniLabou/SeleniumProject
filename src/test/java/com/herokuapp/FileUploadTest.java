package com.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest {
        private WebDriver driver;
        @BeforeMethod
        private void setUp() {
            System.setProperty("webdriver.chrome.drive", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/upload");
            driver.manage().window().maximize();
    }
    @Test
    private void uploadTest(){
        //selectam fisier
        WebElement chooseFile= driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("C:\\Users\\danyl\\IdeaProjects\\SeleniumProject\\src\\test\\resources\\20221216_205122.heic");
        //apasam upload
        WebElement uploadButton= driver.findElement(By.id("file-submit"));
        uploadButton.click();

        //verificam mesajul de succes
       /* WebElement mesaj = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"));


        String expectetResult = "File Uploaded!";
        //Assert.assertEquals(mesaj.getText(),expectetResult);
        Assert.assertTrue(mesaj.getText().contains(expectetResult)); */
    }

    @AfterMethod
    private void tearDown() {
        driver.close();
        System.out.println("Pagina a fost testata si inchisa");
    }
}
