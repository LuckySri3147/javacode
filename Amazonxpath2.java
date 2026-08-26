package selprgm;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Amazonxpath2 {

		        public static void main(String[] args) throws InterruptedException 
		        {
		                ChromeDriver driver=new ChromeDriver();        
		                driver.get("https://www.amazon.in//");
		                driver.manage().window().maximize();
		                
		                Thread.sleep(3000);	
		               		                
			          WebElement sear= driver.findElement(By.xpath("(//Select[@id='searchDropdownBox'])"));

		               Thread.sleep(3000);	
		               //sear.click();
		               Select s1=new Select(sear);
		              // s1.selectByIndex(1);
		              // s1.selectByVisibleText("Apps & Games");
		             s1.selectByValue("search-alias=mobile-apps");                
		        }
		}


