package StepDefinitions;
 
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
 
public class Hooks extends Baseclass {
 
    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
 
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
 
 