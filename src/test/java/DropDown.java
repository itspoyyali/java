import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement elm = driver.findElement(By.xpath("//select[@id='first']"));
		Select s = new Select(elm);
	    s.selectByIndex(2);
		Thread.sleep(4000);
		s.selectByValue("Google");
		Thread.sleep(4000);
		s.selectByValue("Yahoo");
		
		boolean mul = s.isMultiple();
		System.out.println(mul);
		
		WebElement elm2 = driver.findElement(By.xpath("//select[@id='second']"));
		Select s2 = new Select(elm2);
		  List<WebElement> opt = s2.getOptions();
		for (int i = 0; i <opt.size(); i++) {
			WebElement opget =  opt.get(i);
			   String ddv = opget.getText();
			   System.out.println(ddv);
		}
			   s2.selectByIndex(2);
			   Thread.sleep(4000);
			   s2.selectByIndex(1);
			   Thread.sleep(4000);
			   s2.selectByIndex(0);
			   Thread.sleep(4000);
			 s2.deselectByVisibleText("Pizza");
			 
			List<WebElement> allselect = s2.getAllSelectedOptions();
			 for (int j = 0; j < allselect.size(); j++) {
		      WebElement opget2 = allselect.get(j);
		      String ddv2 =opget2.getText();
		      System.out.println(ddv2);
			}
			 WebElement first = s2.getFirstSelectedOption();
			  String ddv3 = first.getText();
			  System.out.println(ddv3);
		
	}

}
