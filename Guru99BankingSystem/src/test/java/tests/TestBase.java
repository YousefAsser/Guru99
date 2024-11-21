package tests;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestBase {
 
WebDriver driver;
String BaseURL = "https://demo.guru99.com/V2/index.php";

String BaseURL2 = "https://demo.guru99.com/V2/webpages/Managerhomepage.php";

  @BeforeTest
  public void beforeTest() {
	 driver = new ChromeDriver();
	 driver.navigate().to(BaseURL);
	 
  }

  @AfterTest
  public void closeWebsite() {
	 driver.close();
	  
  }


}
