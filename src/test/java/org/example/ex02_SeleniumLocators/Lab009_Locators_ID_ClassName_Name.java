package org.example.ex02_SeleniumLocators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab009_Locators_ID_ClassName_Name extends CommonToAll {

    @Description ("TC1 > validate invalid login error message")
    @Owner("Jayesh Ner")
    @Severity(SeverityLevel.BLOCKER)
    @Test

    public void test_vwo_invalid (){
        //<input type="email"
        // class="text-input W(100%)"
        // name="username"
        // vwo-html-translate-attr="placeholder"
        // vwo-html-translate-placeholder="login:enterEmailID"
        // id="login-username"
        // data-qa="hocewoqisi"
        // placeholder="Enter email ID">

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://app.vwo.com");

        WebElement email_input =  driver.findElement(By.id("login-username"));
        email_input.sendKeys("admin@admin.com");

        //<input type="password"
        // class="text-input W(100%)"
        // vwo-html-translate-attr="placeholder"
        // vwo-html-translate-placeholder="login:enterPassword"
        // name="password" id="login-password"
        // data-qa="jobodapuxe"
        // placeholder="Enter password">

        WebElement password_input =  driver.findElement(By.name("password"));
        password_input.sendKeys("Password123");

        WebElement submit_button = driver.findElement(By.id("js-login-btn"));
        submit_button.click();

        customWait(3000);

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());

        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");

        closeBrowser(driver);

    }

}
