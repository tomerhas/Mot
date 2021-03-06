package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import utilities.Base;

public class MainObjects extends Base  {
	
	
	public static  WebDriver driver ;
	public static  WebElement element;
	
	
	public MainObjects (WebDriver driver){
		
		this.driver=driver;
		
		
		
	}
	
	
	
	
	
	
	@FindBy(how = How.CLASS_NAME, using = "btnClearHeb1")
	public static  WebElement buttonClear ;
	
	
	@FindBy(how = How.ID, using = "bydestSearchButton")
	public static  WebElement buttonSearch ;
	
	@FindBy(how = How.CLASS_NAME, using = "btnSwitchDirection1")
	public static  WebElement buttonSwitchDirection ;
	
	

	
	@FindBy(how = How.CLASS_NAME, using = "SearchTabWrapper1")
	public static  WebElement tabLineNumber ;
	
	
	
	@FindBy(how = How.CLASS_NAME, using = "userMessage")
	@CacheLookup
	public static  WebElement userMessage ;
	
	
	@FindBy(how = How.XPATH, using = "/html/body[@class='rtl ng-scope']/div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front common-dialog-wrapper ui-draggable']/div")
	public static  WebElement userMessage1 ;
	
	
	public static WebElement  buttonSwitchDirection ( WebDriver driver ){
		
		  element = driver.findElement(By.className("btnSwitchDirection1"));
		return element;
		
	}
	
	
	
	
	 public static void  clickSwitch (){
			
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
		  //WebElement element = driver.findElement(By.className("btnSwitchDirection1"));
		  executor.executeScript("arguments[0].click();", MainObjects.buttonSwitchDirection(driver));
				
			}


}
