package Assignment;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_search {
	
	WebDriver d;
	String url="https://www.google.com";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
		d=new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		d.quit();
	}

	@Test
	public void test() throws InterruptedException {
		//send required text in textbox
		d.findElement(By.name("q")).sendKeys("Selenium");
		
		//storing all suggestion in list
		List<WebElement> WE= d.findElements(By.xpath("//ul[@class='erkvQe']//li"));
		
		System.out.println(WE.size());
		Thread.sleep(5000);
		//iterate through all suggestions and select required text
		for(int i=0;i<WE.size();i++) {
			Thread.sleep(5000);
			String val = WE.get(i).getText();
			if(val.equals("selenium webdriver")) {
				WE.get(i).click();
				Thread.sleep(5000);
				break;
			}
		}
		
		
	}

}
