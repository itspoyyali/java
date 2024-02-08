import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class JavaScriptexecuter {
	

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.edge.driver", "D:\\New folder\\Maven\\target\\msedgedriver.exe");
		String url = "https://www.facebook.com/";
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); 
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement down = driver.findElement(By.xpath("//a[text()='Careers']"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Poyyali')",user,pass,login);
//	Object ob = js.executeScript("return arguments[0].getAttribute('value')",user,pass,login);
//		System.out.println(ob);
//		js.executeScript("arguments[2].click()",user,pass,login);
//		
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(false)", user);
	
		js.executeScript("arguments[0].setAttribute('style','border:2px solid green;background:red')",user);
		
		
	}


}
