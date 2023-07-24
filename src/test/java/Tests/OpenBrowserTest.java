package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class OpenBrowserTest extends BaseTest {

//    //Locators
//    //Select Sign in Home Page
//    @FindBy(xpath = "/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
//    WebElement SignIn;
//
//    //Email
//    @FindBy(xpath = "//input[@id='email']")
//    WebElement Email;
//
//    //Password
//    @FindBy(xpath = "//fieldset[@class='fieldset login']//input[@id='pass']")
//    WebElement Password;
//
//    //Click On signin Btn
//    @FindBy(xpath = "//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")
//    WebElement SignInBtn;
//
//
//    //Actions Buttons
//
//    //Click on Signin
//    public void ClickOnSignIn()
//    {
//        SignIn.click();
//    }
//
//    //Click on email
//    public void ClickOnEmail()
//    {
//        Email.sendKeys("mdmasumalam0413@gmail.com");
//    }
//
//    //click on password
//    public void ClickOnPassword()
//    {
//        Password.sendKeys("1234567098@Ranju");
//    }
//
//    //click on SignInBtn
//    public void ClickOnSignInBtn()
//    {
//        SignInBtn.click();
//    }

    @Test(priority = 1)
    public void ValidatingHomePageTitle() throws IOException {

        //Expected Title For Assertion
        String ExpectedTitle= "Home Page";
        String ActualTitle = driver.getTitle();
        Assert.assertEquals(driver.getTitle(),ExpectedTitle);
        System.out.println("The Title Of the Home Page is same as Expected : " +ActualTitle);

        }


    @Test(priority = 2)
    public void CreateAccount() throws IOException {

        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mdmasumalam0413@gmail.com");
        driver.findElement(By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']")).sendKeys("1234567098@Ranju");
        driver.findElement(By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")).click();




        //Expected Title For Assertion
        String ExpectedTitle= "Home Page";
        String ActualTitle = driver.getTitle();
        Assert.assertEquals(driver.getTitle(),ExpectedTitle);
        System.out.println("The Title Of the Home Page is same as Expected : " +ActualTitle);

    }

    }



