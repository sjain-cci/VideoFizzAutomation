package test.java.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.java.FrameworkCore.AndroidManager;

public class HomePage {
    private WebDriver driver= AndroidManager.driver;

    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }

    //Buttons
    @FindBy(how= How.XPATH,using="//android.widget.ImageView[@resource-id='com.videofizz.fizz:id/settings_image']")
    public WebElement Button_Settings;

}
