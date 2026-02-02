package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;



public class activity17 {

    public static void main(String args[]){
        WebDriver driver = new FirefoxDriver();
         driver.get("https://training-support.net/webelements/selects");
         System.out.println(driver.getTitle());

WebElement A = driver.findElement(By.cssSelector("select.h-80"));
WebElement B= driver.findElement(By.tagName("select"));
Select select = new Select(A);
//List<WebElement> options = select.getOptions();
select.selectByValue("html");
select.selectByValue("nodejs");
select.deselectByValue("rust");
List<WebElement> allSelected = select.getAllSelectedOptions();
Select s=new Select(B);
List<WebElement> h = s.getOptions();
s.selectByIndex(4);
s.selectByIndex(5);
s.selectByIndex(6);
s.deselectByIndex(5);
List<WebElement> v = s.getAllSelectedOptions();
driver.quit();
    }
}