package testautomation.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import testautomation.pages.Home_Page;

public class Base_Tests {

    public WebDriver driver;

    protected Home_Page home_page;

    @BeforeClass
    public void setItUp () {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        goHomePage();
        home_page = new Home_Page(driver);

    }

    @BeforeMethod
    public void goHomePage () {

        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass

    public void close () {
//        driver.quit();
    }
}
