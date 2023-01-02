package testautomation.tests;

import org.testng.annotations.Test;
import testautomation.utilities.WindowsManager;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class Checkboxes_Test extends Base_Tests{

    @Test
    public void checkboxes_test() throws InterruptedException {
        WindowsManager windowsManager = new WindowsManager(driver);

        var checkboxes = home_page.click_Checkboxes();
        sleep(2000);
        assertEquals(checkboxes.verify_checkboxes_page(), "Checkboxes", "Incorrect Page");
        sleep(2000);
        checkboxes.uncheck_checked_box();
        sleep(2000);
        checkboxes.check_first_box();
        sleep(2000);
        checkboxes.check_second_box();
        sleep(2000);
        checkboxes.uncheck_first_box();
        sleep(2000);
        checkboxes.uncheck_second_box();
        sleep(2000);
        windowsManager.goBack();


    }
}
