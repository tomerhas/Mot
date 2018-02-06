package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import extensiones.Assertiones;
import pageObjects.MainObjects;
import pageObjects.OriginDestination;
import utilities.Base;
import utilities.WaitTo;
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
	
	public void f() {
		
		
		MainFlow.clickTabLineNumber();
		
		
		
		
	}
	
	
	

	@BeforeMethod
	public void beforeMethod() {

		initMainObjects();
		initOriginDestination();
		initWait();

	}

	@BeforeClass
	public void beforeClass() {

	}

}
