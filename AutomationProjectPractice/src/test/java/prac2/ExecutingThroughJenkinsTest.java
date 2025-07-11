package prac2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecutingThroughJenkinsTest {
   

	@Test
	public void runThroughBrowserAndPrintTest() {
		WebDriver driver  =  new ChromeDriver();
		driver.get("https://mvnrepository.com/");
		String roj = driver.getTitle();
		System.out.println(roj);
	}
}
