package prac1;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LauchBrowserTest {

	@Test
	public void runThroughBrowserTest() {
		WebDriver driver  =  new ChromeDriver();
		driver.get("https://www.rojgarresult.com/");
		String roj = driver.getTitle();
		System.out.println(roj);
	}
	@Test
	public void runScriptTest() {
		WebDriver driver  =  new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String roj1 = driver.getTitle();
		System.out.println(roj1);
	}
}
