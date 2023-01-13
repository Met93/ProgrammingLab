package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        //1-Setting up the web driver manager
        //We create our"Browser Driver"
        WebDriverManager.chromedriver().setup();
        //2- create instance of the chrome driver
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");
        //.get("url") this method gets the given url on an already opened browser


    }
}
