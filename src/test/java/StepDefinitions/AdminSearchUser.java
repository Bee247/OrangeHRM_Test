package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminSearchUser {
    public WebDriver driver;

    @Given("^I successfully navigate to my hompage$")
    public void iSuccessfullyNavigateToMyHompage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
    }

    @When("^I Input my valid credentials$")
    public void iInputMyValidCredentials() throws InterruptedException {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(2000);
    }

    @And("^I click on the login button$")
    public void iClickOnTheLoginButton() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    //@Then("^I should be logged in successfully$")
    //public void iShouldBeLoggedInSuccessfully() {
    // String  ExpectedloggedInUser = "Magdalena Lozowska-Pereira kim";
    //String  ActualLoggedInUSer = driver.findElement(By.linkText("Magdalena Lozowska-Pereira kim")).getText();
    //Assert.assertEquals(ExpectedloggedInUser, ActualLoggedInUSer);
    //System.out.println(ActualLoggedInUSer);
//}
}

