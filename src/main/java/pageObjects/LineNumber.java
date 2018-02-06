package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utilities.Base;

public class LineNumber extends Base {
	
	
	@FindBy(how = How.ID, using = "bylineFromCityCombo")
	public static  WebElement byLineFromCity ;
	
	
	

}
