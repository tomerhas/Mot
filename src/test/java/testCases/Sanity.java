package testCases;

import java.util.Arrays;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

import extensiones.Assertiones;
import extensiones.SelectFrom;
import extensiones.Split;
import pageObjects.LineNumber;
import pageObjects.MainObjects;
import pageObjects.OriginDestination;
import utilities.Base;
import utilities.WaitTo;
import workFlows.LineNumberFlow;
import workFlows.MainFlow;
import workFlows.OriginDestFlow;

public class Sanity extends Base {
	@Test
	public void changeDirection() {
		
		OriginDestFlow.typeDestFromCity("חיפה");
		System.out.println(OriginDestination.placeInOriginCombo.isDisplayed());
		System.out.println(OriginDestination.placeInOriginCombo.getSize());
		
		WaitTo.waitForElementVisible(driver, OriginDestination.placeInOriginCombo);
		WaitTo.waitForElementVisible(driver, OriginDestination.placeInOrigin);
		
		

		Assertiones.assertValueExists(OriginDestination.placeInOrigin,
				"מרכזית חוף הכרמל");

		OriginDestFlow.typeDestToCity("תל אביב");
		WaitTo.waitForElementVisible(driver, OriginDestination.placeInDest);

		Assertiones.assertValueExists(OriginDestination.placeInDest,
				"תחנה מרכזית חדשה : תחנת רכבת הגנה");

		MainFlow.clickSearch();
		WaitTo.waitForElementVisible(driver, OriginDestination.scheduleClicked);

		Assertiones.assertValueExists(OriginDestination.scheduleClicked,
				"לוח זמנים ותחנות");

		MainObjects.clickSwitch();
		WaitTo.waitForElementVisible(driver, OriginDestination.scheduleClicked);

		Assertiones.assertValueExists(OriginDestination.scheduleClicked,
				"לוח זמנים ותחנות");
		

	}
	
	
	@Test
	
	public void assertOriginNotExists () {
		
		
		MainFlow.clickTabLineNumber();
		LineNumberFlow.typeDestFromCity("אסמאעיל");
		Assertiones.assertValueExists(MainObjects.userMessage, "אין שירות לישוב אסמאעיל");
		
					
	}
	
	
	@Test
	
	
	public void assertOriginNotExistsInDay (){
		
	 MainFlow.clickTabLineNumber();
	 //System.out.println(LineNumberFlow.splitDate());
	 System.out.println(LineNumber.bylineDateSelect.getText());
	 System.out.println(LineNumber.dates.size());
	 //System.out.println(SelectFrom.getIndexBy(LineNumber.dates, "יום ש"));
	 SelectFrom.selectFromList(LineNumber.dates,LineNumber.bylineDateSelect,"יום ש");
	 //SelectFrom.selectByPartOfVisibleText(LineNumber.dates,"יום ש");
	 //LineNumberFlow.selectDate(" יום ש");
	 //System.out.println(LineNumberFlow.splitMessage());
	 LineNumberFlow.typeDestFromCity("כפר נטר");
	 System.out.println(MainObjects.userMessage.getText());
	 Assertiones.assertValueExistsString(LineNumberFlow.getTextFromMessageNoServiceInSaturday("\\."), "לישוב כפר נטר אין שירות ביום מבוקש בחר יום אחר");
	 //System.out.println(linenumber.dateInMassege.getText());
	 
	 
	
								
	}
	
	
	
	
	
	
	

	@BeforeMethod
	public void beforeMethod() {

		initMainObjects();
		initOriginDestination();
		initWait();
		initLineNumber();

	}

	@BeforeClass
	public void beforeClass() {

	}

}
