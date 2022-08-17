package edu.testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.LogInElements;

public class TestCaseClass {
    WebDriver driver;
    @Test
    public void verifyLogin() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/login.php");

        //create object for LoginElement class
        LogInElements login= new LogInElements(driver);
        login.usele("edureka");
        login.passele("edureka123");
        login.loginele();

        Thread.sleep(5000);

        driver.quit();


    }
}
