package pages;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HandleAlertandReturnHome extends PageBase {
	 public HandleAlertandReturnHome(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void handAlertAndRetHome() throws InterruptedException {
	       
 
	        // Switch to the alert
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.alertIsPresent());
   
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	    Thread.sleep(3000); // Allow time for navigation

	     
	    }
	public void handAlertAndRetHome1() throws InterruptedException {
		
		    // Switch to the alert
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    wait.until(ExpectedConditions.alertIsPresent());
	   
		    Alert alert = driver.switchTo().alert();
		    alert.accept();
		    Thread.sleep(3000); // Allow time for navigation


			     
			    }
}
