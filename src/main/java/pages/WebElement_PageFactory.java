package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WebElement_PageFactory {

    WebDriver driver;
    @FindBy(name="userName")
    @CacheLookup
    WebElement username;

    @FindBy(how = How.NAME,using="password")
    @CacheLookup
    WebElement password;

    @FindBy(how = How.NAME,using = "submit")
    @CacheLookup
    WebElement login;

    public void WebElement_PageFactory(WebDriver driver1){
        this.driver=driver1;
    }

    //method of login
    public void loginMethod(String uid, String upwd){
        username.sendKeys(uid);
        password.sendKeys(upwd);
        login.click();
    }
}
