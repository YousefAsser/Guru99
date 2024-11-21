package tests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.AddNewCustomer;
import pages.MethodsGeneration;
import pages.HandleAlertandReturnHome;
import pages.HomePage;
public class NewCustomerTest extends TestBase {
	
	
	AddNewCustomer addObject;
	HomePage homeObject;
	HandleAlertandReturnHome editObject;
	MethodsGeneration AllertObject;
	
	@BeforeMethod
	public void initilizeObject() {
		//strating the test with i/p data 

		homeObject = new HomePage (driver);
		addObject = new AddNewCustomer(driver);
		AllertObject = new MethodsGeneration(driver);
		editObject = new HandleAlertandReturnHome(driver);
		
		}
  @Test (priority = 1)
  public void NewCustomerData() throws InterruptedException {
	  
	  //to open new customer tab
  homeObject.OpenNew_Customer();	   
	  Thread.sleep(3000);
	  
	  addObject.SubmitNewCustomer();
		Thread.sleep(3000);
		AllertObject.handling1Alert_1();
		
// Log the customerId after extraction
   String customerId = AddNewCustomer.getCustomerId();
     System.out.println("Customer ID after creation: " + customerId);
  }
  
  @Test (priority = 2, dependsOnMethods = "NewCustomerData")
  public void Edit_Customer() throws InterruptedException {
	  
	  //to open edit customer tab
	  homeObject.OpenEdit_Customer();
	  Thread.sleep(3000);
	  
	   // Ensure customer ID has been set in the previous test
	   String customerId = AddNewCustomer.getCustomerId();	
       System.out.println("Customer ID retrieved for editing: " + customerId);
      
	   Assert.assertNotNull("Customer ID should not be null", customerId);

	//to enter edit customer tab data
	  AllertObject.SubmitEditCustomerData();
driver.navigate().to(BaseURL2);
  //editObject.handAlertAndRetHome();
 //  Assert.assertTrue(driver.getPageSource().contains("Edit Customer Form")); 
	   Thread.sleep(3000);
  }

  
  @Test (priority = 4, dependsOnMethods = "New_Account")
  public void Edit_Account() throws InterruptedException {
	  
	  // Open edit account tab
	    homeObject.OpenEdit_Account(); 
	    Thread.sleep(3000);

	    // Ensure customer ID is not null
	    String accountId = AddNewCustomer.getAccountId();
	    System.out.println("Account ID retrieved for deletion: " + accountId);

	    Assert.assertNotNull("Account ID should not be null", accountId);

	    // Submit new account data
	    AllertObject.SubmitEditAccountData();
	    
	    // Assertion to verify successful deletion
	  //  Assert.assertTrue(driver.getPageSource().contains("Customer deleted successfully")); // Example
	    editObject.handAlertAndRetHome();
  }
  @Test (priority = 3, dependsOnMethods = "Edit_Customer")
  public void New_Account() throws InterruptedException {
	  
	  // Open new account tab
	    homeObject.OpenNew_Account(); 
	    Thread.sleep(3000);

	    // Ensure customer ID is not null
	    String customerId = AddNewCustomer.getCustomerId();
	    System.out.println("Customer ID retrieved for deletion: " + customerId);

	    Assert.assertNotNull("Customer ID should not be null", customerId);

	    // Submit new account data
	    AllertObject.SubmitNewAccountData();
	    
	    AllertObject.handling1Alert_2(); 
	 // Log the customerId after extraction
	    String AccountId = AddNewCustomer.getAccountId();
	      System.out.println("Customer ID after creation: " + AccountId);
  }
 //, dependsOnMethods = "Edit_Account"
  @Test (priority = 5)
  public void Balance_Enquiry() throws InterruptedException {
	  
	  // Open balance enquiry tab
	    homeObject.OpenBalance_Enquiry(); 
	    Thread.sleep(3000);

	    // Ensure Account ID is not null
	    String accountrId = AddNewCustomer.getAccountId();
	    System.out.println("Account ID retrieved for deletion: " + accountrId);

	    Assert.assertNotNull("Account ID should not be null", accountrId);

	    // Submit balance enquiry data
	    AllertObject.SubmitBalanceEnquiryData();
	    //handle alret and return back
	    Thread.sleep(3000);
	    driver.navigate().to(BaseURL2);
	    Thread.sleep(3000);
	   // editObject.handAlertAndRetHome1(); 
	 
  }
  @Test (priority = 6)
  public void Mini_statement() throws InterruptedException {
	  
	  // Open mini statement tab
	    homeObject.OpenMini_Statement(); 
	    Thread.sleep(3000);

	    // Ensure Account ID is not null
	    String accountrId = AddNewCustomer.getAccountId();
	    System.out.println("Account ID retrieved for deletion: " + accountrId);

	    Assert.assertNotNull("Account ID should not be null", accountrId);

	    // Submit mini statemen data
	    AllertObject.SubmitMiniStatementData();
	    //handle alret and return back
	    Thread.sleep(3000);
	    driver.navigate().to(BaseURL2);
	    Thread.sleep(3000);
	   // editObject.handAlertAndRetHome1(); 
  }
  @Test (priority = 7)
  public void Custom_Statement() throws InterruptedException {
	  
	  // Open mini statement tab
	    homeObject.OpenCustomized_Statement(); 
	    Thread.sleep(3000);

	    // Ensure Account ID is not null
	    String accountrId = AddNewCustomer.getAccountId();
	    System.out.println("Account ID retrieved for deletion: " + accountrId);

	    Assert.assertNotNull("Account ID should not be null", accountrId);

	    // Submit mini statemen data
	    AllertObject.SubmitCustomStatementData();
	    //handle alret and return back
	    Thread.sleep(3000);
	    driver.navigate().to(BaseURL2);
	    Thread.sleep(3000);
	   // editObject.handAlertAndRetHome1(); 
  }

  @Test (priority = 8)
  public void Delete_Customer() throws InterruptedException {
	  
	  // Open Delete customer tab
	    homeObject.OpenDelete_Customer();  // Ensure this method exists
	    Thread.sleep(3000);

	    // Ensure customer ID is not null
	    String customerId = AddNewCustomer.getCustomerId();
	    System.out.println("Customer ID retrieved for deletion: " + customerId);

	    Assert.assertNotNull("Customer ID should not be null", customerId);

	    // Submit delete customer data
	    AllertObject.SubmitDeletCustomerData();
	    
	    // Assertion to verify successful deletion
	  //  Assert.assertTrue(driver.getPageSource().contains("Customer deleted successfully")); // Example
	    editObject.handAlertAndRetHome();
  }
  @Test (priority = 9)
  public void Delete_Account() throws InterruptedException {
	  
	  // Open delete account tab
	    homeObject.OpenDelete_Account(); 
	    Thread.sleep(3000);

	    // Ensure Account ID is not null
	    String accountrId = AddNewCustomer.getAccountId();
	    System.out.println("Account ID retrieved for deletion: " + accountrId);

	    Assert.assertNotNull("Account ID should not be null", accountrId);

	    // Submit delete account data
	    AllertObject.SubmitDeletAccountData();
	    //handle alret and return back
	    editObject.handAlertAndRetHome1(); 
	    driver.navigate().to(BaseURL2);
	 
  }
  @Test (priority = 10)
  public void LogOut() throws InterruptedException {
	  
	  // Open mini statement tab
	    homeObject.Click_LogOut(); 
	    Thread.sleep(3000);
		  editObject.handAlertAndRetHome1();
	 
  }
  
}
