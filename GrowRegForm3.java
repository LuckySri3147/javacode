package selprgm;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GrowRegForm3 {

		        public static void main(String[] args) throws InterruptedException 
		        {
		                ChromeDriver driver=new ChromeDriver();        
		                driver.get("https://google.com");
		                driver.manage().window().maximize();
		                Thread.sleep(5000);	
		               
		               List<WebElement> e1= driver.findElements(By.tagName("a"));
		               
		            //    int cou=e1.size();
		              //  System.out.println(cou);
		               
		              WebElement e=e1.get(1);
		               String s=e.getText();
				               System.out.println(s);

		                   e.click();
		               
		             /*  for(int i=0; i<e1.size();i++)
		               {
		            	   WebElement q=e1.get(i);
		            	   String s=q.getText();
				               System.out.println(s);

		               }*/
		                
		        }
		}


