package testCases;

import org.testng.annotations.Test;

import base.Configuration;
import locators.Locators;
import value.Value_Loc;

	public class TestCase2 extends Configuration {
		//related to module from requirements based on website
		
		
		Locators loc = new Locators();
		Value_Loc value = new Value_Loc();
		
		
		@Test
		public void searchItem() {
			typeByXpath(loc.SearchItemLoc,value.SearchVal);
			scrollMiddle(value.jseValue);
			clickByXpath(loc.ClickSearchLoc);
		}
}
