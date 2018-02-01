package extensiones;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Assertiones {

	

	
	
	
	
	public  static void  assertValueExists ( WebElement element ,  String expected   ) 
	
	{
		
		Assert.assertEquals   ( ReadText.getText(element ),expected);
		
		
	}
	
	
	
	
	
	
}
