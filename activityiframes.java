package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class activityiframes {

    public static void main(String args[]){
        WebDriver driver = new FirefoxDriver();
         driver.get("https://v1.training-support.net/selenium/nested-iframes");
         System.out.println(driver.getTitle());
driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        System.out.println(driver.findElement(By.cssSelector("div.content")).getText());
        driver.switchTo().parentFrame();
        driver.switchTo().frame(1);
        System.out.println(driver.findElement(By.cssSelector("div.content")).getText());
        driver.switchTo().defaultContent();


    
            }
        }