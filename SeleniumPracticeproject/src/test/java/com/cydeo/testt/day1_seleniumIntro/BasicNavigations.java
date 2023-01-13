package com.cydeo.testt.day1_seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //1-Setup the browser driver
        WebDriverManager.chromedriver().setup();
        //2-Create instance of the Selenium Webdriver
        //This is line opening an empty browser
        WebDriver driver=new ChromeDriver();
        //3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");
        String currentTitle=driver.getTitle();
        //Stop code execution for 3 seconds
        sleep(3000);

        // use selenium to navigate back
        driver.navigate().back();
        //driver.navigate().wait();
        //use selenium to navigate forward
        Thread.sleep(3000);
        driver.navigate().forward();
        //use navigate().to()
        driver.navigate().to("https://www.google.com");
        currentTitle=driver.getTitle();
        // get the tiitle of the page
        System.out.println("driver.getTitle()= "+driver.getTitle());
        currentTitle=driver.getTitle();
        System.out.println("currentTitle= "+currentTitle);

        // get the current url using selenium
        String currentURL=driver.getCurrentUrl();
        System.out.println("currentURL= "+currentURL);
        driver.manage().window().maximize();
        //maximizes the currently opened browser
        //this effect(maximazing) will happen on the line we call this method

        //driver.manage().window().fullscreen();
        //this one sometimes does not work for windows, so better not use it.

        //this will close the currently opened window
        driver.close();

        //this will close all of the opened windows
        driver.quit();


    }
}
