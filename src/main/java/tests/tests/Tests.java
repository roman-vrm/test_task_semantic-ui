package tests.tests;

import org.junit.Assert;
import org.junit.Test;
import tests.drivers.Semantic_UI_Website;
import semantic_ui.base.TestBase;
import java.util.concurrent.TimeUnit;

public class Tests extends TestBase{

    Semantic_UI_Website website;

    @Override
    protected void beforeTest() {

        website = new Semantic_UI_Website(browser);
        logger.log("Open test page");
    }

    @Test
    public void Test1() {
        browser.get(website.testData().tablePageURL());
        browser.manage().window().maximize();
        browser.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        browser.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

        logger.log("Check if 'Jimmy' in 'Positive/Negative' table has status 'Approved'");
        Assert.assertTrue(website.tablePageDrivers().getTextFromJimmyRow().contains("Approved"));

        logger.log("Check if 'No Name Specified' in 'Positive/Negative' table has status 'Unknown' and 'None' in notes");
        Assert.assertTrue(website.tablePageDrivers().getTextFromNoNameSpecifiedRow().contains("Unknown"));
        Assert.assertTrue(website.tablePageDrivers().getTextFromNoNameSpecifiedRow().contains("None"));

        logger.log("Check if 'Jill' in 'Positive/Negative' table has status 'Unknown' and 'None' in notes");
        Assert.assertTrue(website.tablePageDrivers().getTextFromJillRow().contains("Unknown"));
        Assert.assertTrue(website.tablePageDrivers().getTextFromJillRow().contains("None"));

        logger.log("Check if 'Jimmy' and 'Jamie' in 'Warning' table has status 'Unknown' and 'None' in notes");
        Assert.assertTrue(website.tablePageDrivers().IsAttentionIconPresentJimmyRow());
        Assert.assertTrue(website.tablePageDrivers().IsAttentionIconPresentJamieRow());
    }

    @Test
    public void Test2() {
        browser.get(website.testData().dropdownPageURL());
        browser.manage().window().maximize();
        browser.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        browser.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

        logger.log("Click on first dropdown element");
        website.dropdownPageDrivers().clickOnFirstDropdownElement();
        logger.log("Click on dropdown element item");
        website.dropdownPageDrivers().clickOnFirstDropdownElementItem();
        logger.log("Check if value for first dropdown is correct");
        Assert.assertTrue(website.dropdownPageDrivers().getTextFromFirstDropdownElementValue().contains("Female"));

        logger.log("Click on second dropdown element");
        website.dropdownPageDrivers().clickOnSecondDropdownElement();
        logger.log("Click on dropdown element item");
        website.dropdownPageDrivers().clickOnSecondDropdownElementItem();
        logger.log("Check if value for second dropdown is correct");
        Assert.assertTrue(website.dropdownPageDrivers().getTextFromSecondDropdownElementValue().contains("Male"));

        logger.log("Click on third dropdown element");
        website.dropdownPageDrivers().clickOnThirdDropdownElement();
        logger.log("Click on dropdown element item");
        website.dropdownPageDrivers().clickOnThirdDropdownElementItem();
        logger.log("Check if value for third dropdown is correct");
        Assert.assertTrue(website.dropdownPageDrivers().getTextFromThirdDropdownElementValue().contains("Christian"));
    }

    @Test
    public void Test3() throws InterruptedException {
        browser.get(website.testData().checkboxPageURL());
        browser.manage().window().maximize();
        browser.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        browser.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

        logger.log("Click on all checkboxes");
        website.checkboxesPageDrivers().clickOnCheckboxes();
        logger.log("Check if all checkboxes are checked");
        website.checkboxesPageDrivers().isCheckboxesChecked();

        logger.log("Click on all radio buttons");
        website.checkboxesPageDrivers().clickOnRadiobuttons();
        logger.log("Check if all radio buttons are checked");
        website.checkboxesPageDrivers().isRadiobuttonsChecked();

        logger.log("Click on single slider");
        website.checkboxesPageDrivers().clickOnSingleSlider();
        logger.log("Check if single slider is checked");
        Assert.assertTrue(website.checkboxesPageObjects().singleSlider().isEnabled());
        logger.log("Click on throughput slider");
        website.checkboxesPageDrivers().clickOnThroughputSlider();
        logger.log("Check if throughput slider is checked");
        Assert.assertTrue(website.checkboxesPageObjects().throughputSlider().isEnabled());

        logger.log("Click on toggled");
        website.checkboxesPageDrivers().clickOnToggles();
        logger.log("Check if toggles are checked");
        website.checkboxesPageDrivers().isTogglesChecked();
    }
}
