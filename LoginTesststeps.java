package StepDefinitions;

	
import static org.junit.jupiter.api.Assertions.assertEquals;
 
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class LoginTesststeps extends Baseclass{
             
    @Given("user is on the user login page")
    public void openLoginPage() throws Throwable {
            driver.get("https://training-support.net/webelements/login-form");
            assertEquals(driver.getTitle(), "Selenium: Login Form");
        }


    @When("the user enters both the username and the password")
    public void Entercreds() throws Throwable {
            driver.findElement(By.id("username")).sendKeys("anu");
             driver.findElement(By.id("password")).sendKeys("chak");
        }

    @And("clicks submit button")
    public void clickButton() throws Throwable {
    driver.findElement(By.xpath("//button[text()='Submit']")).click();
    }



    @Then("they get confirmation message and verify message as Invalid credentials")
    public void aboutUsPage() throws Throwable {
		wait.until(ExpectedConditions.textToBe(By.id("subheading"),"Invalid credentials")); 
		assertEquals(driver.findElement(By.id("subheading")).getText(), "Invalid credentials");

    
}
}
