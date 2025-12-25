package org.example.ex01_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Lab005_Assertion_testNG {

    @Description ("Open the URL")
    @Test

    public void test_selenium01(){
        WebDriver  driver = new ChromeDriver();
        driver.get("https://google.com");


        //TestNG
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");

        //AsserJ validation
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");

        driver.quit();
    }

}
