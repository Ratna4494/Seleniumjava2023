import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        System.setProperty("webdriver.chrome.driver", "/Users/Administrator/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/ap/register?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Drhf_sign_in&openid.assoc_handle=inflex");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("input[placeholder=\"First and last name\"]")).sendKeys("Kiran44");
		driver.findElement(By.xpath("//input[@placeholder=\"Mobile number\"]")).sendKeys("6265525483");
		driver.findElement(By.id("ap_email")).sendKeys("44kiran@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Ratna@4430");
		driver.findElement(By.xpath("//span/input")).click();

	}

}