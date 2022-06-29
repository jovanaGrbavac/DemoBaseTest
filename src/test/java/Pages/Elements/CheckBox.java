package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {
    public final String url = "https://demoqa.com/";
    public WebDriver driver;
    public WebDriverWait wdWait;


    public CheckBox(WebDriver driver, WebDriverWait wdWait) {
        this.driver = driver;
        this.wdWait = wdWait;
    }

    public By arrow1 = By.cssSelector("#tree-node > ol > li > span > button > svg > path");
    public By arrow2 = By.cssSelector("#tree-node > ol > li > ol > li:nth-child(1) > span > button > svg");
    public By arrow3 = By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > span > button > svg > path");
    public By workSpaceCheckBox = By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg");
    public By officeCheckBox = By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(2) > span > label > span.rct-checkbox > svg");
    public By homeCheckBox = By.cssSelector("#tree-node > ol > li > span > label > span.rct-checkbox > svg");
    public By stringResult = By.id("result");

    public WebElement getArrow1(){
        return driver.findElement(arrow1);
    }
    public WebElement getArrow2(){
        return driver.findElement(arrow2);
    }
    public WebElement getArrow3(){
        return driver.findElement(arrow3);
    }
    public WebElement getWorkSpaceCheckBox(){
        return driver.findElement(workSpaceCheckBox);
    }
    public WebElement getOfficeCheckBox(){
        return driver.findElement(officeCheckBox);
    }
    public WebElement getHomeCheckBox(){
        return driver.findElement(homeCheckBox);
    }
    public WebElement stringResult(){
        return driver.findElement(stringResult);
    }

    public void arrow1Click(){
        Actions actions = new Actions(driver);
        actions.click(getArrow1()).build().perform();
    }
    public void arrow2Click(){
        Actions actions = new Actions(driver);
        actions.click(getArrow2()).build().perform();
    }
    public void arrow3Click(){
        Actions actions = new Actions(driver);
        actions.click(getArrow3()).build().perform();
    }
    public void workSpaceCheckBoxClick() {
        Actions actions = new Actions(driver);
        actions.click(getWorkSpaceCheckBox()).build().perform();
    }
    public void officeCheckBoxClick() {
        Actions actions = new Actions(driver);
        actions.click(getOfficeCheckBox()).build().perform();
    }
    public void homeCheckBoxClick() {
        Actions actions = new Actions(driver);
        actions.click(getHomeCheckBox()).build().perform();
    }
    public String getResult() {
        String s = stringResult().getText();
        return s;
    }
}
