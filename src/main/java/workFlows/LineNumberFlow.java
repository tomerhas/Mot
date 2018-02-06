package workFlows;

import org.openqa.selenium.Keys;

import pageObjects.OriginDestination;

public class LineNumberFlow {
	
	public static void  typeDestFromCity ( String origin ) {
		
		OriginDestination.byDestFromCity.click();	
		OriginDestination.byDestFromCity.sendKeys(origin);
		OriginDestination.byDestFromCity.sendKeys(Keys.ENTER);
	
	}

}
