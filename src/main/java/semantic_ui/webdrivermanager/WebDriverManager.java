package semantic_ui.webdrivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import semantic_ui.config.ConfigurationManager;

public class WebDriverManager {

    public WebDriver getDriver () {

        String testBrowser = ConfigurationManager.getInstance().getTestBrowser().toLowerCase();

        switch (testBrowser) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//resources//geckodriver.exe");
                return new FirefoxDriver();
            case "chrome":
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//resources//chromedriver.exe");
                return new ChromeDriver();
            default:
                throw new RuntimeException("This browser is not supported");
        }

    }

    public void destroy (WebDriver browser) {
        if (browser != null) {
            browser.quit();
        }
        System.out.println(browser + "was closed");
    }
}
