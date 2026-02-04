package testng;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class testng9 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        driver.get("https://training-support.net/webelements/alerts");
    }
    
    @BeforeClass
    public void beforeMethod() {
        Reporter.log("Test Case Setup started |");
        driver.switchTo().defaultContent();
    }
 
    @Test(priority = 1)
    public void simpleAlertTestCase() {
        Reporter.log("simpleAlertTestCase() started");
        driver.findElement(By.id("simple")).click();
        Reporter.log("Simple Alert opened");
        Alert simpleAlert = driver.switchTo().alert();
        Reporter.log("Switched foucs to alert");
        String alertText = simpleAlert.getText();
        Reporter.log("Alert text is: " + alertText);
        Assert.assertEquals("You've just triggered a simple alert!", alertText);
        simpleAlert.accept();
        Reporter.log("Alert closed"); 
        Reporter.log("Test case ended |");
    }
 
    @Test(priority = 2)
    public void confirmAlertTestCase() {
        Reporter.log("confirmAlertTestCase() started |");
        driver.findElement(By.id("confirmation")).click();
        Reporter.log("Confirm Alert opened |");
        Alert confirmAlert = driver.switchTo().alert();
        Reporter.log("Switched foucs to alert |");
        String alertText = confirmAlert.getText();
        Reporter.log("Alert text is: " + alertText + " |");
        Assert.assertEquals("You've just triggered a confirmation alert!", alertText);
        confirmAlert.accept();
        Reporter.log("Alert closed |"); 
        Reporter.log("Test case ended |");
    }
 
    @Test(priority = 3)
    public void promptAlertTestCase() {
        Reporter.log("promptAlertTestCase() started |");
        driver.findElement(By.id("prompt")).click();
        Reporter.log("Prompt Alert opened");
        Alert promptAlert = driver.switchTo().alert();
        Reporter.log("Switched focus to laert");
        String alertText = promptAlert.getText();
        Reporter.log("Alert text is: " + alertText + " |");
        Assert.assertEquals("I'm a Prompt! Type something into me!", alertText);
        promptAlert.sendKeys("Awesome!");
        Reporter.log("Text entered in prompt alert |");
        promptAlert.accept();
        Reporter.log("Alert closed");
        Reporter.log("Test case done");
    }
 
    @AfterClass
    public void tearDown() {
        Reporter.log("Closing Test");
        driver.quit();
    }
}
