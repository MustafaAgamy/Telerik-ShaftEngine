package com.qyood.telerik;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class RegisterAccountPage {
    private SHAFT.GUI.WebDriver driver;

    private final By signUpPageTitle_h4 = By.xpath("//h4[contains(@class,'mt20')]");
    private final By passwordField_input = By.id("password");
    private final By firstNameField_input = By.id("fist-name");
    private final By lastNameField_input = By.id("last-name");
    private final By companyField_input = By.id("company");
    private final By phoneField_input = By.id("phone");
    private final By countryField_input = By.xpath("//kendo-combobox[@id='country']//input");
    private final By createAccount_button = By.xpath("//button[@type='submit']");

    public RegisterAccountPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    @Step("Fill Register Form Details")
    public RegisterAccountPage fillSignUpForm(String password, String firstName, String lastName,
                                              String company, String phone, String country) {
        driver.element().type(passwordField_input, password);
        driver.element().type(firstNameField_input, firstName);
        driver.element().type(lastNameField_input, lastName);
        driver.element().type(companyField_input, company);
        driver.element().type(phoneField_input, phone);
        driver.element().type(countryField_input, country);
        driver.element().click(createAccount_button);
        return this;
    }

    @Step("Verify Navigation To Register Page")
    public RegisterAccountPage verifyNavigationToRegisterPage(String title) {
        driver.verifyThat().element(signUpPageTitle_h4).textTrimmed().contains(title);
        return this;
    }
 }
