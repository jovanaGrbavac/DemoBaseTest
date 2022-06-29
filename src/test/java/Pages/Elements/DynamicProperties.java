package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicProperties {
    public final String url = "https://demoqa.com/";
    public WebDriver driver;
    public WebDriverWait wdWait;

    public DynamicProperties(WebDriver driver, WebDriverWait wdWait) {
        this.driver = driver;
        this.wdWait = wdWait;
    }

    public By dynamicPropertiesElement = By.cssSelector("#item-8 > span");
    public By enableAfter = By.id("enableAfter");
    public By colorChange = By.id("colorChange");
    public By visibleAfter = By.id("visibleAfter");

    public WebElement getDynamicPropertiesElement(){
        return driver.findElement(dynamicPropertiesElement);
    }
    public WebElement getEnableAfter() {
        return driver.findElement(enableAfter);
    }
    public WebElement getColorChange(){
        return driver.findElement(colorChange);
    }
    public WebElement getVisibleAfter(){
        return driver.findElement(visibleAfter);
    }


}
