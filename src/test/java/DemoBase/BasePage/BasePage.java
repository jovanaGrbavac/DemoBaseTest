package DemoBase.BasePage;

import Pages.BookStoreApplication.Login;
import Pages.Elements.*;
import Pages.Form.StudentRegistrationForm;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BasePage {
    public final String url = "https://demoqa.com/";

    public WebDriverManager wdm;
    public WebDriver driver;
    public WebDriverWait wdw;


    public TextBox textBox;
    public RadioButtons radioButton;
    public DynamicProperties dynamicProperties;
    public CheckBox checkBox;
    public Buttons buttons;
    public StudentRegistrationForm studentRegistrationForm;
    public Login login;

    @BeforeClass
    public void beforeClass() {
        wdm = new ChromeDriverManager();
        wdm.setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        textBox = new TextBox(driver, wdw);
        radioButton = new RadioButtons(driver, wdw);
        checkBox = new CheckBox(driver, wdw);
        buttons = new Buttons(driver, wdw);
        dynamicProperties = new DynamicProperties(driver, wdw);
        studentRegistrationForm = new StudentRegistrationForm(driver, wdw);
        login = new Login(driver, wdw);
    }


}
