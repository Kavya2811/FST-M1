package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

import java.time.Duration;

public class Activity6 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        //wait = new WebDriverWait(driver, 10);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Open browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][] { { "admin", "password" }};
    }

    @Test (dataProvider = "Authentication")

    //@Parameters({"username", "password"})
    public void loginTestCase(String username, String password) {
        //Find username and pasword fields
       WebElement usernameField = driver.findElement(By.id("username"));
       WebElement passwordField = driver.findElement(By.id("password"));


        //Enter values
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
//        username.sendKeys("admin");
//        password.sendKeys("password");

        //Click Log in
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        //Assert Message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin");
    }

    @AfterClass
    public void afterClass() {
        //Close browser
        driver.close();
    }
}
