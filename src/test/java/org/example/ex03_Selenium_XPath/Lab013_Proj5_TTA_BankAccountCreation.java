package org.example.ex03_Selenium_XPath;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Lab013_Proj5_TTA_BankAccountCreation extends CommonToAll {

    @Description("To create an account on TTA bank ")
    @Owner("Jayesh")
    @Test

    public void Account_Creation(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://tta-bank-digital-973242068062.us-west1.run.app/");

        WebElement signup_button = driver.findElement(By.xpath("//button[text()='Sign Up']"));
        signup_button.click();

         WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
         username.sendKeys("Jayesshh neyo");

        WebElement emailAddress = driver.findElement(By.xpath("//input[@type='email']"));
        emailAddress.sendKeys("jayesh123@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("hospital@123");

        customWait(2000);

        WebElement createButton = driver.findElement(By.xpath("//button[text()='Create Account']"));
        createButton.click();

        customWait(2000);

        WebElement dashboard = driver.findElement(By.xpath("//h1[text()='Dashboard']"));
        Assert.assertEquals(dashboard.getText(), "Dashboard");

        WebElement TransferFundButton = driver.findElement(By.xpath("//button[text()='Transfer Funds']"));
        TransferFundButton.click();

        customWait(1000);

        WebElement ManageBenf_button = driver.findElement(By.xpath("//button[text()='Manage Beneficiaries']"));
        ManageBenf_button.click();

        customWait(2000);

        List<WebElement> fullname = driver.findElements(By.xpath("//input[@type='text']"));
       fullname.get(0).sendKeys("Yoo Yoo");

        List<WebElement> BankName = driver.findElements(By.xpath("//input[@type='text']"));
        fullname.get(1).sendKeys("HDFT bank");

        List<WebElement> accountNum = driver.findElements(By.xpath("//input[@type='text']"));
        fullname.get(2).sendKeys("360258972038");

        WebElement savebenf_button = driver.findElement(By.xpath("//button[text()='Save Beneficiary']"));
        savebenf_button.click();



        closeBrowser(driver);

    }

}
