import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	public static void main(String[] args) {
		String frame ="https://chercher.tech/practice/frames";
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get(frame);
		driver.manage().window().maximize();
			
		driver.switchTo().frame("frame1");
	    WebElement elm = driver.findElement(By.xpath("//input[@type='text']"));
		elm.sendKeys("RamRaj");
		
		  driver.switchTo().frame("frame3");
		  WebElement elm2 = driver.findElement(By.xpath("//input[@type='checkbox']"));
			elm2.click();
			
		  driver.switchTo().parentFrame();                                    //parentframe is not working
		  driver.findElement(By.xpath("//*[type()='Selenium']")).click();
		  
		
//          driver.switchTo().frame("frame2");
//	      WebElement elm3= driver.findElement(By.xpath("//select@id='animals'"));            //frame2 is not working
//	      Select s = new Select(elm3);
//	      s.selectByValue("big baby cat");
//		
		
		
		
	}

}
