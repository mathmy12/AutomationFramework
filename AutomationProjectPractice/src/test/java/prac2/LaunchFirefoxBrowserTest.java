package prac2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchFirefoxBrowserTest {

	@Test
	public void runThroughBrowserTest() {
		WebDriver driver  =  new FirefoxDriver();
		driver.get("https://www.rojgarresult.com/");
		String roj = driver.getTitle();
		System.out.println(roj);
	}
	@Test
	public void printFirefoxBrowserTest() {
		System.out.println("Executing in firefox");
	}
}
