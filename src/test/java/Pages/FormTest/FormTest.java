package Pages.FormTest;

import DemoBase.BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FormTest extends BasePage {

    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver.navigate().to(url);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
        driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(2) > div > div.card-up")).click();
        js.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(2000);

    }


    @Test
    public void practiceFormsOpened () {
        studentRegistrationForm.getPracticeForm().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/automation-practice-form");
    }

    @Test
    public void nameInputs () {
        practiceFormsOpened();
        WebElement name = studentRegistrationForm.getFirstName();
        name.sendKeys("Aca");
        WebElement lastName = studentRegistrationForm.getLastName();
        lastName.sendKeys("Traj");
        Assert.assertEquals(name.getAttribute("value"), "jovana");
        Assert.assertEquals(lastName.getAttribute("value"), "jovana");
    }
    @Test
    public void emailInput () {
        practiceFormsOpened();
        WebElement mail = studentRegistrationForm.getEmail();
        mail.sendKeys("qwe@jh.com");
        Assert.assertEquals(mail.getAttribute("value"), "qwe@jh.com");
    }
    @Test
    public void maleBtnClick () {
        practiceFormsOpened();
        WebElement mbtn = studentRegistrationForm.getMaleBtn();
        if (!mbtn.isSelected()) {
            mbtn.click();
        }
    }


    @Test
    public void phoneNmbrInput () {
        practiceFormsOpened();
        WebElement phone = studentRegistrationForm.getPhoneNmbr();
        phone.sendKeys("1234567891");
        Assert.assertEquals(phone.getAttribute("value"), "1234567891");
    }

    @Test
    public void datePickerPop () {
        practiceFormsOpened();
        WebElement date = studentRegistrationForm.getBirthDate();
        date.click();
        WebElement datePicker = studentRegistrationForm.getDatePicker();
        Assert.assertTrue(datePicker.isDisplayed());
    }


}
