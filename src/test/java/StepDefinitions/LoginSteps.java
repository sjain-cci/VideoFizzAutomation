package test.java.StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.java.FrameworkCore.AndroidManager;
import test.java.FrameworkCore.AssertionManager;
import test.java.FrameworkCore.UtilityFunctionManager;
import test.java.Pages.HomePage;
import test.java.Pages.LoginPage;
import test.java.Pages.SettingsPage;


public class LoginSteps {

    AndroidDriver driver = AndroidManager.driver;
    LoginPage loginpage = new LoginPage();
    HomePage homePage = new HomePage();
    SettingsPage settingsPage = new SettingsPage();
    UtilityFunctionManager utilityFunctions = new UtilityFunctionManager();
    WebDriverWait wait = new WebDriverWait(driver, 120);

    @And("^I enter valid email id in the \"([^\"]*)\" field$")
    public void iEnterValidEmailIdInTheField(String arg0) throws NullPointerException {

        utilityFunctions.waitUntilElementDisplayed(loginpage.TextBox_Email);
        loginpage.TextBox_Email.clear();
        loginpage.TextBox_Email.sendKeys("test23@gmail.com");
    }

    @And("^I enter valid password in the \"([^\"]*)\" field$")
    public void iEnterValidPasswordInTheField(String arg0) throws NullPointerException {

        loginpage.TextBox_Password.sendKeys("cci123");
    }


    @Then("^I should be logged in successfully$")
    public void iShouldBeLoggedInSuccessfully() throws Throwable {

        utilityFunctions.waitUntilElementDisplayed(homePage.Button_Settings);
        homePage.Button_Settings.click();
        utilityFunctions.waitUntilElementDisplayed(settingsPage.Textbox_Email);
        String locator= driver.findElementByXPath("//android.widget.EditText[@resource-id='com.videofizz.fizz:id/settings_email_edit_text']").getText();
        AssertionManager.CompareString("test23@gmail.com",locator);


    }


    @And("^I enter invalid email id in the \"([^\"]*)\" field$")
    public void iEnterInvalidEmailIdInTheField(String arg0) throws Throwable {
        utilityFunctions.waitUntilElementDisplayed(loginpage.TextBox_Email);
        loginpage.TextBox_Email.clear();
        loginpage.TextBox_Email.sendKeys("test24@gmail.com");
    }

    @Then("^I should see a validation message \"([^\"]*)\"$")
    public void iShouldSeeAValidationMessage(String arg0) throws Throwable {
        switch(arg0){
            case "Email or password is incorrect":
                utilityFunctions.waitUntilElementDisplayed(loginpage.Message_EmailorPasswordisIncorrect);
                AssertionManager.Displayed(loginpage.Message_EmailorPasswordisIncorrect);
                break;
            case "Wrong email format":

                break;
        }
    }

    @And("^I enter invalid password in the \"([^\"]*)\" field$")
    public void iEnterInvalidPasswordInTheField(String arg0) throws Throwable {
        loginpage.TextBox_Password.sendKeys("cci12345");
    }

    @And("^I enter email id of invalid format in the \"([^\"]*)\" field$")
    public void iEnterEmailIdOfInvalidFormatInTheField(String arg0) throws Throwable {
        utilityFunctions.waitUntilElementDisplayed(loginpage.TextBox_Email);
        loginpage.TextBox_Email.clear();
        loginpage.TextBox_Email.sendKeys("test23gmail.com");
    }

    @And("^I enter the facebook account details to login$")
    public void iEnterTheFacebookAccountDetailsToLogin() throws Throwable {

        utilityFunctions.waitUntilElementDisplayed(loginpage.TextBox_FacebookEmail);
        loginpage.TextBox_FacebookEmail.sendKeys("cc.claracooper@gmail.com");
        loginpage.TextBox_FacebookPassword.sendKeys("cci12345");
        loginpage.Button_FacebookLogin.click();
    }


    @And("^I tap on \"([^\"]*)\" button$")
    public void iTapOnButton(String arg0) throws Throwable {

        utilityFunctions.waitUntilElementDisplayed(loginpage.Button_FacebookContinue);
        loginpage.Button_FacebookContinue.click();
    }

    @Then("^I should be logged in successfully with facebook account$")
    public void iShouldBeLoggedInSuccessfullyWithFacebookAccount() throws Throwable {
        utilityFunctions.waitUntilElementDisplayed(homePage.Button_Settings);
        homePage.Button_Settings.click();
        utilityFunctions.waitUntilElementDisplayed(settingsPage.Textbox_Email);
        String locator= driver.findElementByXPath("//android.widget.EditText[@resource-id='com.videofizz.fizz:id/settings_email_edit_text']").getText();
        AssertionManager.CompareString("cc.claracooper@gmail.com",locator);

    }


}
