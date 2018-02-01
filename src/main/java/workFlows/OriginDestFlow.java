package workFlows;

import org.openqa.selenium.Keys;

import pageObjects.OriginDestination;

public class OriginDestFlow {

	
	public static void  typeDestFromCity ( String origin ) {
	
		OriginDestination.byDestFromCity.click();	
		OriginDestination.byDestFromCity.sendKeys(origin);
		OriginDestination.byDestFromCity.sendKeys(Keys.ENTER);
	    
	}
	
	
	public static void  typeDestToCity (String destinition )   {
		
		
		OriginDestination.byDestToCity.click();	
		OriginDestination.byDestToCity.sendKeys(destinition);
		OriginDestination.byDestToCity.sendKeys(Keys.ENTER);
		
		
	}
	
	
	
	public static void clickplaceInOrigin() {
		
		
		OriginDestination.placeInOrigin.click();
	}
	
	
	
	
	
	
}
