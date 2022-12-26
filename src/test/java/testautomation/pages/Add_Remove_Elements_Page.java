package testautomation.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Add_Remove_Elements_Page {
    private WebDriver driver;
    private By addElement = By.xpath(".//button[text()='Add Element']");
    private By deleteElement = By.id("elements");
    private By verifyText = By.xpath("//*[@id='content']/h3");

    public Add_Remove_Elements_Page (WebDriver driver) {
        this.driver = driver;
    }
    public void click_Add_Element () {
        driver.findElement(addElement).click();
    }
    public String get_Add_Remove_Elements_Text () {
        return driver.findElement(verifyText).getText();
    }
    public void click_Delete_Button () {
        driver.findElement(deleteElement).click();
    }



}
