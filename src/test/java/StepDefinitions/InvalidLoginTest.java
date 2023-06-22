package StepDefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTest {

    public WebDriver driver;
    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
    }

    @When("^I enter \"([^\"]*)\" in the username field$")
    public void iEnterInTheUsernameField(String username) throws Throwable {
        driver.findElement(By.name("username")).sendKeys(username);

    }
    @And("^I enter \"([^\"]*)\" in the password field$")
    public void iEnterInThePasswordField(String password) throws Throwable {
        driver.findElement(By.name("password")).sendKeys(password);
        Thread.sleep(2000);
    }

    @When("^I click the login button$")
    public void iClickTheLoginButton() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("^I should get the correct errorMessage$")
    public void iShouldGetTheCorrectErrorMessage() {
        String  ExpectedUser = "Magdalena Lozowska-Pereira kim";
        String  ActualUSer = driver.findElement(By.linkText("Magdalena Lozowska-Pereira kim")).getText();
        Assert.assertEquals(ExpectedUser, ActualUSer);
        System.out.println(ActualUSer);
    }
}
