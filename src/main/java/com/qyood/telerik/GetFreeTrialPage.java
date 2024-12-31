package com.qyood.telerik;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class GetFreeTrialPage {
    private SHAFT.GUI.WebDriver driver;

    private final By getFreeTrialsTitle_h1 = By.tagName("h1");
    private final By tryNowDropDown_a = By.xpath("//a[@href='#']");
    private final By uiForReact_a = By.xpath("//a[@href='/try/kendo-react-ui' and @class='u-db']");

    public GetFreeTrialPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public GetFreeTrialPage selectUiForReact() {
        driver.element().click(tryNowDropDown_a);
        driver.element().click(uiForReact_a);
        return this;
    }

    public GetFreeTrialPage verifyNavigationToGetFreeTrialPage(String title) {
        driver.verifyThat().element(getFreeTrialsTitle_h1).textTrimmed().contains(title);
        return this;
    }
}