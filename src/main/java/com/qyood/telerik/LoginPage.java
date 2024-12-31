package com.qyood.telerik;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class LoginPage {
    private SHAFT.GUI.WebDriver driver;

    private final By loginPageTitle_h4 = By.tagName("h4");
    private final By emailField_input = By.id("email");
    private final By next_button = By.xpath("//button[@type='submit']");

    public LoginPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage login(String email) {
        driver.element().type(emailField_input,email);
        driver.element().click(next_button);
        return this;
    }

    public LoginPage verifyNavigationToLoginPage(String title) {
        driver.verifyThat().element(loginPageTitle_h4).textTrimmed().contains(title);
        return this;
    }
}
