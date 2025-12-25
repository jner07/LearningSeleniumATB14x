package org.example.ex03_Selenium_XPath;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Lab012_Proj4_XpathFunctions extends CommonToAll {

    private static final Logger log = LoggerFactory.getLogger(Lab012_Proj4_XpathFunctions.class);

    @Description ("TC to verify Xpath functions on Cura Demo")
    @Owner("Jayesh")
    @Test

    public void Cura_demo(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://katalon-demo-cura.herokuapp.com");

        WebElement make_appoitment = driver.findElement(By.xpath("//a[text()='Make Appointment']"));
        make_appoitment.click();

        customWait(1000);

        List<WebElement> username_box = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        username_box.get(1).sendKeys("John Doe");

        WebElement password_box = driver.findElement(By.xpath("//input[@id='txt-password']"));
        password_box.sendKeys("ThisIsNotAPassword");

        customWait(1000);

        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
        loginButton.click();

        WebElement MakeApptBtn = driver.findElement(By.xpath("//h2[text()='Make Appointment']"));
        Assert.assertEquals(MakeApptBtn.getText(),"Make Appointment");

        closeBrowser(driver);
    }
}


//a[text()='Make Appointment']  >> full text match
//*[text()='Make Appointment']  >> full text match, using Start (ALL)
//a[normalize-space()='Make Appointment'] >> removes whitespaces while search
//a[contains(text()='Make App')] >> partial text search
//a[starts-with(@id,"btn-make")] >> this will find all tags that starts with " "
//a[starts-with(@aria-label,'Amazon.in')] >>try this example