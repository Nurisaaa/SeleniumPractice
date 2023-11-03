package org.example.drivers;

import org.example.config.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {
    public Driver() {
    }

    private static WebDriver webDriver;

    public static WebDriver getDriver() {
        if (webDriver == null){
            switch (ConfigReader.getProperty("browser").trim().toLowerCase()){
                case "chrome" -> webDriver = ChromeWebDriver.getChromeDriver();
                case "safari" -> webDriver = SafariWebDriver.getSafariWebDriver();
                default -> throw  new IllegalArgumentException("You provided wrong Driver name");
            }
        }
        return webDriver;
    }

    public static void closeDriver(){
        try {
            if (webDriver != null){
                webDriver.close();
                webDriver.quit();
                webDriver = null;
            }

        }catch (Exception e){
            System.out.println("Error while closing driver");
        }
    }
}
