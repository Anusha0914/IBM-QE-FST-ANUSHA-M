package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity5 {

    public static void main(String args[]){
        WebDriver driver = new FirefoxDriver();
         driver.get("https://training-support.net/webelements/dynamic-controls");
         System.out.println(driver.getTitle());
         driver.findElement(By.name("checkbox")).isDisplayed();
         driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
         System.out.println(driver.findElement(By.name("checkbox")).isDisplayed());
         driver.quit();


    }
    
}



