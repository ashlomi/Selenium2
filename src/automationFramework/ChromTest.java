package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromTest {

	public static void main(String[] args) throws InterruptedException { 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://cddirector.io");

WebElement cddLogin = driver.findElement(By.id("menu-item-512"));
cddLogin.click();
WebElement cddUsername = driver.findElement(By.id("username"));
cddUsername.sendKeys("shlas01@ca.com");;
WebElement nextButton = driver.findElement(By.className("center"));
nextButton.submit();

//Wait for 5 Sec
// Thread.sleep(5000);
		 
// Close the driver
//		 driver.quit();

	}

}
