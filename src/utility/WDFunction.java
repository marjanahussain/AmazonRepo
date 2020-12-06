package utility;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

// Until package contain generic class (WDfunction) and file read and write java class 
public class WDFunction {
//generic methods
	//Webelement = textbox- methods name -typebyxpath(), typebycssselector()
	//webelement = dropdown -method name- dropdownbyxpath(),dropdownbyname() etc
	
	public static WebDriver driver = null;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	
	public void typeByXpath(String element, String value_loc) {
		try {
		driver.findElement(By.xpath(element)).clear();
		driver.findElement(By.xpath(element)).sendKeys(value_loc);
	}
		catch(Exception e) {
			System.out.println(e);
		}
	}	
				public void typeByid(String locators, String value_loc) {
		try {
			driver.findElement(By.id(locators)).clear();
			driver.findElement(By.id(locators)).sendKeys(value_loc);
		}
			catch(Exception e) {
				System.out.println(e);
			}
			}
				public void typeByname(String locators, String value_loc) {		
					try {
					driver.findElement(By.name(locators)).clear();
					driver.findElement(By.name(locators)).sendKeys(value_loc);
				}
					catch(Exception e) {
						System.out.println(e);
					}
					}	
				
				public void typeByTagName(String locators, String value_loc) {		
					try {
					driver.findElement(By.tagName(locators)).clear();
					driver.findElement(By.tagName(locators)).sendKeys(value_loc);
				}
					catch(Exception e) {
						System.out.println(e);
					}
				}
				public void typeBycssSelector(String locators, String value_loc) {		
					try {
					driver.findElement(By.cssSelector(locators)).clear();
					driver.findElement(By.cssSelector(locators)).sendKeys(value_loc);
				}
					catch(Exception e) {
						System.out.println(e);
					}	
				}
					
				public void typeByclassName(String locators, String value_loc) {		
					try {
					driver.findElement(By.className(locators)).clear();
					driver.findElement(By.className(locators)).sendKeys(value_loc);
				}
					catch(Exception e) {
						System.out.println(e);
					}	
				}	
				public void clickByXpath(String locators) {
					try {
						driver.findElement(By.xpath(locators)).click();
					}
						catch(Exception e) {
							System.out.println(e);
						}
				}
				public void clickCssSelector(String locators) {
						try {
							driver.findElement(By.cssSelector(locators)).click();
						}
							catch(Exception e) {
								System.out.println(e);
							}
				}
						public void clickByid(String locators) {
							try {
								driver.findElement(By.id(locators)).click();
							}
								catch(Exception e) {
									System.out.println(e);
								}
						}
				public void clickByClassName(String locators) {
					try {
					driver.findElement(By.className(locators)).click();
					}
					catch(Exception e) {
						System.out.println(e);
				}		
				}
					public void clickBytagName(String locators) {
						try {
							driver.findElement(By.tagName(locators)).click();
						}
							catch(Exception e) {
								System.out.println(e);
							}
					}
						public void clickByLinkText(String locators) {
							try {
								driver.findElement(By.linkText(locators)).click();
							}
								catch(Exception e) {
									System.out.println(e);
								}
						}
							public void clickByPartialLinkText(String locators) {
								try {
									driver.findElement(By.partialLinkText(locators)).click();
								}
									catch(Exception e) {
										System.out.println(e);
									}			
							}
								public void clickByName(String locators) {
									try {
										driver.findElement(By.name(locators)).click();
									}
										catch(Exception e) {
											System.out.println(e);
										}		
								}				
								
	// scroll up method
								public void scrollUp(int s) {
									try {
								 	JavascriptExecutor jse = (JavascriptExecutor)driver;
								 	jse.executeScript("window.scrollBy(0,s)", "");
									jse.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
									}
									catch(Exception e) {
										System.out.println(e);
									}	
									
								}
						
