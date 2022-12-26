package testautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page {
    private WebDriver driver;

    public Home_Page(WebDriver driver) {
        this.driver = driver;
    }

    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public Add_Remove_Elements_Page click_Add_Remove_Elements() {
        clickLink("Add/Remove Elements");
        return new Add_Remove_Elements_Page(driver);
    }

    public Basic_Auth_Page click_Basic_Auth() {
        clickLink("Basic Auth");
        return new Basic_Auth_Page(driver);
    }
}