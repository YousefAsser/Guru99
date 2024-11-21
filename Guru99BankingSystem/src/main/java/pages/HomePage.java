package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
	}
	@FindBy(name="uid")
	WebElement UserId;
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="btnLogin")
	WebElement LoginInBtn;
	
	@FindBy (css = "body > div:nth-child(6) > div > ul > li:nth-child(2) > a")
	WebElement NewCustomerTab;
	/////////second test
	
	@FindBy (css = "body > div:nth-child(6) > div > ul > li:nth-child(3) > a")
	 public WebElement EditCustomerTab;
	
	@FindBy (css = "body > div:nth-child(6) > div > ul > li:nth-child(4)")
	 public WebElement DeleteCustomerTab; 
	////new account
	@FindBy (css = "body > div:nth-child(6) > div > ul > li:nth-child(5)")
	 public WebElement NewAccountTab; 
	//Edit Account*****
	@FindBy (css = "body > div:nth-child(6) > div > ul > li:nth-child(6)")
	 public WebElement EditAccountTab;
	//Delete Account
	@FindBy (css = "body > div:nth-child(6) > div > ul > li:nth-child(7)")
	 public WebElement DeleteAccountTab;
	//Balance Enquiry all shape
	@FindBy (css = "body > div:nth-child(3) > div > ul > li:nth-child(8)")
	 public WebElement BalanceEnquiryTab;
	//Mini Statement 
	@FindBy (css = "body > div:nth-child(6) > div > ul > li:nth-child(9)")
	 public WebElement MiniStatementTab;
	//Customized Statement
	@FindBy (css = "body > div:nth-child(6) > div > ul > li:nth-child(10)")
	 public WebElement CustomizedStatementTab;
	//Log out
	@FindBy (css = "body > div:nth-child(6) > div > ul > li:nth-child(11)")
	 public WebElement LogOutTab;
	
	public void OpenNew_Customer() throws InterruptedException
	{
		UserId.sendKeys("mngr597405");
		Password.sendKeys("bYhEreg");
		Thread.sleep(3000);
		LoginInBtn.click();
		Thread.sleep(3000);
		NewCustomerTab.click();	
	}
	public void OpenEdit_Customer() throws InterruptedException
	{EditCustomerTab.click();Thread.sleep(3000);}
		
	public void OpenDelete_Customer() throws InterruptedException
	{	DeleteCustomerTab.click();	Thread.sleep(3000);}
		
	public void OpenNew_Account() throws InterruptedException
	{	NewAccountTab.click();	Thread.sleep(3000);}
	
	public void OpenEdit_Account() throws InterruptedException
	{EditAccountTab.click();Thread.sleep(3000);}
	
	public void OpenDelete_Account() throws InterruptedException
		{DeleteAccountTab.click();	Thread.sleep(3000);}
	
	public void OpenBalance_Enquiry() throws InterruptedException
	{	BalanceEnquiryTab.click();	Thread.sleep(3000);}
				
	public void OpenMini_Statement() throws InterruptedException
	{	MiniStatementTab.click();Thread.sleep(3000);}
				
public void OpenCustomized_Statement() throws InterruptedException
{CustomizedStatementTab.click();Thread.sleep(3000);}

public void Click_LogOut() throws InterruptedException
	{LogOutTab.click();Thread.sleep(3000);}	
					
	public void navigateToHomePage() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	}
