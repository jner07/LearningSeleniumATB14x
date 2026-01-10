package org.example.ex03_Selenium_XPath;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab014_Proj6_TTA_BankAddBeneficiery extends CommonToAll {

    @Description("TC to add the beneficiery to account")
    @Owner("Jayesh")
    @Test

    public void add_beneficiery (){
        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://tta-bank-digital-973242068062.us-west1.run.app/");

        WebElement emailAddress = driver.findElement(By.xpath("//input[@type='email']"));
        emailAddress.sendKeys("jayesh123@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("hospital@123");

        customWait(5000);

        WebElement signinbutton = driver.findElement(By.xpath("//button[@type='submit']"));
        signinbutton.click();


        closeBrowser(driver);
    }

}
