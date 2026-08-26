package selprgm;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Rightclick {

		        public static void main(String[] args) throws InterruptedException 
		        {
		                ChromeDriver driver=new ChromeDriver();        
		                driver.get("https://google.in");
		                driver.manage().window().maximize();
		                Thread.sleep(5000);	
		               
		                WebElement e= driver.findElement(By.linkText("Gmail"));

			               Actions a=new Actions(driver);
			              a.contextClick(e).perform();
			               
			                Thread.sleep(3000);	

		              
		               
		                
		        }
		}


