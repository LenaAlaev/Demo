package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInElements {
    WebDriver driver;

    By username= By.name("userName");
    By password= By.name("password");

    By login= By.name("submit");

    //Constructor for memory management
    public LogInElements(WebDriver driver1){
        this.driver=driver1;
    }
    //method for username
    public void usele(String uid){
        driver.findElement(username).sendKeys(uid);
    }
    //method for password
    public void passele(String upwd){
        driver.findElement(password).sendKeys(upwd);
    }
    //method for login
    public void loginele(){
        driver.findElement(login).click();
    }

}
