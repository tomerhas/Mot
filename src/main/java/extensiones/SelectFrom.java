package extensiones;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

import pageObjects.LineNumber;
import utilities.Base;

public class SelectFrom   {
	
	
	static String optionIndex;


	
	public static void select ( WebElement element , String value )  {
		
		Select select = new Select(element);
		
		
		
		
	}
	
	
	
	public static void  selectFromList(List<WebElement> list ,WebElement element ,String text){
		
		
		Select select = new Select(element);
		//getIndexBy(list,text);
		select.selectByIndex(getIndexBy( list , text ));
		
			}
	
	
		public static int  getIndexBy(List<WebElement> list , String text   ) {
	  

	    for (WebElement date: list) {
	        if (date.getText().contains(text)) {
	            int  optionIndex = list.indexOf(date);
	           				return  optionIndex;
	           					            				       					        			
	           					           				
					                   }
	      	      	    }
	    return 350;
	}
	
	
	
	
}
	 
	 
