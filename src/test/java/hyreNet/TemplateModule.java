package hyreNet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TemplateModule {

	public void Testmodule(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
       
		
		driver.findElement(By.id("link-template")).click();
		
		driver.findElement(By.xpath("//a[@class='custom-btn custom-btn--primary']")).click();
		
		driver.findElement(By.id("custom-test-plan-selectized")).click();
		
		Thread.sleep(2000);
        WebElement scrol = driver.findElement(By.id("step1-submit"));
        Thread.sleep(2000);
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scrol);
		Thread.sleep(2000);
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='option']"));
		for(WebElement element:elements) {
			if(element.getText().equals("Objective only")) {
				element.click();
				break;
			}
		}
		
		driver.findElement(By.id("custom-select-role-selectized")).click();
		
		
		
		Thread.sleep(2000);
		WebElement scrol1 = driver.findElement(By.id("step1-submit"));
        Thread.sleep(2000);
	
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView(true);", scrol1);
		Thread.sleep(2000);
		
		List<WebElement> drop2 = driver.findElements(By.xpath("//div[@class='option']"));
		for(WebElement drop:drop2) {
			if(drop.getText().equals("Front-end engineer")) {
				drop.click();
				break;
			}
		}
		
		driver.findElement(By.id("custom-test-name")).sendKeys("webdevelopment");
		
		driver.findElement(By.id("custom-obj-duration")).sendKeys("5");
		
		driver.findElement(By.id("step1-submit")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='add-from-library custom-btn custom-btn--secondary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("select-all")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("modal--heading--close")).click();
		Thread.sleep(2000);
		WebElement scrol2 = driver.findElement(By.xpath("//div[text()='Save & Submit']"));
	    Thread.sleep(2000);
			
			
			
	    JavascriptExecutor js2 = (JavascriptExecutor) driver;
	    js2.executeScript("arguments[0].scrollIntoView(true);", scrol2);
		Thread.sleep(5000);
		 
		driver.findElement(By.xpath("//a[@class='custom-btn custom-btn--primary save-and-submit']")).click();
		
		
		

	}

}
