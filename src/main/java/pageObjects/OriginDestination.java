package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utilities.Base;


public class OriginDestination extends Base {
	
	//private static WebElement element;

	
	@FindBy(how = How.ID, using = "bydestFromCityCombo")
	public static  WebElement byDestFromCity ;
	
	
	@FindBy(how = How.ID, using = "bydestToCityCombo")
	public static  WebElement byDestToCity ;
	
	
	@FindBy(how = How.CLASS_NAME, using = "scrollableParentParnet ")
	public static  WebElement placeInOriginList ;
	
	
	@FindBy(how = How.XPATH, using = "/html/body[@class='ng-scope rtl']/div[@class='MainBody  no-print ng-scope']/div[@class='main-site ng-scope']/div[@class='ng-scope'][1]/div[@class='filterTabControl ']/table/tbody/tr[2]/td/div[@class='searchSubView ng-scope']/div[@class='ng-scope']/div[@class='SearchPageInnerPanel']/fieldset[@class='SearchSection2']/div/div/div[@class='DisplayTableRowBreakable']/div[@class='search-panel1'][1]/div[3]/div[@id='bydestFromPlaceCombo']/button[@class='ComboButton']/div/div[@class='selectedItemDiv']/span[@class='ng-binding']")
	public static  WebElement placeInOrigin ;
	
	
	@FindBy(how = How.XPATH, using = "/html/body[@class='ng-scope rtl']/div[@class='MainBody  no-print ng-scope']/div[@class='main-site ng-scope']/div[@class='ng-scope'][1]/div[@class='filterTabControl ']/table/tbody/tr[2]/td/div[@class='searchSubView ng-scope']/div[@class='ng-scope']/div[@class='SearchPageInnerPanel']/fieldset[@class='SearchSection2']/div/div/div[@class='DisplayTableRowBreakable']/div[@class='search-panel1'][2]/div[3]/div[@id='bydestToPlaceCombo']/button[@class='ComboButton']/div/div[@class='selectedItemDiv']")
	public static  WebElement placeInDest ;
	
	
	@FindBy(how=How.XPATH, using="//div[@data-ng-click='scheduleClicked()']")
	public static  WebElement scheduleClicked ;
	
	
	@FindBy(how = How.CLASS_NAME, using = "ComboButton")
	public static  WebElement placeInOriginCombo ;
	
	
	
	
	
	
	
	
	
	
	/*@FindBy(how = How.XPATH, using = "//div[@id='bydestFromPlaceCombo']/button[@class='ComboButton']/div/div[@class='selectedItemDiv']/span[@class='ng-binding']")
	public static  WebElement placeInOrigin ;*/
	
	
	
	
	
	
	
	
	

	
	
	

	
	
	
	
}
