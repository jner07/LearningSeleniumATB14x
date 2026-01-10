package org.example.ex04_Selenium_Waits;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class Lab018_FluentWait {
    @Description("TC for Explicit Wait")
    @Owner("Jayesh")
    @Test

    public void explicitWait (){

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());


        WebElement email_input =  driver.findElement(By.id("login-username"));
        email_input.sendKeys("admin@admin.com");

        WebElement password_input =  driver.findElement(By.name("password"));
        password_input.sendKeys("Password123");

        WebElement submit_button = driver.findElement(By.id("js-login-btn"));
        submit_button.click();

        //Fluent Wait
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        WebElement errorMessage = wait.until(
                new Function<WebDriver, WebElement>() {
                    @Override
                    public WebElement apply(WebDriver webDriver) {
                        return driver.findElement(By.className("notification-box-description"));
                    }
                }
        );

        WebElement error_Message = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_Message.getText());

        Assert.assertEquals(errorMessage.getText(), "Your email, password, IP address or location did not match");


    }

}


