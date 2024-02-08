import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertMentpopup {
	public static void main(String[] args) throws InterruptedException {
		String url ="https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get(url);
 		driver.manage().window().maximize();
		
		WebElement elm =driver.findElement(By.name("alert"));
		elm.click();
		Thread.sleep(4000);
		Alert at = driver.switchTo().alert();
		at.accept();
		
		WebElement elm2 =driver.findElement(By.name("confirmation"));
		elm2.click();
		Thread.sleep(5000);
		Alert confir =driver.switchTo().alert();
		confir.dismiss();
		
		WebElement elm3 =driver.findElement(By.name("prompt"));
		elm3.click();
		Thread.sleep(3000);
		 Alert prompt = driver.switchTo().alert();               //sendkey is not working
		prompt.sendKeys("poyyali");
		prompt.accept();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
