package com.qyood.telerik;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class DemosPage {
    private SHAFT.GUI.WebDriver driver;

    private final By demosPageTitle_h1 = By.tagName("h1");
    private final By getFreeTrialButton_a = By.xpath("//a[@href='/download' and contains(@class, 'Button')]");


    public DemosPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    @Step("Navigate To Demos Page")
    public DemosPage navigate() {
        driver.browser().navigateToURL("https://www.telerik.com/support/demos");
        return this;
    }

    @Step("Navigate To Get Free Trials Page")
    public DemosPage getFreeTrial() {
        driver.element().click(getFreeTrialButton_a);
        return this;
    }

    @Step("Verify Navigation To Demos Page")
    public DemosPage verifyNavigationToDemosPage(String title) {
        driver.verifyThat().element(demosPageTitle_h1).textTrimmed().contains(title);
        return this;
    }

}