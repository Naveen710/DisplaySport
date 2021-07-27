package com.bookmyshow.in;
import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class Highlight extends Base
	{

		   //HIGHLIGHTING THE ELEMENTS
			public static WebDriver driver;
			public static void highlightElement(WebDriver driver,WebElement element) throws InterruptedException
			{
				
				JavascriptExecutor jse=((JavascriptExecutor)driver);
				//SETTING UP COLOR AND STYLE TO HIGHLIGHT ELEMENT
				jse.executeScript("arguments[0].style.border='4px solid yellow'",element);
				Thread.sleep(3000);
				jse.executeScript("arguments[0].removeAttribute('style','')",element);
			}
			
	}

