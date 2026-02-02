package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;

public class activity18 {

    public static void main(String args[]){
        WebDriver driver = new FirefoxDriver();
         driver.get("https://training-support.net/webelements/alerts");
         System.out.println(driver.getTitle());
        driver.findElement(By.id("simple")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();


}
}