package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static Properties CONFIG = null;
    public static WebDriver driver = null;

    public void initialize() throws IOException {
        if (driver == null) {

            CONFIG = new Properties();
            FileInputStream fn = new FileInputStream( System.getProperty("user.dir") + "/src/main/java/config/config.properties");
            CONFIG.load(fn);
            //initialize

            //if statement (CONFIG.getProperty("browser"))
            switch (CONFIG.getProperty("browser")) {
                case "chrome":
                    System.setProperty("webDriver.chrome.driver", "c:\\chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                case "IE":
                    driver = new InternetExplorerDriver();
                    System.setProperty("webDriver.chrome.driver", "c:\\IeDriver.exe");

                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    System.setProperty("webDriver.gecko.driver", "c:\\geckodriver.exe");
                    break;
            }
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

    }
}


