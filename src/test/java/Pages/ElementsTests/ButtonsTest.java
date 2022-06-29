package Pages.ElementsTests;

import DemoBase.BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
        driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(1) > div > div.avatar.mx-auto.white > svg")).click();
        js.executeScript("window.scrollBy(0,300)", "");
        driver.findElement(By.cssSelector("#item-4 > span")).click();
    }

    @Test
    public void doubleClickTest() {
        buttons.doubleClick();
        Assert.assertEquals(buttons.doubleClickMessage(), "You have done a double click");
    }
    @Test
    public void rightClickTest() {
        buttons.rightClick();
        Assert.assertEquals(buttons.rightClickMessage(), "You have done a right click");
    }
 /*   @Test
    public void clickTest() throws InterruptedException {
        Thread.sleep(5000);
        buttons.clickMe();
        Assert.assertEquals(buttons.clickMessage(), "You have done a dynamic click");
        //resiti dynamic click preko driver.findElements(buttons).get(3).click();
    } */

    @AfterMethod
    public void aftermethod() {
        driver.quit();
    }
}
