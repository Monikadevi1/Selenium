package hyreNet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	public void Signup(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		driver.findElement(By.xpath("//a[@class='custom-btn custom-btn--primary signin-btn']")).click();
		
		driver.findElement(By.id("workEmail")).sendKeys("hyrenet+bugathon@guvi.in");
		
		driver.findElement(By.id("agreeCheckbox")).click();
		
		driver.findElement(By.id("signupContinueBtn")).click();

	}

}
