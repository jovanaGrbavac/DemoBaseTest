package Pages.Form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StudentRegistrationForm {
    public final String url = "https://demoqa.com/";
    public WebDriver driver;
    public WebDriverWait wdWait;

    public StudentRegistrationForm(WebDriver driver, WebDriverWait wdWait) {
        this.driver = driver;
        this.wdWait = wdWait;
    }

    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By email = By.id("userEmail");
    By maleBtn = By.className("custom-control-label");
    By femaleBtn = By.id("gender-radio-2");
    By otherBtn = By.id("gender-radio-3");
    By phone = By.id("userNumber");
    By birthDate = By.id("dateOfBirthInput");
    By subject = By.id("subjectsContainer");
    By hobby1 = By.id("hobbies-checkbox-1");
    By hobby2 = By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label");
    By hobby3 = By.id("hobbies-checkbox-3");
    By datePicker = By.className("react-datepicker-popper");
    By uploadImg = By.id("uploadPicture");
    By currentAddress = By.id("currentAddress");
    By selectState = By.cssSelector(".css-19bqh2r");
    By selectCity = By.id("city");

    By practiceForm = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li/span");
    public WebElement getFirstName () {
        return driver.findElement(firstName);
    }
    public WebElement getLastName () {
        return driver.findElement(lastName);
    }
    public WebElement getEmail () {
        return driver.findElement(email);
    }
    public WebElement getMaleBtn () {
        return driver.findElement(maleBtn);
    }
    public WebElement getFemaleBtn () {
        return driver.findElement(femaleBtn);
    }
    public WebElement getOtherBtn () {
        return driver.findElement(otherBtn);
    }
    public WebElement getPhoneNmbr () {
        return driver.findElement(phone);
    }
    public WebElement getBirthDate () {
        return driver.findElement(birthDate);
    }
    public WebElement getSubject () {
        return driver.findElement(subject);
    }
    public WebElement getHobby1 () {
        return driver.findElement(hobby1);
    }
    public WebElement getHobby2 () {
        return driver.findElement(hobby2);
    }
    public WebElement getHobby3 () {
        return driver.findElement(hobby3);
    }
    public WebElement getDatePicker () {
        return driver.findElement(datePicker);
    }
    public WebElement getUploadImg () {
        return driver.findElement(uploadImg);
    }
    public WebElement getCurrentAddress () {
        return driver.findElement(currentAddress);
    }
    public WebElement getSelectState () {
        return driver.findElement(selectState);
    }
    public WebElement getSelectCity () {
        return driver.findElement(selectCity);
    }
    public WebElement getPracticeForm () {
        return driver.findElement(practiceForm);
    }
}
