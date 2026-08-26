package selprgm;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class A1mgphar {

		        public static void main(String[] args) throws InterruptedException 
		        {
		                ChromeDriver a=new ChromeDriver();        
		                a.get("https://www.1mg.com//");
		                a.manage().window().maximize();
		                Thread.sleep(5000);	
		               
		               WebElement sear= a.findElement(By.id("search-medicine"));
		               Thread.sleep(5000);	
		               sear.sendKeys("cough"+Keys.ENTER);
		               Thread.sleep(5000);	

						List<WebElement> e1= a.findElements(By.className("VerticalProductTile__imageContainer__S2gBc"));
					    Thread.sleep(5000);	

					int cou=e1.size();
				    System.out.println(cou); 
					
				    /*for(int i=0; i<e1.size();i++)
				    {
				 	   WebElement q=e1.get(i);
				 	   String s=q.getText();
				            System.out.println(s);
				
				    }*/
		               
		               
		               
		                
		               
		             /* WebElement e=e1.get(1);
		               String s=e.getText();
				               System.out.println(s);

		                   e.click();
		               
		             for(int i=0; i<e1.size();i++)
		               {
		            	   WebElement q=e1.get(i);
		            	   String s=q.getText();
				               System.out.println(s);

		               }*/
		                
		        }
		}


