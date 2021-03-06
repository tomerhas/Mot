package workFlows;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import extensiones.SelectFrom;
import extensiones.Split;
import pageObjects.LineNumber;
import pageObjects.MainObjects;
import pageObjects.OriginDestination;
import utilities.Base;

public class LineNumberFlow  extends Base {
	
	
	public static WebDriver driver ;
	
	public static void  typeDestFromCity ( String origin ) {
		
		LineNumber.byLineFromCity.click();	
		LineNumber.byLineFromCity.sendKeys(origin);
		LineNumber.byLineFromCity.sendKeys(Keys.ENTER);
	
	}
	
	
	//   public static void selectDate (String date ){
		   
		   
		 //  SelectFrom.selectFromList( LineNumber.bylineDateSelect ,date);
		   
		   
	 //  }
	   
	   
	   
	   public static String  getTextFromMessageNoServiceInSaturday (String symbol)  {
		   
		 String[] parts = Split.splitText(MainObjects.userMessage, symbol );
		 String part1 = parts[0];
		 String part2=parts[1];
		 return part1+part2;
		   
		  
		   
	   }
	   
	   
	   
	   public static void  clickDatesMessage ( List<WebElement> list , String text  )  {
		   
		   
		   list.get(SelectFrom.getIndexBy(list, text)).click();
		   
		   
		   
	   }
	   
	   
	   
	   
	   public static void  typeLineNum( String text  )  {
		   
		   LineNumber.lineNumCombo.click();
		   LineNumber.lineNumList.sendKeys(text);
		   LineNumber.lineNumList.sendKeys(Keys.ENTER);
		   
		   
	   }
	   
	   
	
	   
	   
	  
	   

	   
	   
	   

}


  
