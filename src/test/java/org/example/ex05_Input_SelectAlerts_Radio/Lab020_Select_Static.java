package org.example.ex05_Input_SelectAlerts_Radio;

import io.qameta.allure.Description;
import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Lab020_Select_Static extends CommonToAll {

    @Description("TC to handle radio button, input box")
    @Test

    public void RadioInput(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://the-internet.herokuapp.com/dropdown");

        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);

        select.selectByVisibleText("Option 2");

        closeBrowser(driver);




}
}
