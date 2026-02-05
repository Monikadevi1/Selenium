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

public class DashboardPage {

	public void Dashboard(WebDriver driver) throws Exception {
		// TODO Auto-generated method stub
		
		
		//header test detaits
		List<WebElement> headerdet = driver.findElements(By.xpath("//h4[@class='breadcrumb__title']/ancestor::div[@class='col']/descendant::div[@class='d-flex justify-content-between align-items-center']/following-sibling::div[@class='row list']"));
		for(WebElement header:headerdet) {
			System.out.println(header.getText());
		}
		
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.id("recentTestOuterContainer"));
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		List<WebElement> names = driver.findElements(By.xpath("//label[@class='recent-test__name']/ancestor::div[@class='recent-test recent-test--content']/descendant::label[@class='recent-test__name']"));
		
		List<WebElement> details = driver.findElements(By.xpath("//label[@class='recent-test__name']/ancestor::div[@class='recent-test recent-test--content']/descendant::div[@class='recent-test__stats']"));
		for(int i=0;i<names.size();i++) {
			WebElement name = names.get(i);
			WebElement detail = details.get(i);
			System.out.println(name.getText());
			System.out.println(detail.getText());
			
		}
		
		
		
		
		


	}

}
