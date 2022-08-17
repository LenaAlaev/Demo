package edu.testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.WebElement_PageFactory;

public class LogInClassPageFactory {
    WebDriver driver;
    @Test
    public void loginVerify() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/login.php");
        //created object for pagefactory class
        WebElement_PageFactory locateElements= PageFactory.initElements(driver, WebElement_PageFactory.class);

        locateElements.loginMethod("edureka", "edureka123");
        Thread.sleep(5000);

        driver.quit();
    }
}
