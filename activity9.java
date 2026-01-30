package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class activity9{

    public static void main(String args[])
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/keyboard-events");
        System.out.println(driver.getTitle());

Actions builder = new Actions(driver);
builder.sendKeys("Dona is an idiot").build().perform();
System.out.println(driver.findElement(By.cssSelector("h1.mt-3")).getText());







    
}

}












