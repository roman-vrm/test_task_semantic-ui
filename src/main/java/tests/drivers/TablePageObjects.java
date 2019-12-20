package tests.drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TablePageObjects {

    private WebDriver webDriver;

    public TablePageObjects(WebDriver webDriver) {
        this.webDriver = webDriver;

        PageFactory.initElements(webDriver, this);
    }

    public WebElement positiveNegativeTableJimmyRow() {
        try {
            return webDriver.findElement(By.xpath("//tr[@class='positive']"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement positiveNegativeTableNoNameSpecifiedRow() {
        try {
            return webDriver.findElement(By.xpath("(//table[@class='ui celled table'])[2]/tbody/tr[1]"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }


    public WebElement positiveNegativeTableJillRow() {
        try {
            return webDriver.findElement(By.xpath("//tr[@class='negative']"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement warningTableJimmyRow() {
        try {
            return webDriver.findElement(By.xpath("(//tr[@class='warning'])[1]"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public WebElement warningTableJamieRow() {
        try {
            return webDriver.findElement(By.xpath("(//table[@class='ui celled table'])[4]//tr[3]"));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

//    public List<WebElement> projectCards() {
//        try {
//        return webDriver.findElements(By.xpath("//div[@class='cq-card h-100 d-flex flex-column']"));
//        } catch (Exception ex) {
//        throw new RuntimeException(ex);
//        }
//    }
}
