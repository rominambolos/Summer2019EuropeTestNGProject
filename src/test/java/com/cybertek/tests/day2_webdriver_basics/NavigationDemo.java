package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {

        //setting up the driver
        WebDriverManager.chromedriver().setup();

        //import class CMD+ENTER or ALT+ENTER or Control+Space
        WebDriver driver =new ChromeDriver();

        //navigate to website
        driver.get("https://www.amazon.com");


        driver.navigate().to("https://www.facebook.com");

        //goes back to previous webpage
        driver.navigate().back();

        //click the forward button on the browser
        driver.navigate().forward();

        //refresh the page
        driver.navigate().refresh();




    }


}
