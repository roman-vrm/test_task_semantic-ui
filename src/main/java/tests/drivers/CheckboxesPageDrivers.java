package tests.drivers;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CheckboxesPageDrivers {

    private WebDriver webDriver;

    CheckboxesPageObjects checkboxesPageObjects;

    public CheckboxesPageDrivers(WebDriver webDriver) {
        this.webDriver = webDriver;

        checkboxesPageObjects = new CheckboxesPageObjects(webDriver);

        PageFactory.initElements(webDriver, this);
    }

    public void clickOnCheckboxes(){
        List<WebElement> checkboxes = checkboxesPageObjects.checkboxes();
        for(WebElement checkbox : checkboxes) {
            if (checkbox.isDisplayed()) {
                WebDriverWait wait = new WebDriverWait(webDriver, 10);
                wait.until(ExpectedConditions.elementToBeClickable(checkbox));
                checkbox.click();
            }
        }
    }

    public void isCheckboxesChecked() {
        List<WebElement> checkboxes = checkboxesPageObjects.checkboxes();
        for(WebElement checkbox : checkboxes) {
            if (checkbox.isDisplayed() && checkbox.isEnabled()) {
                Assert.assertTrue(checkbox.isSelected());
            }
        }
    }

    public void clickOnRadiobuttons(){
        List<WebElement> radiobuttons = checkboxesPageObjects.radiobuttons();
        for(WebElement radiobutton : radiobuttons) {
            if (radiobutton.isDisplayed()) {
                WebDriverWait wait = new WebDriverWait(webDriver, 10);
                wait.until(ExpectedConditions.elementToBeClickable(radiobutton));
                radiobutton.click();
            }
        }
    }

    public void isRadiobuttonsChecked() {
        List<WebElement> radiobuttons = checkboxesPageObjects.radiobuttons();
        for(WebElement radiobutton : radiobuttons) {
            if (radiobutton.isDisplayed() && radiobutton.isEnabled()) {
                Assert.assertTrue(radiobutton.isSelected());
            }
        }
    }

    public void clickOnSingleSlider(){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOf(checkboxesPageObjects.singleSlider()));
        checkboxesPageObjects.singleSlider().click();
    }

    public void clickOnThroughputSlider(){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOf(checkboxesPageObjects.throughputSlider()));
        checkboxesPageObjects.throughputSlider().click();
    }

    public void clickOnToggles(){
        List<WebElement> toggles = checkboxesPageObjects.toggles();
        for(WebElement toggle : toggles) {
            if (toggle.isEnabled()) {
                WebDriverWait wait = new WebDriverWait(webDriver, 10);
                wait.until(ExpectedConditions.elementToBeClickable(toggle));
                toggle.click();
            }
        }
    }

    public void isTogglesChecked() {
        List<WebElement> toggles = checkboxesPageObjects.toggles();
        for(WebElement toggle : toggles) {
            if (toggle.isDisplayed()) {
                Assert.assertTrue(toggle.isEnabled());
            }
        }
    }
}
