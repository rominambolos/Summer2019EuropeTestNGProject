package com.cybertek.tests.day3_webElement_Intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLchanged {
    /**
     * First we need to check manually if it works
     * open browser
     * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
     * enter any email
     * click on Retrieve password
     * verify that url changed to http://practice.cybertekschool.com/email_sent
     */
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //go to  http://practice.cybertekschool.com/forgot_password Link
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any email
        WebElement emailInput = driver.findElement(By.name("email"));

        //sendKeys()--> send keyboard actions to webelement/enters given text
        emailInput.sendKeys("email@gmail.com");

        //click retrieve password
        WebElement retrievePasswordButton= driver.findElement(By.id("form_submit"));
                retrievePasswordButton.click();

        String actualUrl =driver.getCurrentUrl();
        final String expectedUrl ="http://practice.cybertekschool.com/email_sent";

        if(actualUrl.equals(expectedUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actualUrl = "+ actualUrl);
            System.out.println("expectedUrl = "+ expectedUrl);
        }
        driver.quit();


    }

}
