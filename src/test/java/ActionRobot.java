import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionRobot {
	public static void main(String[] args) throws Throwable {
		//String ht ="https://www.amazon.in/";
		String am ="https://www.facebook.com/";
		WebDriverManager.edgedriver().setup();
		WebDriver web = new EdgeDriver();
		web.get(am);
		web.manage().window().maximize();
		WebElement el = web.findElement(By.id("email"));                                    //(By.xpath("//*[text()='EN']"));
		
		Actions a = new Actions(web);
		a.sendKeys(el,"poyyali").perform();
		a.doubleClick().perform();
		a.contextClick().perform();
	
	    Robot r = new Robot();
			for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			}
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			
			TakesScreenshot tk = (TakesScreenshot)web;
			File sorce= tk.getScreenshotAs(OutputType.FILE);
         	File dec = new File("D:\\New folder\\MyWork\\src\\PPr\\image.png");
            FileUtils.copyFile(sorce, dec);
            
         	
		
		
		
	}

}
