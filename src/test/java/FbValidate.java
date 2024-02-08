import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbValidate {
	public static void main(String[] args) throws InterruptedException  {
		//System.setProperty("webdriver.edge.driver", "D:\\New folder\\Maven\\target\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		String url ="https://www.facebook.com/";
		driver.get(url);
		    // driver.navigate().to("https://www.facebook.com/"); 
		     driver.manage().window().maximize();
		     driver.navigate().back();
		       Thread.sleep(2000);
		    driver.navigate().forward();
		      Thread.sleep(2000);
			driver.navigate().refresh();
			   Thread.sleep(2000);
			driver.switchTo().newWindow(WindowType.TAB);
			
			String curenturl = driver.getCurrentUrl();
			System.out.println(curenturl);
			if(url.equals(curenturl)) {
            System.out.println("url is correct");
			}
			else{
				System.out.println("url is not correct");
				}
			        String title= driver.getTitle();
			        System.out.println(title);
			       String getsource = driver.getPageSource();
			       System.out.println(getsource);
			       // driver.close();
			        //driver.quit();
	}

}
