package tests.drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TablePageDrivers {

    private WebDriver webDriver;

    TablePageObjects tablePageObjects;
    TestData testData;


    public TablePageDrivers(WebDriver webDriver) {
        this.webDriver = webDriver;

        tablePageObjects = new TablePageObjects(webDriver);
        testData = new TestData(webDriver);

        PageFactory.initElements(webDriver, this);
    }

    public String getTextFromJimmyRow() {
        return tablePageObjects.positiveNegativeTableJimmyRow().getText();
    }

    public String getTextFromNoNameSpecifiedRow() {
        return tablePageObjects.positiveNegativeTableNoNameSpecifiedRow().getText();
    }

    public String getTextFromJillRow() {
        return tablePageObjects.positiveNegativeTableJillRow().getText();
    }

    public boolean IsAttentionIconPresentJimmyRow() {
        return tablePageObjects.warningTableJimmyRow().findElement(By.xpath(testData.attentionIconSelector())).isDisplayed();
    }

    public boolean IsAttentionIconPresentJamieRow() {
        return tablePageObjects.warningTableJimmyRow().findElement(By.xpath(testData.attentionIconSelector())).isDisplayed();
    }

}
