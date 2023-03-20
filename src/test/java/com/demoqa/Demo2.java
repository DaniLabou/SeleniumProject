package com.demoqa;

import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Demo2 {
    @Test(testName = "register")
    public void demo() {
        System.setProperty("webdriver.chrome.drive", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Dani");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.click();
        lastName.sendKeys("Labou");

        WebElement emailBox = driver.findElement(By.id("userEmail"));
        emailBox.click();
        emailBox.sendKeys("danylabou116@gmail.com");

        WebElement genderButton = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
        genderButton.click();

        WebElement phoneNumber = driver.findElement(By.id("userNumber"));
        phoneNumber.click();
        phoneNumber.sendKeys("0748804036");

        WebElement birthDate = driver.findElement(By.id("dateOfBirthInput"));
        birthDate.click();
        WebElement birthDateMonth = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[12]"));
        birthDateMonth.click();
        WebElement birthDateYear = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[97]"));
        birthDateYear.click();
        WebElement birthDateDay = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[3]"));
        birthDateDay.click();

        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(3));
        WebElement subjectInput = wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#subjectsInput")));
        subjectInput.click();
        subjectInput.sendKeys("Maths");
        subjectInput.sendKeys(Keys.ENTER);
        //WebElement computerScience = driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]/div[1]/div[1]"));

        WebElement hobiesSport = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
        hobiesSport.click();
        WebElement hobiesMusic = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label"));
        hobiesMusic.click();

        WebElement chooseFile= driver.findElement(By.id("uploadPicture"));
        chooseFile.sendKeys("C:\\Users\\danyl\\IdeaProjects\\SeleniumProject\\src\\main\\resources\\Egypt.heic");
        //chooseFile.sendKeys(Keys.TAB);

        WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
        //WebElement curentAdress = driver.findElement(By.id("currentAddress"));
        WebElement curentAdress = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"currentAddress\"]")));
        curentAdress.click();
        curentAdress.sendKeys("Pandurilor, nr.10");
        //curentAdress.sendKeys(Keys.TAB,Keys.ENTER);
        curentAdress.sendKeys(Keys.TAB,"ncr",Keys.ENTER,Keys.TAB,"delhi",Keys.ENTER,Keys.TAB,Keys.ENTER);

        /*WebElement stateButton = wait2.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#state > div > div.css-1hwfws3 > div.css-1wa3eu0-placeholder")));
        stateButton.click();
        stateButton.sendKeys("ncr");
        stateButton.sendKeys(Keys.ENTER);

        WebDriverWait wait3 =new WebDriverWait(driver,Duration.ofSeconds(10));

        curentAdress.sendKeys(Keys.TAB,"ncr",Keys.ENTER,Keys.TAB,"delhi",Keys.ENTER,Keys.TAB,Keys.ENTER);

        //WebElement submitButton = driver.findElement(By.id("submit"));
        //submitButton.click();
        WebElement submitButton = wait3.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
        submitButton.getText();

        WebElement endPage = driver.findElement(By.id("example-modal-sizes-title-lg"));
        Assert.assertTrue(endPage.isDisplayed());
        Assert.assertTrue(endPage.getText().contains("Thanks for submitting the form"));

        WebElement closeEndPage=driver.findElement(By.id("closeLargeModal"));
        Assert.assertTrue(closeEndPage.isDisplayed());
        closeEndPage.click();

        /*WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();*/


        //Assert.assertTrue(firstName.isSelected(),"First Name box is selected");

    }
    /*private void waitFor(int secounds){
        Thread.sleep(2);
        driver.close;  }*/
}