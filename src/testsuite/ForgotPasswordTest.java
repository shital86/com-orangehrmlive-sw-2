package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";//base Url

    @Before //setUp the browser
    public void setUP() {
        openBrowser(baseUrl);//launch Url
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click();//click on forgot your password link
        String expectedtext = "Forgot Your Password?";//expected result
        WebElement actualtext = driver.findElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));
        String actualText = actualtext.getText();//use .getText() method
        System.out.println(actualText);
        //verifying expected and actual result by Assert
        Assert.assertEquals("Verify the text ‘Forgot Your Password?’", expectedtext, actualText);

    }

}
