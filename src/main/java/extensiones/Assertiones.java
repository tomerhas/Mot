package extensiones;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Assertiones {

	

	
		
	
	public  static void  assertValueExists ( WebElement element  , String expected   ) 
	
	{
		
		Assert.assertEquals   ( ReadText.getText(element ),expected);
		
		
	}
	
	
	public  static void  assertValueExistsString ( String actual  , String expected   ) 
	
	{
		
		Assert.assertEquals   ( actual,expected);
		
		
	}
	
	
	
}
