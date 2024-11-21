package pages;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MethodsGeneration extends PageBase{

	public MethodsGeneration(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//public String customerId ;
	//xpath= "/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input"
	@FindBy(name = "cusid")
	WebElement CustomerId;
	
			
	@FindBy  (name="AccSubmit")
	WebElement SubmitBtn2;
	
	@FindBy  (name="res")
	WebElement ResetBtn2;
	//after entering customer id
	 @FindBy(name="city")
		WebElement City	; 
	 @FindBy(name="sub")
		public WebElement SubmitBtn; 
	 //Delete customer
	 @FindBy (name="cusid")
		WebElement CustomerID;
		@FindBy  (name="AccSubmit")
		WebElement SubmitBtn3;
		
		@FindBy  (name="res")
		WebElement ResetBtn3;
		public WebElement SubmitBtn1; 
		//new account
		@FindBy (name="cusid")
		WebElement CustomerID2;
		
		@FindBy  (name="inideposit")
		WebElement initailDeposit;
		
		@FindBy (css = "body > table > tbody > tr > td > table > tbody > tr:nth-child(3) > td:nth-child(2) > select")
		WebElement AccountType;
		
		
		@FindBy  (name="button2")
		WebElement SubmitBtn4;
		
		//Edit Account
		@FindBy (name="accountno")
		WebElement AccountNo;
		
		@FindBy  (name="AccSubmit")
		WebElement SubmitBtn5;
		//delete account

	  	 @FindBy (name="accountno")
	  		WebElement AccountNo1;
	  	 
	  		@FindBy  (name="AccSubmit")
	  		WebElement SubmitBtn6;
	  		
	  		@FindBy  (name="res")
	  		WebElement ResetBtn4;
	  //BalanceEnquiry
	  		 @FindBy (name="accountno")
		  		WebElement AccountNo2;
		  	@FindBy  (name="AccSubmit")
		  		WebElement SubmitBtn7;
	//MiniStatement
		  		 @FindBy (name="accountno")
			  		WebElement AccountNo3;
			  	@FindBy  (name="AccSubmit")
			  		WebElement SubmitBtn8;	
	//Custom Statement
			  		 @FindBy (name="accountno")
				  		WebElement AccountNo4;
				  	@FindBy  (name="fdate")
				  		WebElement FromData;	
				  	@FindBy  (name="tdate")
				  		WebElement ToData;	
				  	@FindBy  (name="amountlowerlimit")
				  		WebElement Mini_value;	
				  	@FindBy  (name="numtransaction")
				  		WebElement No_of_trans;	
				  	@FindBy  (name="AccSubmit")
				  		WebElement SubmitBtn9;
		
	public void handling1Alert_1() throws InterruptedException {
		
	Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		
 // Get the alert text
	String alertText = alert.getText();
	System.out.println("Full Alert Text: " + alertText);
		Thread.sleep(3000);

// Extract customer ID
      String extractedCustomerId = alertText.split(":")[1].trim().replaceAll("[^0-9]", "");
        System.out.println("Extracted Customer ID: " + extractedCustomerId);

     // Set the customerId in TestBase
        AddNewCustomer.setCustomerId(extractedCustomerId); // Fully qualified class name

         alert.accept();
  	   Thread.sleep(3000);
 
  	   	 
}
	//Extract New account ID
	public void handling1Alert_2() throws InterruptedException {
		
		Alert alert = driver.switchTo().alert();
			Thread.sleep(3000);
			
	 // Get the alert text
		String alertText = alert.getText();
		System.out.println("Full Alert Text: " + alertText);
			Thread.sleep(3000);

	// Extract account ID
	      String extractedAccountId = alertText.split(":")[1].trim().replaceAll("[^0-9]", "");
	        System.out.println("Extracted Account ID: " + extractedAccountId);

	     // Set the accountId in TestBase
	        AddNewCustomer.setAccountId(extractedAccountId); // Fully qualified class name

	         alert.accept();
	  	   Thread.sleep(3000);
	  	   	 
	}
	
	public void SubmitEditCustomerData() throws InterruptedException {
		
 {
     String customerId = AddNewCustomer.getCustomerId(); // Retrieve from TestBase
	 System.out.println("Sending Customer ID: " + customerId);
	 
// Wait for the CustomerId input field to be visible and enabled
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(CustomerId));
	 
// Clear the input field before sending keys
	    CustomerId.clear();

// Send the extracted customer ID
	 	CustomerId.sendKeys(customerId);
	 	 	
 // Log to confirm sending of the customer ID
        System.out.println("Customer ID sent: " + customerId);

 
		
// Click the submit button after entering the Customer ID
		SubmitBtn2.click();
 // Fill in the city field
		 City.clear();
		 City.sendKeys("Zamalak");
		 SubmitBtn.click();
 }
	    }
 public void SubmitDeletCustomerData() throws InterruptedException {
		
	 {
	     String customerId = AddNewCustomer.getCustomerId(); // Retrieve from TestBase
		 System.out.println("Sending Customer ID: " + customerId);
		 
	// Wait for the CustomerId input field to be visible and enabled
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    wait.until(ExpectedConditions.visibilityOf(CustomerID));
		 
	// Clear the input field before sending keys
		    CustomerID.clear();

	// Send the extracted customer ID
		    CustomerID.sendKeys(customerId);
		 	 	
	 // Log to confirm sending of the customer ID
	        System.out.println("Customer ID sent: " + CustomerID);

	 
			
	// Click the submit button after entering the Customer ID
			SubmitBtn3.click();
		    
		    }}
 public void SubmitNewAccountData() throws InterruptedException {
		
	 {
		 
	     String customerId = AddNewCustomer.getCustomerId(); // Retrieve from TestBase
		 System.out.println("Sending Account ID: " + customerId);
		 
	// Wait for the CustomerId input field to be visible and enabled
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    wait.until(ExpectedConditions.visibilityOf(CustomerID2));
		 
	// Clear the input field before sending keys
		    CustomerID2.clear();

	// Send the extracted customer ID
		    CustomerID2.sendKeys(customerId);
		 	 	
	 // Log to confirm sending of the customer ID
	        System.out.println("Account ID sent: " + customerId);
//Select Account type
	        Select makeAccountList = new Select(AccountType);
			makeAccountList.selectByValue("Savings");
			//Deposit any amount of money
			initailDeposit.sendKeys("50000");
	// Click the submit button after entering the Customer ID
			SubmitBtn4.click();
		
		    
		    }}
 
	public void SubmitEditAccountData() throws InterruptedException {
		
{
  String accountId = AddNewCustomer.getCustomerId(); // Retrieve from TestBase
	 System.out.println("Sending Account ID: " + accountId);
	 
//Wait for the CustomerId input field to be visible and enabled
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(AccountNo));
	 
//Clear the input field before sending keys
	    AccountNo.clear();

//Send the extracted customer ID
	    AccountNo.sendKeys(accountId);
	 	 	
// Log to confirm sending of the customer ID
     System.out.println("Account ID sent: " + accountId);


		
//Click the submit button after making the account ID
		SubmitBtn5.click();
}
	    }
	public void SubmitDeletAccountData() throws InterruptedException {
		
		 {
		     String accountId = AddNewCustomer.getAccountId(); // Retrieve from TestBase
			 System.out.println("Sending Account ID: " + accountId);
			 
		// Wait for the AccountId input field to be visible and enabled
			    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			    wait.until(ExpectedConditions.visibilityOf(AccountNo1));
			 
		// Clear the input field before sending keys
			    AccountNo1.clear(); 	

		// Send the extracted customer ID
		  		AccountNo1.sendKeys(accountId);
			 	 	
		 // Log to confirm sending of the customer ID
		        System.out.println("Account ID sent: " + accountId);

		 
				
		// Click the submit button after entering the Customer ID
		        SubmitBtn6.click();
			    
			    }}
	public void SubmitBalanceEnquiryData() throws InterruptedException {
		
		 {
		     String accountId = AddNewCustomer.getAccountId(); // Retrieve from TestBase
			 System.out.println("Sending Account ID: " + accountId);
			 
		// Wait for the AccountId input field to be visible and enabled
			    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			    wait.until(ExpectedConditions.visibilityOf(AccountNo2));
			 
		// Clear the input field before sending keys
			    AccountNo2.clear();   
			  
		// Send the extracted customer ID
		  		AccountNo2.sendKeys(accountId);
			 	 	
		 // Log to confirm sending of the customer ID
		        System.out.println("Account ID sent: " + accountId);

		 
				
		// Click the submit button after entering the Customer ID
		        SubmitBtn7.click();
			    
			    }}
	public void SubmitMiniStatementData() throws InterruptedException {
		
		 {
		     String accountId = AddNewCustomer.getAccountId(); // Retrieve from TestBase
			 System.out.println("Sending Account ID: " + accountId);
			 
		// Wait for the AccountId input field to be visible and enabled
			    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			    wait.until(ExpectedConditions.visibilityOf(AccountNo3));
			 
		// Clear the input field before sending keys
			    AccountNo3.clear();  
			  
		// Send the extracted customer ID
		  		AccountNo3.sendKeys(accountId);
			 	 	
		 // Log to confirm sending of the customer ID
		        System.out.println("Account ID sent: " + accountId);

		 
				
		// Click the submit button after entering the Customer ID
		        SubmitBtn8.click();
			    
			    }}
	public void SubmitCustomStatementData() throws InterruptedException {
		
		 {
		     String accountId = AddNewCustomer.getAccountId(); // Retrieve from TestBase
			 System.out.println("Sending Account ID: " + accountId);
			 
		// Wait for the AccountId input field to be visible and enabled
			    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			    wait.until(ExpectedConditions.visibilityOf(AccountNo4));
			 
		// Clear the input field before sending keys
			    AccountNo4.clear();  		  
		// Send the extracted customer ID
		  	AccountNo4.sendKeys(accountId);
			 	 	
		 // Log to confirm sending of the customer ID
		        System.out.println("Account ID sent: " + accountId);

		 //Enter from & to dates
		      FromData.sendKeys("15");
		      FromData.sendKeys("01");
		      FromData.sendKeys(Keys.TAB);
		      FromData.sendKeys("2001");
		        ToData.sendKeys("29");
		        ToData.sendKeys("11");
		        ToData.sendKeys(Keys.TAB);
		        ToData.sendKeys("2024");
		//Enter mini.value & no.of trans.
		        Mini_value.sendKeys("6000");
		           No_of_trans.sendKeys("6");
		// Click the submit button after entering the Customer ID
		        SubmitBtn9.click();
			    
			    }}
	 

	
	}

