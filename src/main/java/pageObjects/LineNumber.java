package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import utilities.Base;

public class LineNumber extends Base {
	
	
	@FindBy(how = How.ID, using = "bylineFromCityCombo")
	public static  WebElement byLineFromCity ;
	
	
	@FindBy(how = How.ID, using = "bylineDateSelect")
	public static  WebElement bylineDateSelect ;
	
	//@FindAll({@FindBy(id = "bylineDateSelect")})
	//public static  List<WebElement> dates;
	

	 @FindBys({
		    @FindBy(id = "bylineDateSelect"),
		    @FindBy(tagName = "option")
		    })
		    public static List<WebElement> dates;
	 
	 
	 
	 @FindBys({
		    @FindBy(className = "userMessage"),
		    @FindBy(tagName = "a")
		    })
		    public static List<WebElement> DatesMessage;
	 
	 
	 

		@FindBy(how = How.CLASS_NAME , using = "ComboButton")
		public static  WebElement lineNumCombo ;
		
		
		@FindBy(how = How.CLASS_NAME , using = "cb_edit")
		public static  WebElement lineNumList ;
		
		
		 //@FindBy(how=How.XPATH, using="/html/body[@class='rtl ng-scope']/div[@class='MainBody  no-print']/div[@class='main-site ng-scope']/div[@class='ng-scope'][1]/div[@class='filterTabControl ']/table/tbody/tr[2]/td/div[@class='searchSubView ng-scope']/div[@class='ng-scope']/div[@class='SearchPageInnerPanel']/fieldset[@class='SearchSection2 search-panel1']/div[@class='not-padding']/div/div[@class='DisplayTableRowBreakable byLine'][1]/div[1]/div/div[3]/div[@id='lineNumberCombo']/div[@class='cb quarterList ComboPopup']/div[1]/input[@class='cb_edit autoCompleteValue ComboTextFilter ng-valid ng-touched ng-not-empty ng-dirty ng-valid-parse']")
			
			//public static  WebElement lineNumList ;
		
	
	
	
	
    @FindBy(how=How.XPATH, using="/html/body[@class='ng-scope rtl']/div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front common-dialog-wrapper ui-draggable']/div[@id='ui-id-14']/div")
	
	public static  WebElement massegeOriginNotExistsInDay ;
	
	@FindBy(how=How.XPATH, using="xpath=//a[contains(@href,'#/linenumber')")
	
	public static  WebElement dateInMassege ;
	
	
	
	

}