	// scroll down 
								public void scrollDown(int s) {
									try {	
										JavascriptExecutor jse = (JavascriptExecutor)driver;
										//jse.executeScript("window.scrollBy(0,i)", "");
										jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
									}
										catch(Exception e) {
											System.out.println(e);
										}	
										
									}
								//Scrolling window Middle
								public void scrollMiddle(int s) {
									try {
						    		JavascriptExecutor jse = (JavascriptExecutor)driver;
								jse.executeScript("window.scrollBy(0,s)", "");
								jse.executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
									}
									catch(Exception e) {
										System.out.println(e);
									}	
									
								}
								
								public void scrollMiddle(double s) {
									try {
						    		JavascriptExecutor jse = (JavascriptExecutor)driver;
								jse.executeScript("window.scrollBy(0,s)", "");
								jse.executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
									}
									catch(Exception e) {
										System.out.println(e);
									}	
									
								}

								//..............................Navigate TO Command..............................//
								
								public void navigateTo(String webpagename)
								{
									try
									{
										driver.navigate().to(webpagename);
									}
									catch (Exception e)
									{
										System.err.println("issue with :"  + e.getMessage());
										
									}
								}
								
		// navigate back method
		public void back() {
			try {
				driver.navigate().back();
			}
			catch(Exception e) {
				System.out.println("Exception : "+e.getMessage());
			}		
	}		
		// forward method
		public void forward() {
			try {
				driver.navigate().forward();
			}
			catch(Exception e) {
				System.out.println("Exception : "+e.getMessage());
			}		
	}			
		
		// refresh method
				public void refresh() {
					try {
						driver.navigate().refresh();
					}
					catch(Exception e) {
						System.out.println("Exception : "+e.getMessage());
					}		
			}
				
		// switch to new window 
			public void SwitchToNewWindow(String locators, String loc) {	
				try {
		driver.findElement(By.xpath(locators)).click();
		driver.findElement(By.xpath(loc)).click();

				//for handle multiple windows
				Set<String> winH = driver.getWindowHandles();
				Iterator<String> itH = winH.iterator();
				String mainWin = itH.next();
				String childWin = itH.next();
				//System.out.println(mainWin + " " + childWin);
				
				driver.switchTo().window(childWin);
				System.out.println(driver.getTitle());
				//driver.close();
				driver.switchTo().window(mainWin);
				System.out.println(driver.getTitle());
				//driver.quit();
				}
				catch(Exception e) {
					System.out.println("Exception : "+e.getMessage());
				}	
			}
			//Switch to child window
			public void SwitchToChildWindow(String locators, String loc) {	
				try {
		driver.findElement(By.xpath(locators)).click();
		driver.findElement(By.xpath(loc)).click();

				//for handle multiple windows
				Set<String> winH = driver.getWindowHandles();
				Iterator<String> itH = winH.iterator();
				String mainWin = itH.next();
				String childWin = itH.next();
				//System.out.println(mainWin + " " + childWin);
				
				driver.switchTo().window(childWin);
				}
				catch(Exception e) {
					System.out.println("Exception : "+e.getMessage());
				}	
			}
			
			// switch to parent window
			public void switchToParentWindow() {
				try {
					driver.switchTo().defaultContent();
				}
				catch(Exception e) {
					System.out.println("Exception : "+e.getMessage());
				}	
			}
			
			
			
			// Implicit wait method
				public void waitTillPageLoad (long implicit) {
					try {
						driver.manage().timeouts().implicitlyWait(implicit, TimeUnit.SECONDS);
					}
					catch (Exception e) {
						System.out.println("Error : "+ e.getMessage());
					}
				}
								
