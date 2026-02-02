package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;


public class activity21 {

    public static void main(String args[]){
        WebDriver driver = new FirefoxDriver();
         driver.get("https://training-support.net/webelements/tabs");
         System.out.println(driver.getTitle());
         driver.findElement(By.xpath("//button[text()='Open A New Tab']")).click();

         String parentHandle = driver.getWindowHandle();
         Set<String> handles = driver.getWindowHandles();
         WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(200));
         wait.until(ExpectedConditions.numberOfWindowsToBe(2));
         	

    for(String handle : handles) {
    if (handle != parentHandle) {
        driver.switchTo().window(handle);
        System.out.println(driver.findElement(By.tagName("h1")).getText());
        System.out.println(driver.findElement(By.tagName("h2")).getText());



    }
}
    }
}