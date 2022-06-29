package Pages.ElementsTests;

import DemoBase.BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTest extends BasePage {
    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
    }

    @Test
    public void testTextBox() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");

        WebElement kartica = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]"));
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.click(kartica).build().perform();
        Thread.sleep(1000);
        WebElement webElement = driver.findElement(By.id("item-0"));
        actions.click(webElement).build().perform();
        textBox.getFullName().sendKeys("jovana jovana");
        Thread.sleep(1000);
        textBox.getEmail().sendKeys("asd@bvc.com");
        Thread.sleep(1000);
        textBox.getCurrentAddress().sendKeys("djsgfjsvdfjh 351");
        Thread.sleep(1000);
        textBox.getPermanentAddress().sendKeys("dchdjcvdjvc");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)", "");
        textBox.clickSubmitButton();
        Assert.assertEquals(textBox.submitText(), "Name:jovana jovana\n" +
                "Email:asd@bvc.com\n" +
                "Current Address :djsgfjsvdfjh 351\n" +
                "Permananet Address :dchdjcvdjvc");

    }


}
