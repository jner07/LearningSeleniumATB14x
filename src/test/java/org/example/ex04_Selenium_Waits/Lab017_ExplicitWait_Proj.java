package org.example.ex04_Selenium_Waits;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab017_ExplicitWait_Proj extends CommonToAll {

    @Description("TC to verify the MakeMy Trip pop closes by explicit wait")
    @Owner("Jayesh")
    @Test

    public void ExplicitWait (){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://www.makemytrip.com/");

        //Explicit Wait > this will wait for the element to be visible (given xpath)
        waitforVisibility(driver, 3, "//span[@data-cy=\"closeModal\"]");

        WebElement closePopup = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        closePopup.click();

        closeBrowser(driver);

    }

}
