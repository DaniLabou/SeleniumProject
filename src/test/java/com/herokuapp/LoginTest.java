package com.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;
    @BeforeMethod
    private void setUp() {
        System.setProperty("webdriver.chrome.drive","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();
    }
    @Parameters({ "user","password" })
    @Test(priority = 1,groups = {"smoke","regression"})
    public void positiveLogin(String user, String password){


        //2. Introducem username si parola
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys(user);

        //ca sa vedem intr.o scurta pauza
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement paswordElement = driver.findElement(By.name("password"));
        paswordElement.sendKeys(password);

        //3. Apasam login
        //WebElement loginButton = driver.findElement(By.className("radius"));
        //WebElement loginButton = driver.findElement(By.xpath(\"radius\"));
        //WebElement loginButton = driver.findElement(By.cssSelector("#login > button > i"));

        //implicit wait (o folosim cand asteptam incarcarea elementului in pagina)
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //asteapta pana cand elementul este clikable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginButton= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#login > button > i")));
        loginButton.click();

        //4. Verificare
        String landingurl = "https://the-internet.herokuapp.com/secure";
        Assert.assertEquals(landingurl,"https://the-internet.herokuapp.com/secure");

        WebElement logoutButton = driver.findElement(By.linkText("Logout"));
        Assert.assertTrue(logoutButton.isDisplayed());

        WebElement alert = driver.findElement(By.id("flash"));
        String alertText = "You logged into a secure area!";
        Assert.assertTrue(alert.isDisplayed());
        Assert.assertTrue(alert.getText().contains(alertText));


    }
    @Test(priority = 2,groups = {"regression"})
    public void negativeLogIn() {
        /*System.setProperty("webdriver.chrome.drive", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();*/

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("Tomsmith");

        WebElement pasword = driver.findElement(By.name("password"));
        pasword.sendKeys("SuperSecretPassword!");

        WebElement loginButton = driver.findElement(By.className("radius"));
        loginButton.click();

        String landingurl = "https://the-internet.herokuapp.com/login";
        Assert.assertEquals(landingurl, "https://the-internet.herokuapp.com/login");

        WebElement alert = driver.findElement(By.id("flash"));
        String alertText = "Your username is invalid!";
        Assert.assertTrue(alert.isDisplayed());
        Assert.assertTrue(alert.getText().contains(alertText));
    }

    @AfterMethod
    private void tearDown() {
        driver.close();
        System.out.println("Pagina a fost testata si inchisa");
    }
}
