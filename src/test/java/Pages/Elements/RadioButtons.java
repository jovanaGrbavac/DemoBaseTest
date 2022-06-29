package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtons {
    public final String url = "https://demoqa.com/";
    public WebDriver driver;
    public WebDriverWait wdWait;

    public RadioButtons(WebDriver driver, WebDriverWait wdWait) {
        this.driver = driver;
        this.wdWait = wdWait;
    }

    public By radioButtonElement = By.cssSelector("#item-2 > span");
    public By yes = By.id("yesRadio");
    public By impressive = By.id("impressiveRadio");
    public By no = By.id("noRadio");
    public By yesMessage = By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > p");
    public By impressiveMessage = By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > p");

    public WebElement getRadioButtonElement() {
        return driver.findElement(radioButtonElement);
    }
    public WebElement getYes() {
        return driver.findElement(yes);
    }
    public WebElement getImpressive() {
        return driver.findElement(impressive);
    }
    public WebElement getNo() {
        return driver.findElement(no);
    }
    public WebElement getYesMessage() {
        return driver.findElement(yesMessage);
    }
    public WebElement getImpressiveMessage() {
        return driver.findElement(impressiveMessage);
    }

    public void yesButtonClick() {
        Actions actions = new Actions(driver);
        actions.click(getYes()).build().perform();
    }
    public void impressiveButtonClick() {
        Actions actions = new Actions(driver);
        actions.click(getImpressive()).build().perform();
    }
    public String getYesMessageText() {
       String s = getYesMessage().getText();
       return s;
    }
    public String getImpressiveMessageText() {
        String s = getImpressiveMessage().getText();
        return s;
    }




}
