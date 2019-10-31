package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getUrlAndTitle {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cybertekschool.com");

        String title = driver.getTitle();

        //soutv will print the title
        System.out.println("title = " + title);

        //gets current url
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //gets page source
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);








    }
}
