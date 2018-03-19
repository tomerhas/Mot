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
		 SelectFrom.selectFromList(LineNumber.dates,LineNumber.bylineDateSelect,"יום ש");
		 LineNumberFlow.typeDestFromCity("כפר נטר");
	 	 Assertiones.assertValueExistsString(LineNumberFlow.getTextFromMessageNoServiceInSaturday("\\."), "לישוב כפר נטר אין שירות ביום מבוקש בחר יום אחר");
	 System.out.println(SelectFrom.getIndexBy(LineNumber.DatesMessage, "ה"));
	 LineNumberFlow.clickDatesMessage(LineNumber.DatesMessage, "ה");
	 LineNumberFlow.typeLineNum("43");
	 SelectFrom.selectFromList(LineNumber.dates,LineNumber.bylineDateSelect,"יום ו");
	 Assertiones.assertValueExists(MainObjects.userMessage, "קו לא פעיל ב יום ו");
	 
	 
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	
								
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
