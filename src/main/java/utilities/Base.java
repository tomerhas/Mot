package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import pageObjects.LineNumber;
import pageObjects.MainObjects;
import pageObjects.OriginDestination;



public  abstract class Base {
 

  
	protected static WebDriver driver;
	public OriginDestination   origindestination ;
	public WaitTo wait;
	public MainObjects mainobjects ; 
	public LineNumber linenumber;
  
	

public WebDriver getDriver() {
    return driver;
}
	

public void initOriginDestination()
{
	origindestination = PageFactory.initElements(driver, OriginDestination.class);
}


public void initWait()
{
	wait = PageFactory.initElements(driver,WaitTo.class);
}


public void initMainObjects()
{
	mainobjects = PageFactory.initElements(driver,MainObjects.class);
}



public void initLineNumber()
{
	linenumber = PageFactory.initElements(driver,LineNumber.class);
}

	
	
/*  @BeforeMethod
  public void createDriver()  {
	  
	      System.setProperty("webdriver.chrome.driver", "c:/selenium/chromedriver.exe");

	      driver = new ChromeDriver();
		  driver.navigate().to("http://tnuawebtst:8089");
		  driver.manage().window().maximize();
		  //origindestination = PageFactory.initElements(driver, OriginDestination.class);
	  	  //  main = PageFactory.initElements(driver, Main.class);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		  

  }*/
@Parameters({ "browser" })

@BeforeMethod
  
	  

	public void createDriver ( @Optional("Chrome") String browser) {
		//try {
			if (browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "c:/selenium/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("ie")) {
				
				//System.setProperty("webdriver.ie.driver",
					//	"C:/Selenium/MicrosoftWebDriver.exe");
				
				System.setProperty("webdriver.edge.driver",
						"C:/Selenium/MicrosoftWebDriver.exe");
				driver = new  EdgeDriver();
				//DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
				//capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
				//driver = new InternetExplorerDriver();
				//clearLocalStorage();
				 //js.executeScript(String.format("window.localStorage.clear();"));
				//driver.execute_script(window.localStorage.clear(););
				
				//driver.manage().deleteAllCookies();
				
				
				
				
	/*		}
		
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());*/
		}
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  driver.navigate().to("http://tnuawebtst:8089");
		  driver.manage().window().maximize();
		  //origindestination = PageFactory.initElements(driver, OriginDestination.class);
	  	  //  main = PageFactory.initElements(driver, Main.class);
		  
		
		
		
	}
	
	
	
	
	      
public void clearLocalStorage() {
	JavascriptExecutor js = (JavascriptExecutor)driver; 
	js.executeScript(String.format("window.localStorage.clear();"));
  }



  
  
  
  @AfterMethod
  public void afterMethod() {
	  
	  
	    if (driver != null){
	        try{
	            driver.quit();
	        }
	        catch (WebDriverException e) {
	            System.out.println("***** CAUGHT EXCEPTION IN DRIVER TEARDOWN *****");
	            System.out.println(e);
	        }
	    }
  }

}
