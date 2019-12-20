package semantic_ui.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import semantic_ui.logger.TestLogger;
import semantic_ui.webdrivermanager.WebDriverManager;

public class TestBase {

    protected WebDriverManager wdm;
    protected WebDriver browser;
    protected TestLogger logger;

    @Before
    public void setUp() {
        logger = new TestLogger();
        wdm = new WebDriverManager();
        browser = wdm.getDriver();

        beforeTest();
    }

    @After
    public void cleanUp() {
        afterTest();

        logger.log("Close browser");
        wdm.destroy(browser);
    }

    protected void beforeTest() {}

    protected void afterTest() {}
}
