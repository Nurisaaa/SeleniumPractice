package org.example.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class SafariWebDriver {
    public static WebDriver getSafariWebDriver(){
        WebDriverManager.safaridriver().setup();
        WebDriver safariWebDriver = new SafariDriver();
        safariWebDriver.manage().window().maximize();
        safariWebDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return safariWebDriver;
    }
}
