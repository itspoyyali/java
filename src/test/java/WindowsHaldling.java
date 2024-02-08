import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHaldling {
public static void main(String[] args) {
	String url = "https://www.flipkart.com/";
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("Reyalmi Mobiles",Keys.ENTER);
	 
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();
	
	
	String parent = driver.getWindowHandle();
	 Set<String> child = driver.getWindowHandles();
//   for(String x:child) {
//	   if(!parent.equals(x)) {
//		   driver.switchTo().window(x);
//		   String name =  driver.findElement(By.xpath("//snap[@class='B_NuCI']")).getText();
//		     System.out.println(name);
//	   }
//   }
      List<String> child1 = new ArrayList<String>(child);
      driver.switchTo().window(child1.get(2));
      String name =  driver.findElement(By.xpath("//snap[@class='B_NuCI']")).getText();
      System.out.println(name);
	
}
}
