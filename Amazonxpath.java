package selprgm;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazonxpath {

		        public static void main(String[] args) throws InterruptedException 
		        {
		                ChromeDriver driver=new ChromeDriver();        
		                driver.get("https://www.amazon.in//");
		                driver.manage().window().maximize();
		                Thread.sleep(3000);	
		               
		              //WebElement sear= driver.findElement(By.xpath("(//input[@role='searchbox'])"));
		                
			          WebElement sear= driver.findElement(By.xpath("(//span[='searchbox'])"));

		               Thread.sleep(3000);	
		               sear.click();
		               
		               // sear.sendKeys("phones"+Keys.ENTER);
		                
		        }
		}


