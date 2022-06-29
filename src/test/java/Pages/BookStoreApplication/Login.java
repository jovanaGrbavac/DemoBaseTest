package Pages.BookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    //data: userName jovana; password Jovana123!;

    public final String url = "https://demoqa.com/";
    public WebDriver driver;
    public WebDriverWait wdWait;

    public Login(WebDriver driver, WebDriverWait wdWait) {
        this.driver = driver;
        this.wdWait = wdWait;
    }

    public By bookStoreCard = By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(6) > div > div.card-up");
    public By login = By.id("login");
    public By userName = By.id("userName");
    public By password = By.id("password");
    public By loginButton = By.id("login");
    public By userNameValue = By.id("userName-value");


    public WebElement getBookStoreCard() { return driver.findElement(bookStoreCard); }
    public WebElement getLogin() { return driver.findElement(login); }
    public WebElement getUserName() { return driver.findElement(userName); }
    public WebElement getPassword() { return driver.findElement(password); }
    public WebElement getLoginButton() { return driver.findElement(loginButton); }
    public WebElement getUserNameValue() {return driver.findElement(userNameValue); }



    public void BookStoreCardClick() {
        Actions actions = new Actions(driver);
        actions.click(getBookStoreCard()).build().perform();
    }
    public void loginClick() {
        Actions actions = new Actions(driver);
        actions.click(getLogin()).build().perform();
    }
    public void sendUsername(String s) {
        Actions actions = new Actions(driver);
        actions.click(getUserName()).sendKeys(s).build().perform();
    }
    public void sendPassword(String s) {
        Actions actions = new Actions(driver);
        actions.click(getPassword()).sendKeys(s).build().perform();
    }
    public void clickLoginButton() {
        Actions actions = new Actions(driver);
        actions.click(getLoginButton()).build().perform();
    }



}
