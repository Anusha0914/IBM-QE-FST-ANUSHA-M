package selenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class activity11 {

    public static void main(String args[]){
        WebDriver driver = new FirefoxDriver();
         driver.get("https://training-support.net/webelements/dynamic-controls");
         System.out.println(driver.getTitle());


driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(50));
wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("checkbox")));
driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
WebDriverWait w = new WebDriverWait (driver, Duration.ofSeconds(50));
w.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox")));
driver.findElement(By.id("checkbox")).click();
driver.quit();


    }

    
}
