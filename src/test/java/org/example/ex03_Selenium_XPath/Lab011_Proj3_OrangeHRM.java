package org.example.ex03_Selenium_XPath;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonTypeInfo;
import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab011_Proj3_OrangeHRM extends CommonToAll {

    private static final Logger log = LoggerFactory.getLogger(Lab011_Proj3_OrangeHRM.class);

    @Owner("jayesh")
    @Description ("This is TC to automate the ORANGE HRM website")
    @Test

    public void Orange_HRM (){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://awesomeqa.com/hr/web/index.php/auth/login");

        System.out.println(driver.getCurrentUrl());

        customWait(1000);

        WebElement username_box = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        username_box.sendKeys("admin");

        WebElement password_box = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        password_box.sendKeys("Hacker@4321");

        customWait(2000);

        WebElement login_button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        login_button.click();

        customWait(3000);

        WebElement text_verify = driver.findElement(By.xpath("//h6[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]"));

        Assert.assertEquals(text_verify.getText(), "PIM");
//        Assert.assertTrue(true);


        closeBrowser(driver);
    }


}

//input[@name="username"]
//input[@name="password"]
//button[@type="submit"]
//h6[@class="oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module"]
