package test.java.FrameworkCore;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityFunctionManager {
    public void waitForLoad()
    {
        try
        {
            WebDriverWait wait = new WebDriverWait(AndroidManager.driver,75000);
            //  wait.until(webDriver ->  ((JavascriptExecutor)WebBrowserManager.driver).executeScript("return document.readyState").equals("complete"));
        }
        catch (Exception ex){
        }
    }
    public void waitUntilElementDisplayed(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(AndroidManager.driver,60000);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void JsExecutorclick(WebElement element) {
        //  ((JavascriptExecutor)WebBrowserManager.driver).executeScript("arguments[0].click();", element);

        String js = "arguments[0].click();";

// Execute the Java Script for the element which we find out
        ((JavascriptExecutor) AndroidManager.driver).executeScript(js, element);
    }
}
