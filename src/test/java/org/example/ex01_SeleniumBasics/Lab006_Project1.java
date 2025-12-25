package org.example.ex01_SeleniumBasics;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.example.CommonToAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab006_Project1 extends CommonToAll {

    @Description ("TC1 > verify the particular text is available on website")
    @Link
    @Test

    public void test_verify_text(){
        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://katalon-demo-cura.herokuapp.com");
        if (driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("✅ TEST CASE PASSED");
            Assert.assertTrue(true);
        }else {
            System.out.println("❌ TEST CASE FAILED");
            Assert.assertTrue(false);

        }
        closeBrowser(driver);

    }
}
