package org.example.ex01_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab002_Hierarchy {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //make this instance with Webdriver so you can change the browser in between
        driver = new EdgeDriver();
        driver = new FirefoxDriver();
//this case will run the URL in all the mentioned browsers
        driver.get("https://youtube.com");


    }

}
