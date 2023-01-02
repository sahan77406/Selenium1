package testautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkboxes_Page {

    private WebDriver driver;
    By verify_text = By.xpath("//*[@id='content']/div/h3");
    By first_checkbox = By.xpath("//*[@id='checkboxes']/input[1]");
    By second_checkbox = By.xpath("//*[@id='checkboxes']/input[2]");

    public Checkboxes_Page(WebDriver driver) {
        this.driver = driver;
    }

    public String verify_checkboxes_page () {
        return driver.findElement(verify_text).getText();
    }

    public void uncheck_checked_box() {
        driver.findElement(second_checkbox).click();
    }

    public void check_first_box() {
        driver.findElement(first_checkbox).click();
    }

    public void check_second_box() {
        driver.findElement(second_checkbox).click();
    }

    public void uncheck_first_box() {
        driver.findElement(first_checkbox).click();
    }

    public void uncheck_second_box() {
        driver.findElement(second_checkbox).click();
    }
}
