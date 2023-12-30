import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/Administrator/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("IND");
		Thread.sleep(3000);
		List<WebElement> options =driver.findElements(By.cssSelector("li[class=ui-menu-item] a"));
		//as return type is webelement
		for(WebElement o : options)
		{
			if(o.getText().equalsIgnoreCase("India"))
			{
				o.click();
				break;//if we have 10 countries and india is in 3rd place once we get that then by using break we can stop all other execution
				
			}
		}

	}

}
