package org.example.helper;

import org.example.drivers.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ElementActions {
//    private final Actions actions = new Actions(Driver.getDriver());

    public ElementActions writeText(WebElement webElement,String value){
        webElement.clear();
        webElement.sendKeys(value);
        return this;
    }

    public ElementActions clickButton(WebElement webElement){
        scrollToTheElement(webElement);
        webElement.click();
        return this;
    }

    public ElementActions scrollToTheElement(WebElement webElement){
        ((JavascriptExecutor) Driver.driver).executeScript("arguments[0].scrollIntoView({behavior: 'auto', block: 'center'});", webElement);
        return this;
    }
}
