package part3_4.com.demoqa.tests.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class KeyboardTest extends BaseTest {

    @Test
    public void testApplicationUsingKeyboard() {
        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullName("Cesar Frayre");
        textBoxPage.setEmail("cesarfrayre2001@gmail.com");
        textBoxPage.setCurrentAddress("1234 Selenium Avenue");
        textBoxPage.setCurrentAddress("Suite 1234");
        textBoxPage.setCurrentAddress("Dallas TX");
        textBoxPage.clickSubmitButton();
        String actualAddress = textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualAddress.contains("Suite 1234"),
                "\nActual Address does not contain Suite 1234\n");

    }

}
