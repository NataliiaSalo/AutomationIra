package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class testNG {
    @Test
    public void f() {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\salon\\IdeaProjects\\YouTube\\src\\main\\resources\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        String appurl=driver.getTitle();
        System.out.println(appurl);
        driver.close();
// System.exit(0);
    }
}