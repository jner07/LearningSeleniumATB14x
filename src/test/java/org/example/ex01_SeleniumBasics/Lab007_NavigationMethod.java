package org.example.ex01_SeleniumBasics;

import io.qameta.allure.Description;
import org.example.CommonToAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab007_NavigationMethod extends CommonToAll {

    @Description ("navigation method")
    @Test

    public void test_navigate() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
       openBrowser(driver, "https://google.com");

        driver.navigate().to("https://bing.com");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().forward();

        closeBrowser(driver);
    }


}
