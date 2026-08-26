package selprgm;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class GrowRegForm {

		        public static void main(String[] args) throws InterruptedException 
		        {
		        	ChromeOptions opt=new ChromeOptions();
		        	opt.addArguments("headless");    
		                ChromeDriver driver=new ChromeDriver(opt);        
		                driver.get("https://grotechminds.com/registeration-form/");
		                driver.manage().window().maximize();
		                Thread.sleep(5000);	
		               
		                WebElement e1= driver.findElement(By.id("firstName"));
		                e1.sendKeys("Pavani"+Keys.ENTER);
		                
		                WebElement e2= driver.findElement(By.id("lastName"));
		                e2.sendKeys("R"+Keys.ENTER);
		                
		                WebElement e3= driver.findElement(By.id("email"));
		                e3.sendKeys("pavani@gmail.com"+Keys.ENTER);
		                
		                WebElement e4= driver.findElement(By.id("phone"));
		                e4.sendKeys("9087654321"+Keys.ENTER);
		               
		                WebElement e5= driver.findElement(By.id("aadhaar"));
		                e5.sendKeys("098765432456"+Keys.ENTER);
		                
		                WebElement e6= driver.findElement(By.id("pan"));
		                e6.sendKeys("ASDER2314M"+Keys.ENTER);
		                
		        }
		}


