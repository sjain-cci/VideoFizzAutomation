package test.java.FrameworkCore;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class AssertionManager {
    public static void Equal(WebElement locator, String value)
    {
        Assert.assertEquals("Values does not match",value, locator.getText() );
    }

    public static void CompareString(String value1, String value2)
    {
        Assert.assertEquals("Values does not match",value1, value2);
    }

    public static void EqualByAttributeValue(WebElement locator, String value)
    {
        Assert.assertEquals("Values does not match",value, locator.getAttribute("value") );
    }


    public static void NotEqual(WebElement locator, String value)
    {
        Assert.assertNotEquals("Values were equal",value, locator.getText());
    }

    public static void Present(WebElement locator)
    {
        Assert.assertTrue("Element was not displayed",locator.isDisplayed());
    }

    public static void Enabled(WebElement locator)
    {
        Assert.assertTrue("Element was disabled",locator.isEnabled());
    }

    public static void Checked(WebElement locator)
    {
        Assert.assertTrue( "Element was not Checked",locator.isSelected());
    }


    public static void UnChecked(WebElement locator)
    {
        Assert.assertFalse("Element was checked",locator.isSelected());
    }


    public static void Disabled(WebElement locator)
    {
        Assert.assertFalse("Element was Enabled",locator.isEnabled());
    }

    public static void Displayed(WebElement locator)
    {
        Assert.assertTrue("Element was not Displayed",locator.isDisplayed());
    }

    public static void NotDisplayed(WebElement locator)
    {
        try{
            locator.isDisplayed();
            Assert.fail("Test Failed");
        }
        catch(Exception ex)
        {
            Assert.assertTrue(true);
        }

    }


    public static void CompareMaxLength(WebElement locator, String value)
    {
        Assert.assertEquals("Values do not match",value,locator.getAttribute("maxlength"));
    }

    public static void Selected(WebElement locator)
    {
        Assert.assertTrue( "Element was not selected",locator.isSelected());
    }
    public static void compareUrl(String Url)
    {
        System.out.println(AndroidManager.driver.getCurrentUrl()+"\n"+ Url);
        Assert.assertTrue("Navigated to incorrect Url",AndroidManager.driver.getCurrentUrl().contains(Url));
    }

}

