package workFlows;

import org.openqa.selenium.WebDriver;
import pageObjects.MainObjects;
import utilities.Base;

public class MainFlow  extends Base  {

	public static WebDriver driver ;
	
	public static void  clickSearch (){
		
		MainObjects.buttonSearch.click();
		
		
	}
	
	
/*	 public static void  clickSwitch (){
			
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
		  //WebElement element = driver.findElement(By.className("btnSwitchDirection1"));
		  executor.executeScript("arguments[0].click();", MainObjects.buttonSwitchDirection(driver));
				
			}*/
	 
	 
	 public static void  clickclear (){
			
		 MainObjects.buttonClear.click();
				
				
			}
	 
	 
	 
	 public static void clickTabLineNumber () {
		 
		 MainObjects.tabLineNumber.click();
		 
		 
	 }
	 
	 
	 
	
	
	
	
	
	
	
	
	
}
