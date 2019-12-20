package tests.drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DropdownPageObjects {

    private WebDriver webDriver;

    public DropdownPageObjects(WebDriver webDriver) {
        this.webDriver = webDriver;

        PageFactory.initElements(webDriver, this);
    }

    public WebElement firstGenderDropdownElement() {
        try {
            return webDriver.findElement(By.xpath("(//div[@class='ui selection dropdown'])[1]"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement firstGenderDropdownElementItem() {
        try {
            return webDriver.findElement(By.xpath("(//div[@class='item' and contains(text(), 'Female')])[1]"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement firstGenderDropdownElementWithValue() {
        try {
            return webDriver.findElement(By.xpath("//*[@id='example']/div[4]/div/div[2]/div[4]/div[1]/div[3]/div[2]"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement secondGenderDropdownElement() {
        try {
            return webDriver.findElement(By.xpath("//div[@class='another dropdown example']//div[@class='ui dropdown selection']"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement secondGenderDropdownElementItem() {
        try {
            return webDriver.findElement(By.xpath("//*[@id='example']/div[4]/div/div[2]/div[4]/div[1]/div[4]/div/div[2]/div[1]"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement secondGenderDropdownElementWithValue() {
        try {
            return webDriver.findElement(By.xpath("//*[@id='example']/div[4]/div/div[2]/div[4]/div[1]/div[4]/div"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement thirdGenderDropdownElement() {
        try {
            return webDriver.findElement(By.xpath("(//div[@class='ui fluid selection dropdown'])[1]"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement thirdGenderDropdownElementItem() {
        try {
            return webDriver.findElement(By.xpath("//div[@data-value='christian']"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement thirdGenderDropdownElementWithValue() {
        try {
            return webDriver.findElement(By.xpath("//*[@id='example']/div[4]/div/div[2]/div[4]/div[1]/div[5]/div"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
