package test.java.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.java.FrameworkCore.AndroidManager;

public class WelcomePage {

    private WebDriver driver= AndroidManager.driver;

    public WelcomePage()
    {
        PageFactory.initElements(driver,this);
    }

    // Splash Screen
    @FindBy(how= How.XPATH,using="//android.widget.RelativeLayout")
    public WebElement SplashScreen;

    //Buttons
    @FindBy(how= How.XPATH,using="//android.widget.TextView[@resource-id='com.videofizz.fizz:id/welcome_textview_signin']")
    public WebElement Button_SignIn;

    @FindBy(how= How.XPATH,using="")
    public WebElement Button_Explore;

    @FindBy(how= How.XPATH,using="")
    public WebElement Button_IWasAskedToSendAVideo;

}
