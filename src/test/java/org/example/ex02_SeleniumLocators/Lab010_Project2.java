package org.example.ex02_SeleniumLocators;

import io.qameta.allure.Description;
import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab010_Project2 extends CommonToAll {

    @Test
    @Description ("Test case for Free Trial button and error check on login")

    public void Free_trial_errorPage() {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://app.vwo.com/");

        //clicking the free trial button
        WebElement Start_free_trial = driver.findElement(By.linkText("Start a free trial"));
        Start_free_trial.click();

        //Entering invalid email
        WebElement email_id = driver.findElement(By.id("page-v1-step1-email"));
        email_id.sendKeys("vwdbvb@");

        //Clicking the terms checkbox
        WebElement checkbox = driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        checkbox.click();

        //Button of create account
        WebElement CreateButton = driver.findElement(By.tagName("button"));
        CreateButton.click();

        //checking error message on screen
        WebElement ErrorMessage = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(ErrorMessage.getText(), "The email address you entered is incorrect.");


        closeBrowser(driver);

    }


}
