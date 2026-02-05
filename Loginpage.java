package StepDefinitions;

	
import static org.junit.jupiter.api.Assertions.assertEquals;
 
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class Loginpage extends Baseclass{
             
    @Given("user is on the login page")
    public void openLoginPage() throws Throwable {
            driver.get("https://training-support.net/webelements/login-form");
            assertEquals(driver.getTitle(), "Selenium: Login Form");
        }


    @When("the user enters the username and the password")
    public void Entercreds() throws Throwable {
            driver.findElement(By.id("username")).sendKeys("admin");
             driver.findElement(By.id("password")).sendKeys("password");
        }

    @And("clicks the submit button")
    public void clickButton() throws Throwable {
    driver.findElement(By.xpath("//button[text()='Submit']")).click();
    }



    @Then("they get confirmation message and verify")
    public void aboutUsPage() throws Throwable {
		wait.until(ExpectedConditions.titleIs("Login Success!")); 
		assertEquals(driver.findElement(By.tagName("h2")).getText(), "Welcome Back,Admin");

    
}
}
