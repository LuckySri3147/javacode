package selprgm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Amazon {

	public static void main(String[] args) throws InterruptedException 
    {
            ChromeDriver driver=new ChromeDriver();        
            driver.get("https://www.amazon.in");
            driver.manage().window().maximize();

            Thread.sleep(3000);
            WebElement searchTextBox= driver.findElement(By.id("twotabsearchtextbox"));
            searchTextBox.sendKeys("shoes");
            WebElement searchingProduct=  driver.findElement(By.id("nav-search-submit-button"));
            searchingProduct.click();
            
            Thread.sleep(3000);

            List<WebElement> allProduct=   driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
            for(int i=0;i<5;i++)
            {
                    allProduct.get(i).click();
                    
            }
            Thread.sleep(3000);

            Set<String> pcid=driver.getWindowHandles();
            Iterator<String> pc=    pcid.iterator();
                    String parentid=  pc.next();
                    String childid=   pc.next();
                    
                    List<String> k=new ArrayList<String>();
            
            driver.switchTo().window(childid);
            Thread.sleep(3000);

            driver.findElement(By.id("add-to-cart-button")).click();
                    
                    
    //        Customer Service
    }
}