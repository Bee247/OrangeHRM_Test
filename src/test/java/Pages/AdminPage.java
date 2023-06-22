package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminPage {
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
    @FindBy (how = How.XPATH, using = "//i[@class='oxd-icon bi-chevron-left']")
    public static WebElement closeMenu;

}
