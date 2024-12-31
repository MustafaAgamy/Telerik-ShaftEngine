package com.qyood.telerik;

import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests {
    private SHAFT.GUI.WebDriver driver;
    private SHAFT.TestData.JSON testData;

    @Test
    public void testCreateAccount() {
        new DemosPage(driver)
                .navigate()
                .verifyNavigationToDemosPage(testData.getTestData("demosPageTitle"))
                .getFreeTrial();
        new GetFreeTrialPage(driver)
                .verifyNavigationToGetFreeTrialPage(testData.getTestData("freeTrialPageSubTitle"))
                .selectUiForReact();
        new LoginPage(driver)
                .verifyNavigationToLoginPage(testData.getTestData("loginPageTitle"))
                .login(testData.getTestData("email"));
        new RegisterAccountPage(driver)
                .verifyNavigationToRegisterPage(testData.getTestData("registerPageTitle"))
                .fillSignUpForm(
                        testData.getTestData("password"), testData.getTestData("firstName"),
                        testData.getTestData("lastName"), testData.getTestData("company"),
                        testData.getTestData("phone"), testData.getTestData("country"));
    }

    @BeforeMethod
    public void setUp() {
        driver = new SHAFT.GUI.WebDriver();
        testData = new SHAFT.TestData.JSON("createAccountTests.json");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