		// Explicit wait   (condition : element to be clickable)
				public void ExElement(String locators, long seconds) {
					try {
						WebElement element = driver.findElement(By.xpath(locators));
						WebDriverWait WaitElement = new WebDriverWait(driver,seconds);
						WaitElement.until(ExpectedConditions.elementToBeClickable(element));
					}
					catch (Exception e) {
						System.out.println("Error : "+ e.getMessage());
					}
				}
				// Explicit wait   (condition : element to be clickable)
				public void ExElementByCss(String locators, long seconds) {
					try {
						WebElement element = driver.findElement(By.cssSelector(locators));
						WebDriverWait WaitElement = new WebDriverWait(driver,seconds);
						WaitElement.until(ExpectedConditions.elementToBeClickable(element));
					}
					catch (Exception e) {
						System.out.println("Error : "+ e.getMessage());
					}
				}	
				// Explicit wait   (condition : visibility)
				public void tillElementFound(String locators, long seconds) {
					try {
						WebElement element = driver.findElement(By.xpath(locators));
						WebDriverWait WaitElement = new WebDriverWait(driver,seconds);
						WaitElement.until(ExpectedConditions.visibilityOf(element));
					}
					catch (Exception e) {
						System.out.println("Error : "+ e.getMessage());
					}
				}
				
				public void tillElementFoundBycss(String locators, long seconds) {
					try {
						WebElement element = driver.findElement(By.cssSelector(locators));
						WebDriverWait WaitElement = new WebDriverWait(driver,seconds);
						WaitElement.until(ExpectedConditions.visibilityOf(element));
					}
					catch (Exception e) {
						System.out.println("Error : "+ e.getMessage());
					}
				}		
				public void tillElementFoundById(String locators, long seconds) {
					try {
						WebElement element = driver.findElement(By.id(locators));
						WebDriverWait WaitElement = new WebDriverWait(driver,seconds);
						WaitElement.until(ExpectedConditions.visibilityOf(element));
					}
					catch (Exception e) {
						System.out.println("Error : "+ e.getMessage());
					}
				}
		// key down method
				public void pressKey(String locators) {
					try {
						WebElement element = driver.findElement(By.xpath(locators));
						
						element.sendKeys(Keys.DOWN);
						
					}
					catch (Exception e) {
						System.out.println("Error : "+ e.getMessage());
					}
				}
					
				// Enter key method
				public void EnterKey(String locators) {
					try {
						WebElement element = driver.findElement(By.xpath(locators));
						
						element.sendKeys(Keys.ENTER);
						
					}
					catch (Exception e) {
						System.out.println("Error : "+ e.getMessage());
					}
				}
				
				// key UP method
				public void pressKeyUP(String locators) {
					try {
						WebElement element = driver.findElement(By.xpath(locators));
						
						element.sendKeys(Keys.UP);
						
					}
					catch (Exception e) {
						System.out.println("Error : "+ e.getMessage());
					}
				}
				
				public void pressKeyUPByCss(String locators) {
					try {
						WebElement element = driver.findElement(By.cssSelector(locators));
						
						element.sendKeys(Keys.UP);
						
					}
					catch (Exception e) {
						System.out.println("Error : "+ e.getMessage());
					}
				}	
		public void popUp() {
			try {
				driver.switchTo().activeElement();
			}
			catch (Exception e) {
				System.out.println("Error : "+ e.getMessage());
			}

			
		}
				
				
			// alert accept method
				
	 public void alertAccept(String locator) {
		 try {
			 driver.findElement(By.xpath(locator));
			 Alert obj = driver.switchTo().alert();
			System.out.println(obj.getText());
			 obj.accept();
		 }
		 catch (Exception e) {
				System.out.println("Error : "+ e.getMessage());
			}
		}		
	 public void alertAcceptBycss(String locator) {
		 try {
			 driver.findElement(By.cssSelector(locator));
			 Alert obj = driver.switchTo().alert();
			System.out.println(obj.getText());
			 obj.accept();
		 }
		 catch (Exception e) {
				System.out.println("Error : "+ e.getMessage());
			}
		}
	 public void alertAcceptByid(String locator) {
		 try {
			 driver.findElement(By.id(locator));
			 Alert obj = driver.switchTo().alert();
			System.out.println(obj.getText());
			 obj.accept();
		 }
		 catch (Exception e) {
				System.out.println("Error : "+ e.getMessage());
			}
		}		
	// alert dismiss method
		
