package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class LMSTestSteps {
    WebDriver driver;
   WebDriverWait wait;


    @Given("User is on alchemy Home Page")
    public void user_is_on_alchemy_home_page() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }
    //**********testcase1**********
    @When("user is able to view the title and validate that title is as expected")
    public void user_is_able_to_view_the_title_and_validate_that_title_is_as_expected() {
        String title=driver.getTitle();
        System.out.println("Title of the page:"+title);
        Assert.assertEquals("Alchemy LMS – An LMS Application",title);
        System.out.println("Title of the page is matched");
    }
    @Then("Close the browser")
    public void close_the_browser() {
       driver.quit();
    }

    //*************testcase2***************
    @When("user is able to view the heading and validate that heading is as expected")
    public void user_is_able_to_view_the_heading_and_validate_that_heading_is_as_expected() {
        WebElement heading=driver.findElement(By.xpath("//*[@class='uagb-ifb-title' and text()=' Learn from Industry Experts ']"));
        String headtext=heading.getText();
        System.out.println("Heading of the page:"+headtext);
        Assert.assertEquals("Learn from Industry Experts",headtext);
        System.out.println("Heading of the page is matched");
    }
    //**********************testcase3*****************

    @When("user is able to view the title and validate that title is as expected in training info section")
    public void user_is_able_to_view_the_title_and_validate_that_title_is_as_expected_in_training_info_section() throws InterruptedException {
        WebElement heading=driver.findElement(By.xpath("//*[@class='uagb-ifb-title' and text()=' Learn from Industry Experts ']"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.visibilityOf(heading));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        WebElement actionheading=driver.findElement(By.xpath("//*[@class='uagb-ifb-title' and text()=' Actionable Training ']"));
        wait.until(ExpectedConditions.visibilityOf(actionheading));
        String Actiontext=actionheading.getText();
        System.out.println("Heading of the page:"+Actiontext);
        Assert.assertEquals("Actionable Training",Actiontext);
        System.out.println("Action Training title of the page is matched");
    }
//**********************testcase4******************
@When("user is able to view the title and validate that title is as expected in second most popular course in alchemy page")
public void user_is_able_to_view_the_title_and_validate_that_title_is_as_expected_in_second_most_popular_course_in_alchemy_page() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,1000)", "");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    WebElement secondpopulartitle=driver.findElement(By.xpath("//*[@class='entry-title' and text()='Email Marketing Strategies']"));
    String secondpopulartext=secondpopulartitle.getText();
    System.out.println("Heading of the page:"+secondpopulartext);
    Assert.assertEquals("Email Marketing Strategies",secondpopulartext);
    System.out.println("Second most popular Course title of the page is matched");
}
//*********************testcase5*******************
@When("user is able to click on My account and validate the title")
public void user_is_able_to_click_on_my_account_and_validate_the_title() throws InterruptedException {
    driver.findElement(By.xpath("//*[@id='menu-item-1507']")).click();
    WebElement myaccounttitle=driver.findElement(By.xpath("//*[@class='uagb-ifb-title' and text()='  My Account    ']"));
    String myaccounttext=myaccounttitle.getText();
    System.out.println("Title of my account page:"+myaccounttext);
    Assert.assertEquals("My Account",myaccounttext);
    System.out.println("My Account title of the page is matched");
}
//**************testcase6*************************
@When("user is able to click on My account and login using username and password")
public void user_is_able_to_click_on_my_account_and_login_using_username_and_password() throws InterruptedException {
    driver.findElement(By.xpath("//*[@id='menu-item-1507']")).click();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    WebElement myaccounttitle=driver.findElement(By.xpath("//*[@class='uagb-ifb-title' and text()='  My Account    ']"));
    String myaccounttext=myaccounttitle.getText();
    System.out.println("Title of my account page:"+myaccounttext);
    Assert.assertEquals("My Account",myaccounttext);
    System.out.println("My Account title of the page is matched");
    driver.findElement(By.xpath("//*[@class='ld-login ld-login ld-login-text ld-login-button ld-button']")).click();
    driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("root");
    driver.findElement(By.xpath("//*[@id='user_pass']")).sendKeys(" pa$$w0rd");
    driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
    Thread.sleep(500);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    WebElement myaccount=driver.findElement(By.xpath("//*[@class='ld-profile-avatar']"));
    if(myaccount.isDisplayed()){
        System.out.println("Loggedin Successfully");
    }
}
//****************testcase7**************************
@When("user is able to click on All courses and read the number of courses")
public void user_is_able_to_click_on_all_courses_and_read_the_number_of_courses() throws InterruptedException {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
    driver.findElement(By.xpath("//*[@id='menu-item-1508']")).click();
    WebElement allcourse=driver.findElement(By.xpath("//*[@class='uagb-ifb-title' and text()='  All Courses    ']"));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
    Thread.sleep(500);
    if(allcourse.isDisplayed()){
        System.out.println("All course page displayed Successfully");
        List<WebElement> numberofcourses = driver.findElements(By.xpath("//*[@class='ld_course_grid col-sm-8 col-md-4 ']"));
        System.out.println("Number of Courses ="+numberofcourses.size());
    }

}
//*********************testcase8************************
    @When("user is able to click on Contact admin and leave a message to admin")
    public void user_is_able_to_click_on_contact_admin_and_leave_a_message_to_admin() throws InterruptedException {
        driver.findElement(By.xpath("//*[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-1506']")).click();
        driver.findElement(By.xpath("//*[@id='wpforms-8-field_0']")).sendKeys("Kavya");
        driver.findElement(By.xpath("//*[@id='wpforms-8-field_1']")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//*[@id='wpforms-8-field_2']")).sendKeys("Great opportunity for new learners");
        driver.findElement(By.xpath("//*[@id='wpforms-submit-8']")).click();
        Thread.sleep(500);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
        WebElement confrimtext=driver.findElement(By.xpath("//*[@id='wpforms-confirmation-8']"));
        String confirmmessage=confrimtext.getText();
        if(confrimtext.isDisplayed()) {
            System.out.println("Actual Confirm message: " + confirmmessage);
            Assert.assertEquals("Thanks for contacting us! We will be in touch with you shortly.",confirmmessage);
        }
    }
    @When("user is able to click on all courses,select a course and validate the navigation of it")
    public void user_is_able_to_click_on_all_courses_select_a_course_and_validate_the_navigation_of_it() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.xpath("//*[@id='menu-item-1507']")).click();
        WebElement myaccounttitle=driver.findElement(By.xpath("//*[@class='uagb-ifb-title' and text()='  My Account    ']"));
        String myaccounttext=myaccounttitle.getText();
        System.out.println("Title of my account page:"+myaccounttext);
        Assert.assertEquals("My Account",myaccounttext);
        System.out.println("My Account title of the page is matched");
        driver.findElement(By.xpath("//*[@class='ld-login ld-login ld-login-text ld-login-button ld-button']")).click();
        driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("root");
        driver.findElement(By.xpath("//*[@id='user_pass']")).sendKeys(" pa$$w0rd");
        driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
        driver.findElement(By.xpath("//*[@id='menu-item-1508']")).click();
        driver.findElement(By.xpath("//h3[text()='Social Media Marketing']//following-sibling::p[@class='ld_course_grid_button']/a")).click();
        driver.findElement(By.xpath("//a//div[@class='ld-item-title']//span[text()='3 Topics ']")).click();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
        WebElement coursetext=driver.findElement(By.xpath("//h1[text()='Developing Strategy']"));
        if(coursetext.isDisplayed()){
            String Developtitle= driver.getTitle();
            System.out.println("Actual Text="+Developtitle);
            Assert.assertEquals("Developing Strategy – Alchemy LMS",Developtitle);
            System.out.println("Display Strategy course page is displayed");
        }
    }
}
