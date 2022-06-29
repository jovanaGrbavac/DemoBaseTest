package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBox {
    public final String url = "https://demoqa.com/";
    public WebDriver driver;
    public WebDriverWait wdWait;

    public By fullname = By.id("userName");
    public By email = By.id("userEmail");
    public By currentAddress = By.id("currentAddress");
    public By permanentAddress = By.id("permanentAddress");
    public By submitButton = By.id("submit");
    public By submitText = By.id("output");

    public TextBox (WebDriver driver, WebDriverWait wdWait){
        this.driver = driver;
        this.wdWait = wdWait;
    }

    public WebElement getFullName(){
        return driver.findElement(fullname);
    }
    public WebElement getEmail(){
        return driver.findElement(email);
    }
    public WebElement getCurrentAddress(){
        return driver.findElement(currentAddress);
    }
    public WebElement getPermanentAddress(){
        return driver.findElement(permanentAddress);
    }

    public WebElement getSubmitText() { return driver.findElement(submitText); }

    public WebElement getSubmitButton(){
       return driver.findElement(submitButton);
    }
    public void clickSubmitButton(){
        getSubmitButton().click();
    }
    public String submitText() {
        return getSubmitText().getText();
    }



}
