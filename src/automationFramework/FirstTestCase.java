package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {
 
 public static void main(String[] args) throws InterruptedException  {
 
 // Create a new instance of the Firefox driver
 WebDriver driver = new FirefoxDriver();
 
        //Launch the Online Store Website
 driver.get("https://cddirector.io");
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website cddirector.io");
 
 //Wait for 5 Sec
 Thread.sleep(30000);
 
        // Close the driver
        driver.quit();
    }
}