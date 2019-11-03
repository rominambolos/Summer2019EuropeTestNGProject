package com.cybertek.tests.day3_webElement_Intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {
    /**
     * Verify confirmation message
     * open browser
     * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
     * enter any email
     * verify that email is displayed in the input box
     * click on Retrieve password
     * verify that confirmation message says 'Your e-mail's been sent!'
     */

    public static void main(String[] args) throws InterruptedException {

        //open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

       //get browser
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter an email
        WebElement  emailInputBox = driver.findElement(By.name("email"));

        String expectedEmail = "test@gmail.com";

        //send expectedEmail
        emailInputBox.sendKeys( expectedEmail );

        //verify that email is displayed in the input box
        //getting text from webelements
        //getText()--> get text from the web element
        //getAttribute()-->get value of attributes
        String actualEmail = emailInputBox.getAttribute("value");

        if(expectedEmail.equals(actualEmail)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
            System.out.println("expectet email: " +expectedEmail);
            System.out.println("actual email: " + actualEmail);
        }

        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        //verify that confirmation message says 'Your e-mail's been sent!'
        String expectedMessage = "Your e-mail's been sent!";

       WebElement messageElement = driver.findElement(By.name("confirmation_message"));
       String actualMessage = messageElement.getText();
       if(expectedMessage.equals(actualMessage)){
           System.out.println("pass");
       }else{
           System.out.println("fail");
           System.out.println("expected message = " + expectedMessage);
           System.out.println("actual message = " + actualMessage);
       }
       Thread.sleep(3000);
       driver.quit();

    }
}
