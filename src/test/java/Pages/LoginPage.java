package test.java.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.java.FrameworkCore.AndroidManager;

public class LoginPage {

    private WebDriver driver= AndroidManager.driver;
    public LoginPage()
    {
        PageFactory.initElements(driver,this);
    }

    //Text fields
    @FindBy(how= How.XPATH,using="//android.widget.EditText[@resource-id='com.videofizz.fizz:id/email_edit_text']")
    public WebElement TextBox_Email;

    @FindBy(how= How.XPATH,using="//android.widget.EditText[@resource-id='com.videofizz.fizz:id/password_edit_text']")
    public WebElement TextBox_Password;

    @FindBy(how= How.XPATH,using="//android.widget.EditText[@text='Phone or Email' and @resource-id='com.facebook.katana:id/(name removed)']")
    public WebElement TextBox_FacebookEmail;

    @FindBy(how= How.XPATH,using="//android.widget.EditText[@text='Password' and @resource-id='com.facebook.katana:id/(name removed)']")
    public WebElement TextBox_FacebookPassword;

    //Buttons
    @FindBy(how= How.XPATH,using="//android.widget.Button[@resource-id='com.videofizz.fizz:id/signin_button']")
    public WebElement Button_Signin;

    @FindBy(how= How.XPATH,using="//android.widget.Button[@resource-id='com.videofizz.fizz:id/buttonFacebookLogin']")
    public WebElement Button_SigninwithFacebook;

    @FindBy(how= How.XPATH,using="//android.widget.Button[@text='LOG IN' and @resource-id='com.facebook.katana:id/(name removed)']")
    public WebElement Button_FacebookLogin;

    @FindBy(how=How.XPATH,using="//android.widget.Button[@resource-id='u_0_9']")
    public WebElement Button_FacebookContinue;

    //Messages
    @FindBy(how= How.XPATH,using="//android.widget.TextView[@text='Email or password is incorrect.']")
    public WebElement Message_EmailorPasswordisIncorrect;


}
