package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;


public class AddNewCustomer extends PageBase {
	private static String customerId; // Store customerId here
	private static String accountId; // Store customerId here

	public AddNewCustomer(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name="name")
	WebElement CustomerName; 
	
	@FindBy(css="body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)")
	WebElement GenderRadioBtn; 
	
	 @FindBy(name="city")
	WebElement City	; 
	    
    @FindBy(id="dob") /**/
	WebElement DateOfBirth; 
    
    @FindBy(name="addr")
	WebElement Address;  
    
    @FindBy(name="state")
	WebElement State; 
    @FindBy(name="pinno")
	WebElement Pin; 
    
    @FindBy(name="telephoneno")
	WebElement MobileNumber; 
    
    @FindBy(name="emailid")
	WebElement Email; 
    
    @FindBy(name="sub")
	public WebElement SubmitBtn; 
    
    @FindBy(name="res")
	WebElement ResetBtn; 
    
    //Edit list
   // @FindBy  (xpath= "/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
	//WebElement CustomerId1;
	
			
//	@FindBy  (name="AccSubmit")
//	WebElement SubmitBtn2;
	
//	@FindBy  (name="res")
//	WebElement ResetBtn2;
	
    
public void SubmitNewCustomer() {
	CustomerName.sendKeys("Yousef Asser");
	GenderRadioBtn.click();
	
	DateOfBirth.sendKeys("15");
	DateOfBirth.sendKeys("02");
	DateOfBirth.sendKeys(Keys.TAB);
	DateOfBirth.sendKeys("1980"); 	
    Address.sendKeys("Naser City");
    City.sendKeys("Cairo");
    State.sendKeys("Helio");
    Pin.sendKeys("123456");
    MobileNumber.sendKeys("01090908050");
    Email.sendKeys("yousef.asser252@gmail.com");
    SubmitBtn.click();
  
}



public static String getCustomerId() {
    return customerId; // Retrieve the customer ID
}


public static void setCustomerId(String id) {
    customerId = id; // Set the customer ID
}

public static String getAccountId() {
    return accountId; // Retrieve the customer ID
}


public static void setAccountId(String id) {
	accountId = id; // Set the customer ID
}

}



