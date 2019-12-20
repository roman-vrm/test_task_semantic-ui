package semantic_ui;

import org.openqa.selenium.WebDriver;
import semantic_ui.logger.TestLogger;
import semantic_ui.utils.StringUtils;
import semantic_ui.webdrivermanager.WebDriverManager;

public class TestApp {

    public static void main(String[] args) {

        StringUtils stringRandom = new StringUtils();
        System.out.println(stringRandom.randomString("numeric", 1));

        TestLogger logger = new TestLogger();
        logger.log("Step 1");
        logger.log("Step 2");
        logger.log("Step 3");

        WebDriverManager wdm;
        WebDriver driver;


    }
}