		 public void alertDismiss(String locator) {
			 try {
				 driver.findElement(By.xpath(locator));
				 Alert obj = driver.switchTo().alert();
				// String text = obj.getText();
				 obj.dismiss();
			 }
			 catch (Exception e) {
					System.out.println("Error : "+ e.getMessage());
				}
			}		
		 public void alertDismissBycss(String locator) {
			 try {
				 driver.findElement(By.cssSelector(locator));
				 Alert obj = driver.switchTo().alert();
				// String text = obj.getText();
				 obj.dismiss();
			 }
			 catch (Exception e) {
					System.out.println("Error : "+ e.getMessage());
				}
			}		
				
				
								
				// Remove cookies message		
	    public  void cookies() {
		try {
			driver.manage().deleteAllCookies();
		}
		catch(Exception e) {
			System.out.println("Exception: "+e);
			
		}
	}
				// window maximize			
			public void maximize() {
				 try {
					 driver.manage().window().maximize();
			}
			catch(Exception e) {
				System.out.println("Exception: "+e);
				
			}				
}				
		// screenshot method	
			public void screenshot(String s) {
				try {
					File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(f,new File(s));
				}
				catch(Exception e) {
					System.out.println("Exception: "+e);
					
				}		
				
				
			}
			
			
			// text box clear method
		public void clearTextBox(String locatros)	{
			try {
				WebElement element = driver.findElement(By.xpath(locatros));
				element.clear();
			}
			catch(Exception e) {
				System.out.println("Exception: "+e.getMessage());
				
			}	
		}
	//  right click method
					public void rightClick(String locators) {
						 try {
							 WebElement rightClick = driver.findElement(By.xpath(locators));
			                Actions build = new Actions(driver);
			                build.contextClick(rightClick).build().perform();;
						 }
						 catch(Exception e) {
								System.out.println("Exception: "+e.getMessage());
								
							}	
					}
		//  Double click method
				public void doubleClick(String locators) {
					 try {
						 WebElement doubleClick = driver.findElement(By.xpath(locators));
		                Actions build = new Actions(driver);
		                build.doubleClick(doubleClick).build().perform();;
					 }
					 catch(Exception e) {
							System.out.println("Exception: "+e.getMessage());
							
						}	
				}
		
		// Mouse Hover method
		public void hover(String locators) {
			 try {
				 WebElement target = driver.findElement(By.xpath(locators));
                Actions build = new Actions(driver);
                build.moveToElement(target).build().perform();;
			 }
			 catch(Exception e) {
					System.out.println("Exception: "+e.getMessage());
					
				}	

			 
		}
		// drag and drop method
		public void dragAndDrop(String locatorDrag, String locatorDrop) {
			 try {
				 WebElement dragElement = driver.findElement(By.xpath(locatorDrag));
				 WebElement dropElement = driver.findElement(By.xpath(locatorDrop));
                 Actions build = new Actions(driver);
                 build.dragAndDrop(dragElement, dropElement);
			 }
			 catch(Exception e) {
					System.out.println("Exception: "+e.getMessage());
					
				}	

			 
		}
		 // Tool Tip method
		public void toolTip(String locators) {
			try {
				WebElement toolTip = driver.findElement(By.xpath(locators));
				String tool = toolTip.getAttribute("Tool Title");
			}
			catch(Exception e) {
				System.out.println("Exception: "+e.getMessage());
				
			}	
		}
			
			// using is Enable method
		public boolean enableElement (WebElement elem, String locators) {
			boolean enable = false;
			try {
				WebElement element = driver.findElement(By.xpath(locators));
				enable=element.isEnabled();
				if(enable) {
					element.click();
				}
			}
			catch(Exception e) {
				System.out.println("Exception :"+e);
			}
			return enable;
		}
		
		
				
