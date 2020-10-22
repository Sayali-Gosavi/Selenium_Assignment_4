package Assignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWebPage {
	
	WebDriver d;
	String url="http://openclinic.sourceforge.net/openclinic/home/index.php";

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
	public void test() {
		//scrolling web page
		JavascriptExecutor javascriptexecutor = (JavascriptExecutor) d; 
		javascriptexecutor.executeScript("window.scrollBy(0,1000)");
	}

}
