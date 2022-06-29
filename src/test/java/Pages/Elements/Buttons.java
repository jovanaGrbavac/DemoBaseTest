package Pages.Elements;

import DemoBase.BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buttons {
    public final String url = "https://demoqa.com/";
    public WebDriver driver;
    public WebDriverWait wdWait;

    public Buttons(WebDriver driver, WebDriverWait wdWait) {
        this.driver = driver;
        this.wdWait = wdWait;
    }

    public By doubleClickMe = By.id("doubleClickBtn");
    public By rightClick = By.id("rightClickBtn");
    public By clickMe = By.xpath("//*[@id=\"HsrvB\"]");
    public By doubleClickMessage = By.id("doubleClickMessage");
    public By rightClickMessage = By.id("rightClickMessage");
    public By clickMessage = By.id("dynamicClickMessage");

    public WebElement getdoubleClickMe() {
       return driver.findElement(doubleClickMe);
    }
    public WebElement getRightClick() {
        return driver.findElement(rightClick);
    }
    public WebElement getClickMe() {
       return driver.findElement(clickMe);
    }
    public WebElement getDoubleClickMessage() {
        return driver.findElement(doubleClickMessage);
    }
    public WebElement getRightClickMessage() {
        return driver.findElement(rightClickMessage);
    }
    public WebElement getClickMessage() {
        return driver.findElement(clickMessage);
    }


    public void doubleClick() {
        Actions actions = new Actions(driver);
        actions.doubleClick(getdoubleClickMe()).build().perform();
    }
    public void rightClick() {
        Actions actions = new Actions(driver);
        actions.contextClick(getRightClick()).build().perform();
    }
    public void clickMe() {
        Actions actions = new Actions(driver);
        actions.click(getClickMe()).build().perform();
    }
    public String doubleClickMessage() {
        String s = getDoubleClickMessage().getText();
        return s;
    }
    public String rightClickMessage() {
        String s = getRightClickMessage().getText();
        return s;
    }
    public String clickMessage() {
        String s = getClickMessage().getText();
        return s;
    }
}
