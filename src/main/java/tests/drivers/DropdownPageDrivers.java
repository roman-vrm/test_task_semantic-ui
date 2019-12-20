package tests.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownPageDrivers {

    private WebDriver webDriver;

    DropdownPageObjects dropdownPageObjects;

    public DropdownPageDrivers(WebDriver webDriver) {
        this.webDriver = webDriver;

        dropdownPageObjects = new DropdownPageObjects(webDriver);

        PageFactory.initElements(webDriver, this);
    }

    public void clickOnFirstDropdownElement() {
        WebDriverWait wait = new WebDriverWait(webDriver, 3);
        wait.until(ExpectedConditions.visibilityOf(dropdownPageObjects.firstGenderDropdownElement()));
        dropdownPageObjects.firstGenderDropdownElement().click();
    }

    public void clickOnFirstDropdownElementItem() {
        WebDriverWait wait = new WebDriverWait(webDriver, 3);
        wait.until(ExpectedConditions.visibilityOf(dropdownPageObjects.firstGenderDropdownElementItem()));
        dropdownPageObjects.firstGenderDropdownElementItem().click();
    }

    public String getTextFromFirstDropdownElementValue() {
        return dropdownPageObjects.firstGenderDropdownElementWithValue().getText();
    }

    public void clickOnSecondDropdownElement() {
        WebDriverWait wait = new WebDriverWait(webDriver, 3);
        wait.until(ExpectedConditions.visibilityOf(dropdownPageObjects.secondGenderDropdownElement()));
        dropdownPageObjects.secondGenderDropdownElement().click();
    }

    public void clickOnSecondDropdownElementItem() {
        WebDriverWait wait = new WebDriverWait(webDriver, 3);
        wait.until(ExpectedConditions.visibilityOf(dropdownPageObjects.secondGenderDropdownElementItem()));
        dropdownPageObjects.secondGenderDropdownElementItem().click();
    }

    public String getTextFromSecondDropdownElementValue() {
        return dropdownPageObjects.secondGenderDropdownElementWithValue().getText();
    }

    public void clickOnThirdDropdownElement() {
        WebDriverWait wait = new WebDriverWait(webDriver, 3);
        wait.until(ExpectedConditions.visibilityOf(dropdownPageObjects.thirdGenderDropdownElement()));
        dropdownPageObjects.thirdGenderDropdownElement().click();
    }

    public void clickOnThirdDropdownElementItem() {
        WebDriverWait wait = new WebDriverWait(webDriver, 3);
        wait.until(ExpectedConditions.visibilityOf(dropdownPageObjects.thirdGenderDropdownElementItem()));
        dropdownPageObjects.thirdGenderDropdownElementItem().click();
    }

    public String getTextFromThirdDropdownElementValue() {
        return dropdownPageObjects.thirdGenderDropdownElementWithValue().getText();
    }
}
