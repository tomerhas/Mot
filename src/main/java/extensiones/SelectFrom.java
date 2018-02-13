package extensiones;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectFrom {
	
	
	public static void  selectFromList(WebElement element ,String text){
		
		
		Select dropdown = new Select(element);
		
		 dropdown.selectByVisibleText(text);  
		
			}
	
	
	

}
