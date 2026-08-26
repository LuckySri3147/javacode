package selprgm;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragandDrop {

		        public static void main(String[] args) throws InterruptedException 
		        {
		                ChromeDriver driver=new ChromeDriver();        
		                driver.get("https://www.qa-practice.com/elements/dragndrop/images");
		                driver.manage().window().maximize();
		                Thread.sleep(5000);	
		               
		                WebElement drag= driver.findElement(By.xpath("(//div[@id='rect-droppable1'])"));        

			            WebElement drop= driver.findElement(By.xpath("(//div[@id='rect-droppable2'])"));

				               Actions a=new Actions(driver);
				            a.dragAndDrop(drag, drop).perform();
				            
			                Thread.sleep(5000);	
			                
				            a.dragAndDrop(drop, drag).perform();

		                
				          //  WebElement drag2= driver.findElement(By.xpath("(//div[@id='rect-droppable2'])"));

				         //   WebElement drop2= driver.findElement(By.xpath("(//div[@id='rect-droppable1'])"));        


					             //  Actions a2=new Actions(driver);
					          //  a2.dragAndDrop(drag2, drop2).perform();
		        }
		}


