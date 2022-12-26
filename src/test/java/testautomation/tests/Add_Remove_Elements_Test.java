package testautomation.tests;

import org.testng.annotations.Test;
import testautomation.utilities.WindowsManager;
import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class Add_Remove_Elements_Test extends Base_Tests {

    @Test
    public void testAddRemoveButtons() throws InterruptedException {
        WindowsManager windowsManager = new WindowsManager(driver);

        var add_remove_elements = home_page.click_Add_Remove_Elements();
        assertEquals(add_remove_elements.get_Add_Remove_Elements_Text(), "Add/Remove Elements", "Incorrect Page");
        add_remove_elements.click_Add_Element();
        add_remove_elements.click_Delete_Button();
        sleep(3000);
        windowsManager.goBack();
    }
}
