package testautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Basic_Auth_Page {

    private WebDriver driver;

    By verify_text = By.xpath("//*[@id='content']/div/h3");


    public Basic_Auth_Page (WebDriver driver) {
        this.driver = driver;
    }

    public void enter_user_password () throws Exception {
        Thread.sleep(3000);
        String u = "admin";
        String str = "https://" + u + ":" + u + "@" +  "the-internet.herokuapp.com/basic_auth";
        Thread.sleep(3000);
        driver.get(str);
    }

    public String verify_basic_auth_page () {
        String verified_text = driver.findElement(verify_text).getText();
        System.out.println(verified_text);
        return verified_text;
    }




}
