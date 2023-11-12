package org.example.pages;

import org.example.drivers.Driver;
import org.example.helper.ElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public ElementActions actions = new ElementActions();
    public BasePage() {
        PageFactory.initElements(Driver.driver, this);
    }

}
