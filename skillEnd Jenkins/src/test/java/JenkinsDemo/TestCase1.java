package JenkinsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {
	
	
	 @Test
	public void test () throws InterruptedException {
		
		WebDriverManager .chromedriver().setup();
		ChromeOptions Opt=new ChromeOptions();
		Opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
	driver.manage().window().maximize();
	
	     String title =driver.getTitle();
	     System.out.println(title);
	     
	     WebElement id=driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
	     id.sendKeys("Docker official website");
	}

}
