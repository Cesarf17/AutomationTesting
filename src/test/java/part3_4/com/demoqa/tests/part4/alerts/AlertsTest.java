package part3_4.com.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utilities.SwitchToUtility.*;

@Test
public class AlertsTest extends BaseTest {

    public void testInformationAlert() {
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(), expectedAlertText,
                "\nActual and Expected Messages Do Not Match\n");
        acceptAlert();
    }

    public void testConfirmationAlert() {
        String expectedConfirmationResults = "You selected Cancel";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickConfirmationAlertButton();
        dismissAlert();
        String actualConfirmationResult = alertsPage.getConfirmationResult();
        Assert.assertEquals(actualConfirmationResult, expectedConfirmationResults,
                "\nYou Did Not Select Cancel\n");
    }

    public void testPromptAlert() {
        String alertText = "Cesar Frayre";
        String expectedResult = "You Entered " + alertText;
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickPromtAlertButton();
        setAlertText(alertText);
        acceptAlert();
        String actualResult = alertsPage.getPromptAlertResult();
        Assert.assertEquals(actualResult, expectedResult,
                "\nActual and Expected Results Do Not Match");
    }

}
