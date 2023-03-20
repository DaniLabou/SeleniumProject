//package com.demoqa;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//
//public class Demoqa {
//    private WebDriver driver;
//    @BeforeMethod
//    private void setUp() {
//        System.setProperty("webdriver.chrome.drive", "src/main/resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demoqa.com/automation-practice-form");
//        driver.manage().window().maximize();
//    }
//    @Test
//    public void register(){
//        //enter firstname
//        WebElement firstnameInput = driver.findElement(By.id("firstName"));
//        firstnameInput.sendKeys("Ion");
//
//        //enter lastname
//        WebElement lastnameInput = driver.findElement(By.id("lastName"));
//        lastnameInput.sendKeys("Popescu");
//
//        //enter email
//        WebElement emailInput = driver.findElement(By.id("userEmail"));
//        emailInput.sendKeys("ion.popescu@test.com");
//
//        //select gender
//        WebElement maleRadioButton = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
//        maleRadioButton.click();
//
//        //add phone number
//        WebElement phoneNumberInput = driver.findElement(By.cssSelector("input#userNumber"));
//        phoneNumberInput.sendKeys("1234567890");
//
//        //enter date of birth
//        WebElement dateOfBirthInput = driver.findElement(By.id("dateOfBirthInput"));
//        dateOfBirthInput.click();
//
//        WebElement daySelector = driver.findElement(By.cssSelector("#dateOfBirth > div.react-datepicker__tab-loop > div.react-datepicker-popper > div > div > div.react-datepicker__month-container > div.react-datepicker__month > div:nth-child(4) > div.react-datepicker__day.react-datepicker__day--021"));
//        daySelector.click();
//
//        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
//        WebElement subjectInput = wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#subjectsInput")));
//        subjectInput.click();
//        subjectInput.sendKeys("Maths");
//        subjectInput.sendKeys(Keys.ENTER);
//
//        //adding address
//        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        WebElement addressInput = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"currentAddress\"]")));
//        addressInput.click();
//        addressInput.sendKeys("123 Test Street");
//
//        //after adding the address, we move on to other elements using TAB and enter text using a sequence of sendKeys
//        addressInput.sendKeys(Keys.TAB,"ncr",Keys.ENTER,Keys.TAB,"delhi", Keys.ENTER,Keys.TAB,Keys.ENTER);
//
//        WebElement submitButton = wait2.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
//        submitButton.getText();
//
//        //verification of the success modal display & content
//        WebElement modal = driver.findElement(By.id("example-modal-sizes-title-lg"));
//        Assert.assertTrue(modal.isDisplayed());
//        Assert.assertTrue(modal.getText().contains("Thanks for submitting the form"));
//
//        WebElement closeModal = driver.findElement(By.id("closeLargeModal"));
//        Assert.assertTrue(closeModal.isDisplayed());
//
//        //        wait for 2 seconds then close the modal
//        waitFor(2);
//        closeModal.click();
//    }
//    @AfterMethod
//    private void tearDown(){
////        wait for 2 seconds then close the page
//        waitFor(2);
//        driver.close();
//    }
//
//    private void waitFor(int seconds){
//        try {
//            Thread.sleep(seconds*1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//}
