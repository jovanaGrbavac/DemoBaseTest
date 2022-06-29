package Pages.ElementsTests;

import DemoBase.BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicPropertiesTest extends BasePage {
    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
        driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(1) > div > div.avatar.mx-auto.white > svg")).click();
        js.executeScript("window.scrollBy(0,300)", "");
        driver.findElement(By.cssSelector("#item-8 > span")).click();
    }

    @Test
    public void testVisibleAfter() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(true, dynamicProperties.getVisibleAfter().isDisplayed());
    }

    @Test
    public void testEnabledAfter() throws InterruptedException {
        Thread.sleep(6000);
        Assert.assertEquals(true, dynamicProperties.getEnableAfter().isEnabled());
        //dugme je enabled tek posle 6 sekundi
    }

    //promenu boje uraditi preko css-a
}
