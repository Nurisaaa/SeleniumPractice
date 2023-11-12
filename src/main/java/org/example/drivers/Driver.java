package org.example.drivers;

import org.example.config.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {
    private Driver(){
        // Singleton pattern
    }
    public static WebDriver driver;
    public static WebDriver getDriver(){

        if (ConfigReader.getProperty("browser").equals("chrome")) {
            System.out.println(ConfigReader.getProperty("browser"));
            driver = ChromeWebDriver.loadChromeDriver();
        }
        return driver;
    }

    public static void closeDriver(){
        try {
            if (driver != null){
                driver.close();
                driver.quit();
                driver = null;
            }

        }catch (Exception e){
            System.out.println("Error while closing driver");
        }
    }
}
