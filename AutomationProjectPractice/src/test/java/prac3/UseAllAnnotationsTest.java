package prac3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class UseAllAnnotationsTest {
	
	@BeforeSuite
	public void beforeSuiteTest() {
		System.out.println("connect with database");
	}
	
	@BeforeClass
	public void beforeClassTest() {
		System.out.println("Launch the browser");
	}
	
	@BeforeMethod
	public void beforeMethodTest() {
		System.out.println("Login the app");
	}
	
 @Test
 public void useOfAnnotationTest() {
	 System.out.println("print all annotation");
 }
 
 @AfterMethod
	public void afterMethodTest() {
		System.out.println("Logout the app");
 }
	
	@AfterClass
	public void AfterClassTest() {
		System.out.println("close the browser");
	}
    
	@AfterSuite
	public void AfterSuiteTest() {
	System.out.println("connect with database");
			} 
	}
	
