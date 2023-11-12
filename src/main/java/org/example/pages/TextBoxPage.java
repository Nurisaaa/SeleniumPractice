package org.example.pages;

import org.example.model.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage {
    @FindBy(xpath = "//input[@id='userName']")
    public WebElement userNameInp;
    @FindBy(xpath = "//input[@id='userEmail']")
    public WebElement userEmailInp;
    @FindBy(xpath = "//textarea[@id='currentAddress']")
    public WebElement userAddressInp;
    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    public WebElement userPermanentAddressInp;
    @FindBy(id = "submit")
    public WebElement inputBtn;

    public TextBoxPage fillUp(User user){
        actions.writeText(userNameInp, user.getUserFullName())
                .writeText(userEmailInp, user.getEmail())
                .writeText(userAddressInp, user.getCurrentAddress())
                .writeText(userPermanentAddressInp, user.getPermanentAddress())
                .clickButton(inputBtn);
        return this;
    }
}
