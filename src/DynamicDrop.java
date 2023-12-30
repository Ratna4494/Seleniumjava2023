import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		////a[@value="AMD"]
		
		//
		System.setProperty("webdriver.chrome.driver", "/Users/Administrator/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@class=\"search_options_menucontentbg\"] //a[@value=\"AMD\"]")).click();
		Thread.sleep(2000);
		//if client doesnot want index in xpath then we have to go for parent child relation like 21 line
		//driver.findElement(By.xpath("(//a[@value=\"GOI\"])[2]")).click();
		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value=\"GOI\"]")).click();

	}

}
