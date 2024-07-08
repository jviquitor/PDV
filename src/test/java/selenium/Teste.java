package selenium;

import static org.junit.Assert.*;


import org.junit.BeforeClass;
import org.junit.jupiter.api.*;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Teste{
	
	protected WebDriver driver;

	@BeforeClass
	public static void configuraDriver(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jvrsi\\Libs\\chromedriver-win64\\chromedriver.exe");
		
	}
	
	@BeforeEach
	public void createDrive() {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}
	

	@Test
	public void testaTituloBuscaGoogle() throws InterruptedException {
		Assertions.assertEquals(1, 1);
		
	}
	
}

