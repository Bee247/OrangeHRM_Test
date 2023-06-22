package Pages;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminPage {

    // locators
    @FindBy(how = How.XPATH, using = "//input[@name='username']")
    public static WebElement usernameField;
    @FindBy (how = How.XPATH, using = "//input[@name='password']")
    public static WebElement passwordField;
    @FindBy (how = How.XPATH, using = "//button[@type='submit']")
    public static WebElement loginButton;
    //#/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button
    //#//*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button  ---> relative

    @FindBy (how = How.XPATH, using = "//li[1]//a[1]//span[1]")
    public static WebElement adminMenuButton;
    //#/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span
    //"/html/body/div/div[1]/div[1]/aside/nav/div[2]/div/div/button"
    @FindBy (how = How.XPATH, using = "//i[@class='oxd-icon bi-chevron-left']")
    public static WebElement toggleCloseMenu;
    @FindBy (how = How.XPATH, using = "//h5[text() = 'System Users']")
    public static WebElement SystemUserText;
    //user data with absolute xpath
    @FindBy (how = How.XPATH, using = "/")
    public static WebElement UserNameSearchField;
    @FindBy (how = How.XPATH, using = "/")
    public static WebElement SearchButton;
    @FindBy (how = How.XPATH, using = "/")
    public static WebElement UserNameCol;
    @FindBy (how = How.XPATH, using = "/")
    public static WebElement UserRoleCol;


    //method
    public void enterUsername() {
        usernameField.sendKeys("Admin");}

    public void enterPassword(){
        passwordField.sendKeys("admin123");}
    public void clickLogin() {
        loginButton.click();}
    public void clickAdmin() {
        adminMenuButton.click();}
    public void clickCloseMenu() {
        toggleCloseMenu.click();}
    public void AssertSystemUsersPage() {
        SystemUserText.isDisplayed();}
    public void searchByUsername() {
        UserNameSearchField.sendKeys("Alice.Duval");}
    public void clickSearchButton() {
        SearchButton.click();}
    public void AssertSearchResult(){

        String ExpectedName = "Alice.Duval";
        String ActualName = UserNameCol.getText();
        Assert.assertEquals(ExpectedName, ActualName);
        System.out.println(ActualName);

        String ExpectedUserRole = "ESS";
        String ActualUserRole = UserRoleCol.getText();
        Assert.assertEquals(ExpectedUserRole, ActualUserRole);
        System.out.println(ActualUserRole);

    }
}
