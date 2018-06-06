package test.java.StepDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import test.java.FrameworkCore.AndroidManager;
import test.java.FrameworkCore.UtilityFunctionManager;
import test.java.Pages.LoginPage;
import test.java.Pages.WelcomePage;
import java.net.MalformedURLException;


public class AccountSteps  {

    AndroidDriver driver = AndroidManager.driver;
    WelcomePage welcomePage = new WelcomePage();
    UtilityFunctionManager utilityFunctions = new UtilityFunctionManager();
    LoginPage loginPage= new LoginPage();
    //WebDriverWait wait = new WebDriverWait(driver, 60);

    @Given("^I open the Videofizz app$")
    public void iOpenTheVideofizzApp()  throws MalformedURLException, InterruptedException {

        utilityFunctions.waitUntilElementDisplayed(welcomePage.SplashScreen);
    }


    @When("^I tap on the \"([^\"]*)\" button on the \"([^\"]*)\"$")
    public void iTapOnTheButtonOnThe(String arg0, String arg1) throws Throwable {

        switch (arg0)
        {
            case "SignIn":
                utilityFunctions.waitUntilElementDisplayed(welcomePage.Button_SignIn);
                welcomePage.Button_SignIn.click();
                break;

            case "signin":
                driver.hideKeyboard();
                loginPage.Button_Signin.click();
                break;

            case "Sign in with Facebook":
                loginPage.Button_SigninwithFacebook.click();
                break;

        }

    }

}
