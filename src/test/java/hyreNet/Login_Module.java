package hyreNet;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login_Module {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//turns off all annoying pop-ups.
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		prefs.put("profile.password_manager_leak_detection", false);

		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-infobars");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://app.hyrenet.in/");
		Thread.sleep(2000);
		
		ForgotPassword forgotpass=new ForgotPassword();
		forgotpass.Forgotpassword(driver);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		SignUp signup=new SignUp();
		signup.Signup(driver);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("hyrenet+bugathon@guvi.in");
		
		driver.findElement(By.id("password")).sendKeys("hyrenettest@123");
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		
	    DashboardPage dashboard=new DashboardPage();
	    dashboard.Dashboard(driver);
	    
	    Thread.sleep(2000);
	    
	    TemplateModule template=new TemplateModule();
	    template.Testmodule(driver);
	    Thread.sleep(2000);
	    
	    TestModule test=new TestModule();
	    test.Test(driver);
	    
	    driver.quit();
	    
		

	}

}
