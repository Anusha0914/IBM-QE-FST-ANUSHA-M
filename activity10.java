package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class activity10 {
    public static void main(String args[]){
        WebDriver driver = new FirefoxDriver();
         driver.get("https://training-support.net/webelements/drag-drop");
         System.out.println(driver.getTitle());

Actions builder = new Actions(driver);
WebElement lb=driver.findElement(By.id("dropzone1"));
WebElement rb=driver.findElement(By.id("dropzone2"));
WebElement ball=driver.findElement(By.id("ball"));
builder.click(ball).pause(3000).dragAndDrop(ball, lb).build().perform();
String a = driver.findElement(By.id("dropzone1")).getText();
if (a.equals("Dropped!")){
    System.out.println("Dropped in zone 1");
    builder.click(ball).pause(3000).dragAndDrop(ball, rb).build().perform();

}


String b= driver.findElement(By.id("dropzone2")).getText();
if(b.equals("Dropped!")){
    System.out.println("Dropped in zone 2");
}


 
    }

     
    
}
