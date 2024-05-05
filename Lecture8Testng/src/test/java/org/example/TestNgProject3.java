package org.example;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

/**
 * Hello world!
 *
 */
public class TestNgProject3
{
    @Test
    public void testFunction() throws MalformedURLException, InterruptedException
    {
        // automator capabilities and settings
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("MobileTesting");
        options.autoGrantPermissions();
        options.setCapability("platformName", "Android");
        options.setCapability("platformVersion", "14");
        options.setCapability("automationName", "UIAutomator2");
        options.setCapability("noreset", "false");
        options.setCapability("newCommandTimeout", 1000*5); // 5 seconds timeout
        options.setApp("/home/mobeen/IdeaProjects/untitled/src/test/Resource/Android-MyDemoAppRN.1.3.0.build-244.apk");

        AndroidDriver driver = new AndroidDriver(new URL("http://192.168.0.107:4723/"), options);

        // Click on backpack product
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"store item text\" and @text=\"Sauce Labs Backpack\"]")).click();

        // select blue color
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"blue circle\"]/android.view.ViewGroup")).click();
        // Add item to cart
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Add To Cart\"]")).click();

        // Open cart
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"cart badge\"]/android.widget.ImageView")).click();

        // Add another product. click on plus btn
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"counter plus button\"]/android.widget.ImageView")).click();
        // Click on Proceed to checkout btn
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Proceed To Checkout\"]")).click();

        // * Login Screen
        // Username
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Username input field\"]")).sendKeys("bob@example.com");
        // password
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Password input field\"]")).sendKeys("10203040");
        // Click login btn
        driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Login\"])[2]")).click();

        // * Fill the form details
        // Full Name
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Full Name* input field\"]")).sendKeys("Mobeen Ahmed");
        // Address Line 1
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Address Line 1* input field\"]")).sendKeys("Example address 123");
        // City
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"City* input field\"]")).sendKeys("Tronto");
        // zip code
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Zip Code* input field\"]")).sendKeys("87421");
        //Country
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Country* input field\"]")).sendKeys("Pakistan");


        // Click on to Payment btn
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"To Payment\"]")).click();


        // * Payment Screen
        // Full Name Field
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Full Name* input field\"]")).sendKeys("Mobeen Ahmed");
        // Card Number
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Card Number* input field\"]")).sendKeys("325812657568789");
        // expiration date
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Expiration Date* input field\"]")).sendKeys("0325");
        // security code
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Security Code* input field\"]")).sendKeys("123");
        // click on review order btn
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Review Order\"]")).click();

        // Click on place order btn
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Place Order\"]")).click();

        // click on continue shopping btn
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Continue Shopping\"]")).click();





    }
}
