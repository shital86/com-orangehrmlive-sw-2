package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";//base Url

    @Before //setUp the browser
    public void setUP() {
        openBrowser(baseUrl);//launch Url
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");//entering username in username field
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin123");//entering password in password field
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        String expectedwelcometextdisplay = "Welcome Paul";//expected message
        WebElement actualwelcometextdiplay = driver.findElement(By.xpath("//a[@id='welcome']"));
        String actualWelcomeTextDisplay = actualwelcometextdiplay.getText();//use.getText() method
        System.out.println(actualWelcomeTextDisplay);
        //verifying the expected and actual result by using 'Assert'
        Assert.assertEquals("Verify the ‘Welcome’ text is display:", expectedwelcometextdisplay, actualWelcomeTextDisplay);
    }


}
