package StepDefinitions;

import Base.TestBase;
import Pages.AdminPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class AdminSearchUserTest extends TestBase {

    //@Given("^I am logged in$")
    //public void iAmLoggedIn() throws InterruptedException {
    //System.setProperty("webDriver.chrome.driver", "c:\\chromedriver.exe");
    //driver = new ChromeDriver();
    //driver.manage().window().maximize();
    //driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    //Thread.sleep(2000);
    //}

    @When("^I click the Admin menu$")
    public void iClickTheAdminMenu() throws InterruptedException {
        //driver.findElement(By.xpath("//*span[text() = 'Admin']")).click(); // xpath not sure
        //driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/button")).click();
        AdminPage page = PageFactory.initElements(driver, AdminPage.class);
        page.clickAdmin();
        page.clickCloseMenu();
    }

    @And("^I should see the user page$")
    public void iShouldSeeTheUserPage() throws InterruptedException {
        //driver.findElement(By.xpath("//*h5[text() = 'System Users']")).isDisplayed();
        AdminPage page = PageFactory.initElements(driver, AdminPage.class);
        page.AssertSystemUsersPage();
    }

    @When("^I enter user data$")
    public void iEnterUserData() {
        AdminPage page = PageFactory.initElements(driver, AdminPage.class);
        page.searchByUsername();
        //driver.findElement(By.className("oxd-input oxd-input--active")).sendKeys("Alice.Duval");
    }

    @And("^I click on the search button$")
    public void iClickOnTheSearchButton() throws InterruptedException {
        AdminPage page = PageFactory.initElements(driver, AdminPage.class);
        page.clickSearchButton();
        //driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
        Thread.sleep(5000);
    }

    @Then("^Search result should return the current user$")
    public void searchResultShouldReturnTheCurrentUser() {
        AdminPage page = PageFactory.initElements(driver, AdminPage.class);
        page.AssertSearchResult();
        //driver.findElement(By.xpath("//div[contains(text(),'Alice.Duval')]")).isDisplayed();
    }
}
