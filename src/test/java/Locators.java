import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {public static void main(String[] args) {
	//System.setProperty("webdriver.edge.driver", "D:\\New folder\\Maven\\target\\msedgedriver.exe");
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	String url = "https://www.facebook.com/";
	driver.get(url);

	driver.manage().window().maximize();
	      WebElement user= driver.findElement(By.id("email"));
	     if( user.isDisplayed()) {
	    	 user.sendKeys("raj" );
	    	 user.clear();
	    	 user.sendKeys("poyyali");
	    	 
	    	 String text = user.getAttribute("value");
	    	 if(text.isEmpty()) {
	    		 
	    	 }
	    	 else if(!text.equals("poyyali")) {
	    		 System.err.println("Exbected should be in this text but insted we got:" +text);
	    	 }
	    	 else {
	    		 System.out.println("successfully verified");
	    	 }
	     }
	     else {
	    	 System.err.println("element is hidden");
	     }
	      WebElement pass= driver.findElement(By.name("pass"));
	      pass.sendKeys("Ppre@123");
	      
//	      WebElement link = driver.findElement(By.partialLinkText("Log in"));
//	      if(link.isEnabled()) {
//	    	   String text = link.getText();
//	    	   link.click();	
//	    	   System.out.println(text+"Button is successfully present ");
//	      }
//	      else {
//	    	  System.out.println("log in button is disabled");
//	      }
	      List<WebElement> link = driver.findElements(By.tagName("a"));
	      System.out.println(link.size());
	      for (int i = 0; i <link.size(); i++) {
	    	  WebElement value =link.get(i);
	    	  String text =  value.getText();
	    	  System.out.println(text);
	      }
	      
	      WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Log In')"));
	      login.click();
		
	      
	      
	      
	      
}

}
