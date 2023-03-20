package com.Sagebrush;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CateringOrder {
    @Test
    public void orderOnline() {
        System.setProperty("webdriver.chrome.drive", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sagebrushbbq.com/");
        driver.manage().window().maximize();

        WebElement cateringButton = driver.findElement(By.xpath("/html/body/header/div[1]/div[1]/nav/ul/li[5]/a"));
        cateringButton.click();
        WebElement inquireNowButton = driver.findElement(By.xpath("//*[@id=\"intro\"]/button"));
        inquireNowButton.click();
        WebElement emailBox = driver.findElement(By.id("104218"));
        emailBox.click();
        emailBox.sendKeys("danylabou116@gmail.com");
        WebElement firstName = driver.findElement(By.id("104219"));
        firstName.sendKeys("Dani");
        WebElement lastName = driver.findElement(By.id("104220"));
        lastName.click();
        lastName.sendKeys("Labou");
        WebElement phoneNumber = driver.findElement(By.id("104221"));
        phoneNumber.click();
        phoneNumber.sendKeys("9704731169");
        WebElement companyName = driver.findElement(By.id("104222"));
        companyName.click();
        companyName.sendKeys("Sagebrush Tests");
        WebElement adress = driver.findElement(By.id("502475"));
        adress.click();
        adress.sendKeys("1101 Grand Ave");
        WebElement city= driver.findElement(By.id("502477"));
        city.click();
        city.sendKeys("Grand Lake");
        WebElement state = driver.findElement(By.id("502478"));
        state.click();
        state.sendKeys("Colorado");
        WebElement zipCode = driver.findElement(By.id("502479"));
        zipCode.click();
        zipCode.sendKeys("80447");
        WebElement eventDate=driver.findElement(By.id("104223"));
        eventDate.click();
        eventDate.sendKeys("03/30/2023");
//        WebElement mounth = driver.findElement(By.cssSelector("#popup-catering-form > form > div.form-ui > div:nth-child(6) > label:nth-child(2) > div > div > div > div > div > div > div.DayPicker_focusRegion.DayPicker_focusRegion_1 > div.DayPickerNavigation_container.DayPickerNavigation_container_1.DayPickerNavigation_container__horizontal.DayPickerNavigation_container__horizontal_2 > button.DayPickerNavigation_button.DayPickerNavigation_button_1.DayPickerNavigation_button__horizontal.DayPickerNavigation_button__horizontal_2.DayPickerNavigation_rightButton__horizontal.DayPickerNavigation_rightButton__horizontal_3 > svg"));
//        mounth.click();
//        WebElement day = driver.findElement(By.xpath("//*[@id=\"popup-catering-form\"]/form/div[4]/div[5]/label[2]/div/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[5]/td[5]"));
//        day.click();
//        day.sendKeys("03/30/2023");
        WebElement startTime=driver.findElement(By.id("104224"));
        startTime.click();
        Select select = new Select(startTime);
        select.selectByVisibleText("7:00 PM");
        WebElement endTime=driver.findElement(By.id("502480"));
        Select select1=new Select(endTime);
        select1.selectByVisibleText("9:00 PM");
        WebElement tipeOfEvent=driver.findElement(By.id("104225"));
        Select select2=new Select(tipeOfEvent);
        select2.selectByValue("Graduation");
        WebElement numberOfPeople=driver.findElement(By.id("104226"));
//        Select select3=new Select(numberOfPeople);
//        select3.selectByVisibleText("20");
        numberOfPeople.sendKeys("20");
        WebElement aditionalInformation=driver.findElement(By.id("104227"));
        aditionalInformation.sendKeys("This is a test. Sorry and thank you!");
        /*WebElement submitButton=driver.findElement(By.id("#popup-catering-form > form > div.form-actions > button"));
        submitButton.click();*/
    }
}
