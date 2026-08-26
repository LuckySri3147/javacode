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


public class Grotechiframe {

    public static void main(String[] args) throws InterruptedException 
    {
            ChromeDriver driver=new ChromeDriver();        
            driver.get("https://grotechminds.com/");
            driver.manage().window().maximize();
    
            Thread.sleep(3000);
            WebElement chatbot=  driver.findElement(By.id("chat-bot-launcher-button"));
    
            chatbot.click();
            Thread.sleep(3000);
            WebElement iframe= driver.findElement(By.id("chat-bot-iframe"));

            
            driver.switchTo().frame(iframe);
            Thread.sleep(3000);

            WebElement name= driver.findElement(By.id("textInput"));
            name.sendKeys("Ramu"+Keys.ENTER);
            
    }
}