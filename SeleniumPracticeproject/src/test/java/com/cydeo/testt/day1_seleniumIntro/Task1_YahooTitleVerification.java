package com.cydeo.testt.day1_seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //Make our page fulls
        driver.manage().window().maximize();
        driver.get("https://www.yahoo.com");
        String currentTitle= driver.getTitle();
        System.out.println("currentTitle= "+driver.getTitle());

        String expectedTitle="Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        //actual title comes from the browser
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected verification Passed");
        }else{
            System.out.println("FAILED");
        }
    }
}
