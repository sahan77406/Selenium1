package testautomation.tests;

import org.testng.annotations.Test;
import testautomation.utilities.WindowsManager;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class Basic_Auth_Test extends Base_Tests{


    @Test

    public void test_basic_auth () throws Exception {
        WindowsManager windowsManager = new WindowsManager(driver);

        var basic_auth = home_page.click_Basic_Auth();
        basic_auth.enter_user_password();
        assertEquals(basic_auth.verify_basic_auth_page(), "Basic Auth", "Incorrect Page");
        sleep(3000);
        windowsManager.goBack();
        windowsManager.goBack();

    }
}
