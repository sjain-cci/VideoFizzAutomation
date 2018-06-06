package test.java.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.java.FrameworkCore.AndroidManager;

public class SettingsPage {
    private WebDriver driver= AndroidManager.driver;
    public SettingsPage()
    {
        PageFactory.initElements(driver,this);
    }

    //Textfields
    @FindBy(how= How.XPATH,using="//android.widget.EditText[@resource-id='com.videofizz.fizz:id/settings_email_edit_text']")
    public WebElement Textbox_Email;

}
