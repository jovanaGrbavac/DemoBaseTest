package Pages.ElementsTests;

import DemoBase.BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
        driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(1) > div > div.avatar.mx-auto.white > svg")).click();
        driver.findElement(By.cssSelector("#item-1 > span")).click();
    }

    @Test
    public void testCheckBoxSelectOffice() throws InterruptedException {
        checkBox.arrow1Click();
        Thread.sleep(5000);
        checkBox.arrow3Click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)", "");

        checkBox.officeCheckBoxClick();
        Thread.sleep(2000);

        Assert.assertEquals(checkBox.getResult(), "You have selected :\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general");
    }
}
