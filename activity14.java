package selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class activity14 {
    public static void main(String args[]){
        WebDriver driver = new FirefoxDriver();
         driver.get(" https://training-support.net/webelements/tables");
         System.out.println(driver.getTitle());
List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
System.out.println(cols.size());
List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
System.out.println(rows.size());
WebElement cellValue = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
System.out.println(cellValue.getText());
driver.findElement(By.xpath("//table/thead/tr/th[5]")).click();
WebElement s = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
System.out.println(s.getText());
driver.quit();

        
    
}
}