package hyreNet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {

	public void Forgotpassword(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.findElement(By.className("text--link")).click();
		driver.findElement(By.id("email")).sendKeys("monikadevi2407@gmail.com");
		
		driver.findElement(By.id("forgotPasswordSubmit")).click();

	}

}
