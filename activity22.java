package selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class activity22 {

    public static void main(String args[]){
        WebDriver driver = new FirefoxDriver();
         driver.get("https://training-support.net/webelements/popups");
         System.out.println(driver.getTitle());

             (driver.findElement(By.id("launcher"))).click();
             WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(5));
         wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("username"))));
         driver.findElement(By.id("username")).sendKeys("admin");
         driver.findElement(By.id("password")).sendKeys("password");
         driver.findElement(By.xpath("//button [text()='Submit']")).click();
         System.out.println(driver.findElement(By.cssSelector("h1.text-6xl")).getText());

    
           }
        }
             
    



