package Pages.BookStoreApplication;

import DemoBase.BasePage.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BasePage {
    @BeforeMethod
    public void setUp() {

        driver.navigate().to(url);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)", "");

        login.BookStoreCardClick();

    }

    @Test
    public void testLogin() throws InterruptedException {
        Thread.sleep(2000);
        login.loginClick();
        login.sendUsername("jovana");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");

        login.sendPassword("Jovana123!");
        login.loginClick();
        Thread.sleep(2000);

        Assert.assertEquals(login.getUserNameValue().getText(), "jovana");

    }
}
