package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utilities.Base;

public class LineNumber extends Base {
	
	
	@FindBy(how = How.ID, using = "bylineFromCityCombo")
	public static  WebElement byLineFromCity ;
	
	
	@FindBy(how = How.ID, using = "bylineDateSelect")
	public static  WebElement bylineDateSelect ;
	
	
    @FindBy(how=How.XPATH, using="/html/body[@class='ng-scope rtl']/div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front common-dialog-wrapper ui-draggable']/div[@id='ui-id-14']/div")
	
	public static  WebElement massegeOriginNotExistsInDay ;
	
	@FindBy(how=How.XPATH, using="xpath=//a[contains(@href,'#/linenumber')")
	
	public static  WebElement dateInMassege ;
	
	
	
	

}
