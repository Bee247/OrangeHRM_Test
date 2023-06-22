package StepDefinitions;

import Base.TestBase;
import Pages.AdminPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.junit.Before;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class commonSteps1 extends TestBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }

    @Given("^I am on the application home page$")
    public void iAmOnTheApplicationHomePage() {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
    }
    @And("^I log in$")
    public void iLogin() throws InterruptedException {
        AdminPage page = PageFactory.initElements(driver, AdminPage.class);
        page.enterUsername();
        page.enterPassword();
        page.clickLogin();
        Thread.sleep(3000);
    }
}

