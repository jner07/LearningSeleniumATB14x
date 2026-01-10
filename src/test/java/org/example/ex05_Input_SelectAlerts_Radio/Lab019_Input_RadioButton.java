package org.example.ex05_Input_SelectAlerts_Radio;

import io.qameta.allure.Description;
import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab019_Input_RadioButton extends CommonToAll {

    @Description("TC to handle radio button, input box")
    @Test

    public void RadioInput(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://awesomeqa.com/practice.html");

        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("Jayesh Automation QA");

        WebElement GenderRadio = driver.findElement(By.xpath("//input[@id='sex-0']"));
        GenderRadio.click();

        WebElement Tools = driver.findElement(By.xpath("//input[@id='tool-0']"));
        Tools.click();

        closeBrowser(driver);

    }


}
