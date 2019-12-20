package tests.drivers;

import org.openqa.selenium.WebDriver;

public class TestData {

    private WebDriver webDriver;

    public TestData (WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String tablePageURL() {
        return "https://semantic-ui.com/collections/table.html";
    }

    public String dropdownPageURL() {
        return "https://semantic-ui.com/modules/dropdown.html";
    }

    public String checkboxPageURL() {
        return "https://semantic-ui.com/modules/checkbox.html";
    }

    public String attentionIconSelector() {
        return "//i[@class='attention icon']";
    }

}
