package org.example.ex03_Selenium_XPath;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

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


        closeBrowser(driver);

    }

}
