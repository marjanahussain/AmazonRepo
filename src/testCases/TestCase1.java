package testCases;

import org.testng.annotations.Test;

import base.Configuration;
import locators.Locators;
import value.Value_Loc;

public class TestCase1 extends Configuration {
	//related to module from requirements based on website
	
	
	Locators loc = new Locators();
	Value_Loc value = new Value_Loc();
	
	@Test 
	public void signIn() {
		
		typeByid(loc.emailLoc, value.emailVal);
		clickByid(loc.clickLoc);
		typeByid(loc.passLoc,value.passLoc);
		clickByid(loc.passClickLoc);
	}
		
		
		
		
	}

