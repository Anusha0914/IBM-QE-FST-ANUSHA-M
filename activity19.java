package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;


public class activity19 {

    public static void main(String args[]){
        WebDriver driver = new FirefoxDriver();
         driver.get("https://training-support.net/webelements/alerts");
         System.out.println(driver.getTitle());
        driver.findElement(By.id("confirmation")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
         System.out.println(driver.findElement(By.id("result")).getText());
        driver.findElement(By.id("confirmation")).click();
        alert.dismiss();
        System.out.println(driver.findElement(By.id("result")).getText());
        driver.quit();
}
}