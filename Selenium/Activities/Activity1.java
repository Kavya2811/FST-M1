package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://www.training-support.net");
        //Thread.sleep(1000);

        //Perform testing and assertions

       // WebElement title=driver.findElement(By.xpath("//h1[text()=\"Training Support\"]"));
        //System.out.println(title);
//assert.assertEquals()
        //Close the browser
        driver.close();
    }
}
