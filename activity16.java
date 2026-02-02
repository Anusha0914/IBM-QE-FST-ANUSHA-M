package selenium;

//import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;



public class activity16 {

    public static void main(String args[]){
        WebDriver driver = new FirefoxDriver();
         driver.get("https://training-support.net/webelements/selects");
         System.out.println(driver.getTitle());

WebElement dropdown = driver.findElement(By.tagName("select"));
Select select = new Select(dropdown);
List<WebElement> options = select.getOptions();
select.selectByValue("four");
select.selectByContainsVisibleText("Two");
select.selectByIndex(3);

driver.quit();
    }
}