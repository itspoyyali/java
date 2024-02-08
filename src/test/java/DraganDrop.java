

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DraganDrop {
	public static void main(String[] args) {
		String url = "https://demo.guru99.com/test/drag_drop.html";
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement drag = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement drop = driver.findElement(By.xpath("//li[@class='placeholder']"));
		WebElement drag2 = driver.findElement(By.xpath("//a[contains(text(),' 5000')]"));
		WebElement drop2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
		a.dragAndDrop(drag2, drop2).perform();
	}

}
