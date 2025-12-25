package org.example.ex01_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab004_Max_Min {

    @Test
    public void test_1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
//        driver.manage().window().maximize();
        driver.manage().window().minimize();

        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle(),"Google");

        driver.quit();
    }
}
