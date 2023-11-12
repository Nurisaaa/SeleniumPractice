package org.example;

import org.example.drivers.Driver;
import org.example.model.User;
import org.example.pages.TextBoxPage;


public class App {
    public static void main( String[] args ) {

        Driver.getDriver().get("https://demoqa.com/text-box");
        TextBoxPage textBoxPage = new TextBoxPage();
        textBoxPage.fillUp(new User(
                "Aizhamal",
                "user@gmail.com",
                "Bishkek",
                "Bishkek"));
        Driver.closeDriver();
    }

















//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        driver.get("https://demoqa.com/webtables");
//        WebElement searchInput = driver.findElement(By.xpath("//input[@id='searchBox']"));
//
//        searchInput.sendKeys("Alden");
//
//        WebElement editButton = driver.findElement(By.xpath("//div[@class='rt-tr-group'][1]//span[@class='mr-2']"));
//        editButton.click();
//
//        WebDriverWait webDriverWait = new WebDriverWait(
//                driver,
//                Duration.ofSeconds(10)
//        );
//        webDriverWait.until(
//                ExpectedConditions
//                        .visibilityOfElementLocated(
//                                By.xpath("//div[@class='modal-content']")
//                        ));
//        WebElement firstName = driver.findElement(By.xpath("//div[@class='modal-content']//input[@id='firstName']"));
//        firstName.clear();
//        firstName.sendKeys("Nurisa");
//        WebElement lastName = driver.findElement(By.xpath("//div[@class='modal-content']//input[@id='lastName']"));
//        lastName.clear();
//        lastName.sendKeys("Mamiraimova");
//        WebElement email = driver.findElement(By.xpath("//div[@class='modal-content']//input[@id='userEmail']"));
//        email.clear();
//        email.sendKeys("nurisa@gmail.com");
//        WebElement age = driver.findElement(By.xpath("//div[@class='modal-content']//input[@id='age']"));
//        age.clear();
//        age.sendKeys("20");
//        WebElement salary = driver.findElement(By.xpath("//div[@class='modal-content']//input[@id='salary']"));
//        salary.clear();
//        salary.sendKeys("300000");
//        WebElement insurance = driver.findElement(By.xpath("//div[@class='modal-content']//input[@id='department']"));
//        insurance.clear();
//        insurance.sendKeys("Qa engineering");
//        WebElement submit = driver.findElement(By.id("submit"));
//        submit.click();
//
//        searchInput.clear();



//        WebElement foodElement = driver.findElement(By.xpath("//li/a[contains(@href, 'food') and contains(@class, 'menu-link')]"));
//        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        driverWait.until(ExpectedConditions.elementToBeClickable(foodElement)).click();
//
//        WebElement desert = driver.findElement(By.xpath("//a[@href='/cafe/desserts']"));
//        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
//        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", desert);
//        desert.click();
//
//        WebElement rangeSlider = driver.findElement(By.xpath("//div[@class='noUi-base']"));
//        Actions actions = new Actions(driver);
//        actions.dragAndDropBy(rangeSlider,40,10).perform();
//
//        WebElement cave = driver.findElement(By.xpath("//a[@href='/cave']"));
//        driverWait.until(ExpectedConditions.elementToBeClickable(cave)).click();
//
//        WebElement kasha = driver.findElement(By.xpath("(//button[@type=\"submit\"])[6]"));
//        kasha.click();
////        actions.moveToElement(orderBtn).click();
////        orderBtn.click();
//
//        WebDriverWait webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(20));
//
//        WebElement korzina = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='cart']/a")));
//        korzina.click();
//
//
//        WebElement checkout = driver.findElement(By.xpath("/html/body/main/section/div[1]/div[5]/div[12]/a"));
//        checkout.click();
//
//        driver.findElement(By.id("food_order_client_name")).sendKeys("Nurisa");
//        driver.findElement(By.id("food_order_address")).sendKeys("Leninskoe");
//        driver.findElement(By.id("food_order_door_code")).sendKeys("Vostochanya 150");
//        driver.findElement(By.id("food_order_phone")).sendKeys("0999123456");
//        driver.findElement(By.id("food_order_additional_info")).sendKeys("0999123456");
//        Thread.sleep(7000);
//
//        driver.close();
//        driver.quit();
//    }
}
