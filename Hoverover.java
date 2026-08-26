package selprgm;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Hoverover {

		        public static void main(String[] args) throws InterruptedException 
		        {
		                ChromeDriver driver=new ChromeDriver();        
		                driver.get("https://Amazon.in");
		                driver.manage().window().maximize();
		                Thread.sleep(5000);	
		               
		                WebElement fresh= driver.findElement(By.xpath("(//span[text()='Fresh'])"));

			               Actions a=new Actions(driver);
			               a.moveToElement(fresh).perform();
			               
			                Thread.sleep(3000);	

		               
			            //    WebElement aa= driver.findElement(By.xpath("(//span[text()='Fresh'])"));
			            //    aa.click();

			                WebElement sign= driver.findElement(By.xpath("(//span[@class='nav-line-2 '])"));

				               Actions a1=new Actions(driver);
				               a1.moveToElement(sign).perform();
				               
				                Thread.sleep(3000);	
		               
		                
		        }
		}


