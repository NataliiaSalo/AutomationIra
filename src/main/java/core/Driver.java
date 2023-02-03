package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Driver {

    //private static WebDriver driver = Driver.getDriver();
    public static final String DRIVER = "webdriver.chrome.driver";
    public static final String DRIVER_PATH = "src/main/resources/chromedriver.exe";

    private static WebDriver driver;

    public static void initDriver() {
        System.setProperty(DRIVER, DRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            initDriver();
        }

        return driver;
    }

    public static void close() {
        driver.quit();
    }
}