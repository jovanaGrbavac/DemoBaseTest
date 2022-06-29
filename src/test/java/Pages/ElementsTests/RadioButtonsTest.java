package Pages.ElementsTests;

import DemoBase.BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonsTest extends BasePage {
    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
        driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(1) > div > div.avatar.mx-auto.white > svg")).click();
        js.executeScript("window.scrollBy(0,300)", "");
        driver.findElement(By.cssSelector("#item-2 > span")).click();
    }

    @Test
    public void testYessButtonClick() {
        radioButton.yesButtonClick();
        Assert.assertEquals(radioButton.getYesMessageText(), "You have selected Yes");
    }

    @Test
    public void testImpressiveButton() {
        radioButton.impressiveButtonClick();
        Assert.assertEquals(radioButton.getImpressiveMessageText(), "You have selected Impressive");
    }
}
