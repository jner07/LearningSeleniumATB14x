package org.example.ex04_Selenium_Waits;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.PublicKey;
import java.time.Duration;

public class Lab016_ExplicitWait {

    @Description("TC for Explicit Wait")
    @Owner("Jayesh")
    @Test

    public void explicitWait (){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");

        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());


        WebElement email_input =  driver.findElement(By.id("login-username"));
        email_input.sendKeys("admin@admin.com");

        WebElement password_input =  driver.findElement(By.name("password"));
        password_input.sendKeys("Password123");

        WebElement submit_button = driver.findElement(By.id("js-login-btn"));
        submit_button.click();

        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-notification-box-msg")));

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());

        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");


    }

}
