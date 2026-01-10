package org.example.ex04_Selenium_Waits;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab015_ImplicitWait {

    @Description ("TC for implicit wait")
    @Owner( "Jayesh")
    @Test

    public void implicitWait (){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://app.vwo.com");




    }
}
