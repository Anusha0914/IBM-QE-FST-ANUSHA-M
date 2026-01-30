package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class activity15 {
    public static void main(String args[]){
        WebDriver driver = new FirefoxDriver();
         driver.get("https://training-support.net/webelements/dynamic-attributes");
         System.out.println(driver.getTitle());
         driver.findElement(By.xpath("//input[starts-with (@id,'full-name')]")).sendKeys("Anusha");
         driver.findElement(By.xpath("//input[contains(@id,'-email')]")).sendKeys("Anusha0914@ibm.com");
         driver.findElement(By.xpath("//input[contains(@name,'-event-date-')]")).sendKeys("2026-01-30");
         driver.findElement(By.xpath("//textarea[contains(@id,'-additional-details-')]")).sendKeys("Food must be good");
         driver.findElement(By.xpath("//button[text()='Submit']")).click();
         System.out.println(driver.findElement(By.id("action-confirmation")).getText());
        



    driver.quit();
        
    }
}