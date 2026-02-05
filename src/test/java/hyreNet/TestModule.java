package hyreNet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestModule {

	public void Test(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		driver.findElement(By.id("link-test")).click();
		driver.findElement(By.id("test-search")).sendKeys("Automation");
		Thread.sleep(2000);
		List<WebElement> names = driver.findElements(By.xpath("//h5[@class='drive-title text-truncate pr-0']"));
		List<WebElement> questions = driver.findElements(By.xpath("//h5[@class='drive-title text-truncate pr-0']/ancestor::div[@class='card-body']/descendant::div[@class='d-flex flex-wrap align-items-center']"));
		List<WebElement> timedet = driver.findElements(By.xpath("//h5[@class='drive-title text-truncate pr-0']/ancestor::div[@class='card-body']/descendant::div[@class='test-tags']"));
		
		for(int i=0;i<names.size();i++) {
			WebElement name = names.get(i);
			System.out.println(name.getText());
			WebElement question = questions.get(i);
			System.out.println(question.getText());
			WebElement time = timedet.get(i);
			System.out.println(time.getText());
		}

	}

}