			// performing isDesplayed method
			
		public boolean isDisplayElement (WebElement dPlay, String locators) {
			boolean display = false;
			try {
				WebElement obj = driver.findElement(By.xpath(locators));
				display = obj.isDisplayed();
				if(display) {
					obj.click();
				}
			}
			catch(Exception e) {
				System.out.println("Exception :"+e);
			}
			return display;
		}		
			// isSelected method
		public boolean isSelected (WebElement selectElement, String locators) {
			boolean select = false;
			try {
				WebElement obj = driver.findElement(By.xpath(locators));
				select = obj.isSelected();
				if(select) {
					obj.click();
				}
			}
			catch(Exception e) {
				System.out.println("Exception :"+e.getMessage());
			//	System.err.println();
			}
			return select;
		}		
				
	//	drop down method
		public void dropdownByxpath(String locator, String text) {
			try {
				WebElement select = driver.findElement(By.xpath(locator));
				Select dropdown = new Select (select);
				String selected =dropdown.getFirstSelectedOption().getText();
				if(selected.equals(text)) {
					List<WebElement> options = dropdown.getOptions();
					for(WebElement option : options) {
						if(option.getText().equals(text)) {
							option.click();
						}
					}
				}
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
		

public void dropdownBycssSelector(String locator, String text) {
	try {
		WebElement dd = driver.findElement(By.cssSelector(locator));
		Select ddselect = new Select (dd);
		ddSelectByIndex(ddselect);
		}
	
	catch(Exception e) {
		System.err.println(e.getMessage());
	}
		
}
	
	
public void	ddSelectByIndex(Select svalue) {
	svalue.selectByIndex(5);
}
	
	
	
public void dropDownByXpath(String locator, String value) {
	try {
		WebElement dd = driver.findElement(By.xpath(locator));
		Select ddselect = new Select (dd);
		ddselect.selectByVisibleText(value);
		}
	
	catch(Exception e) {
		System.err.println(e.getMessage());
	}
		
}

// .............................................. GET CURRENT URL......................//	
public void getURL ()
{
	try{
		String currentUrl = driver.getCurrentUrl();
		System.out.println (currentUrl);
		
	}
	catch(Exception e)
	{
		System.err.println ("issue is:" + e.getMessage());
		
	}
}


//................................Check Box..............................................//
public void checkBox(String locators)
{
	try
	{
		WebElement checkbox = driver.findElement(By.xpath(locators));
		boolean isDisplayed = checkbox.isDisplayed();
		if(isDisplayed)
		{
			boolean isEnabledCheck = checkbox.isEnabled();
			if(isEnabledCheck)
			{
				boolean isSelectedCheck = checkbox.isSelected();
				if(isSelectedCheck)
				{
	
					System.out.println("already checked");
				}
				else
				{
					driver.findElement(By.xpath(locators)).click();
				}
			}
			else
			{
				System.out.println("object is not enabled");
			}
		}
		else
		{
			System.out.println("Object is not displayed");
		}
	}
	catch (Exception e)
	{
		System.err.println("issue with :"  + e.getMessage());
	
	}
}
   
//.............................Drop Down List BY XPATH.......................................//
		public void dropdownByXpath(String locators, String values)
		{
			try
			{	
				WebElement dd = driver.findElement(By.xpath(locators));
				Select ddSelect = new Select(dd);
				ddSelect.selectByVisibleText(values);
				
			}
			catch (Exception e)
			{
				System.err.println("issue with :"  + e.getMessage());
			
			}
		}
			
		
		//.............................Drop Down List BY ID.......................................//
				public void dropdownById(String locators, String values)
				{
					try
					{
						WebElement dd = driver.findElement(By.xpath(locators));
						Select ddSelect = new Select(dd);
						ddSelect.deselectByValue(values);
						
						}
					catch (Exception e)
					{
						System.err.println("issue with :"  + e.getMessage());
						
					}
				}

				// .......................................... RadioButton ........................................................
				public void radioButtonByXpath (String locator){
				
				List <WebElement> radioButtons = driver.findElements (By.xpath(locator));
				// can use for loop also
								  radioButtons.get(1).click();
			}

				//.......................................WEB TABLE................................//
				public void webTable(String locators, String row, String column)
				{
					try
					{
						//separate specific area by using WebElement
						WebElement webTable = driver.findElement(By.xpath(locators));
						//then this specific area that is a table and 
						//where we stored ROW that is tr in WebTable by using List where more than one element
						List<WebElement> tableRow = webTable.findElements(By.tagName(row));
						
						for(int i=0;i<tableRow.size();i++)
						{
							//where we stored COLUMN that is td in WebTable by using List where more than one element
							List<WebElement> tableColumn = tableRow.get(i).findElements(By.tagName(column));
						
							for(int j=0;j<tableColumn.size();j++)
							{
								String columnValue = tableColumn.get(j).getText();
								System.out.print(columnValue + "    ");
								
							}
							System.out.println();
							System.out.print("" + "    ");
						}

					}
					catch (Exception e)
					{
						System.err.println("issue with :"  + e.getMessage());
						
					}
				}
				
				//.................................CALENDER/DATE PICKER................................................//
				public void datePicker(String locators, String tr, String td, String values)
				{
					try
					{
						WebElement cale=driver.findElement(By.xpath(locators));
						List<WebElement> dr=cale.findElements(By.tagName(tr));
						
						for(int i=0;i<dr.size();i++)
						{
							List<WebElement> ro = dr.get(i).findElements(By.tagName(td));
							
							for(int z=0;z<ro.size();z++)
							{
								//System.out.println(ro.get(z).getText());
								String value=ro.get(z).getText();
								if(value.equalsIgnoreCase(values))
								{
									waitByThread(1000);
									ro.get(z).click();
									break;
								}
							}
						}
						
					}
					catch (Exception e)
					{
						System.err.println("issue with :"  + e.getMessage());
						
					}
				}
				
				//.......................................HANDLE MULTIPLE WINDOW................................//
				public void windowHandler(String locators)
				{
					try
					{
						driver.findElement(By.xpath(locators)).click();
						waitByThread(3000);
					
						//for handle multiple windows
						Set<String> winH = driver.getWindowHandles();
						Iterator<String> itH = winH.iterator();
					
						String mainWin = itH.next();
						String childWin = itH.next();
						System.out.println(mainWin + " " + childWin);
						
					
						driver.switchTo().window(childWin);
						System.out.println(driver.getTitle());
						
					
						waitByThread(3000);
						driver.switchTo().window(mainWin);
						System.out.println(driver.getTitle());
						
					}
					catch (Exception e)
					{
						System.err.println("issue with :"  + e.getMessage());
						
					}
				}
				
				//..................................WAIT PACK...............................................//
				
					//....................................THREAD....................................//
				public void waitByThread(int time) throws InterruptedException
				{
					Thread.sleep(time); 
				}
				
					//.....................................IMPLICIT WAIT..............................//
				public void waitByImplicit(int time) 
				{
					try
					{
						driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
					}
					catch (Exception e)
					{
						System.err.println("issue with :"  + e.getMessage());
						
					}
				}
				
					//.....................................EXPLICIT WAIT..............................//
				public void waitByExplicit (String locator)
				{
					try
					{
						WebDriverWait explicitwait = new WebDriverWait(driver, 5000);
						explicitwait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
						driver.findElement(By.xpath(locator));
					}
					catch (Exception e)
					{
						System.err.println("issue with :"  + e.getMessage());
						
					}
				}
				
				public void fluentWait (int timeOut, int pollingEvery){ // pollingEvery should be 5 seconds
					new FluentWait<WebDriver>(driver)
			       .withTimeout(timeOut, TimeUnit.SECONDS)
			       .pollingEvery(pollingEvery, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		 		}

		

	
	
	
}
