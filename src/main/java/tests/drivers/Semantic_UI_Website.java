package tests.drivers;

import org.openqa.selenium.WebDriver;

public class Semantic_UI_Website {

    private WebDriver webDriver;

    public Semantic_UI_Website(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public TablePageDrivers tablePageDrivers() {
        return new TablePageDrivers(webDriver);
    }

    public DropdownPageDrivers dropdownPageDrivers() {
        return new DropdownPageDrivers(webDriver);
    }

    public CheckboxesPageDrivers checkboxesPageDrivers() {
        return new CheckboxesPageDrivers(webDriver);
    }

    public CheckboxesPageObjects checkboxesPageObjects() {
        return new CheckboxesPageObjects(webDriver);
    }

    public TestData testData() {
        return new TestData(webDriver);
    }
}
