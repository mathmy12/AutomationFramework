package prac1;

import org.testng.annotations.Test;

public class PrintStatementTest {
   @Test
   public void runThroughJenkinsTest() {
	   System.out.println("we are executing by using jenkins");
	   String URL = System.getProperty("url");
	   String BROWSER = System.getProperty("browser");
	   String USERNAME = System.getProperty("username");
	   String PASSWARD = System.getProperty("passward");
	   
	   System.out.println(" url is: "+URL);
	   System.out.println(" browser is: "+BROWSER);
	   System.out.println(" Username is: "+USERNAME);
	   System.out.println(" Passward is: "+ PASSWARD);
	   
   }
   
   @Test
   public void printStatementTest() {
	   System.out.println("pull through git");
   }
}
