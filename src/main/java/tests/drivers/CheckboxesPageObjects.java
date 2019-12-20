package tests.drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckboxesPageObjects {

    private WebDriver webDriver;

    public CheckboxesPageObjects(WebDriver webDriver) {
        this.webDriver = webDriver;

        PageFactory.initElements(webDriver, this);
    }

    public List<WebElement> checkboxes() {
        try {
            return webDriver.findElements(By.xpath("//div[@class='ui checkbox']"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<WebElement> radiobuttons() {
        try {
            return webDriver.findElements(By.xpath("//div[@class='ui radio checkbox']//label[contains(text(), 'Twice a day')]"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement singleSlider() {
        try {
            return webDriver.findElement(By.xpath("//label[contains(text(), 'Accept terms and conditions')]"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement throughputSlider() {
        try {
            return webDriver.findElement(By.xpath("//label[contains(text(), 'Unmetered')]"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<WebElement> toggles() {
        try {
            return webDriver.findElements(By.xpath("//div[@class='ui toggle checkbox']"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
