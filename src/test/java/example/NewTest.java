package example;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;

	@Test
	public void testEasy() {
//		driver.get("http://www.guru99.com/selenium-tutorial.html");
		driver.get("http://www.google.com");
//		System.out.println("Hello World");
//		String title = driver.getTitle();
//		AssertJUnit.assertTrue(title.contains("Free Selenium Tutorials"));
	}

	@BeforeTest
	public void beforeTest() {
//		System.setProperty("webdriver.gecko.driver", "/home/synerzip/Downloads/geckodriver");
//		driver = new FirefoxDriver();
		System.setProperty("phantomjs.binary.path", "/home/synerzip/Downloads/phantomjs-2.1.1-linux-x86_64/bin/phantomjs");
		driver = new PhantomJSDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
