import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/Administrator/Documents/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit wait for all the step
		driver.findElement(By.id("inputUsername")).sendKeys("Ratna");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulsettyacademy");
		driver.findElement(By.className("submit")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rahul");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rahulsettyacademy@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("ratna44@gmail.com");//css with indexing
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9581268336");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.print(driver.findElement(By.cssSelector("form p" )).getText());
        driver.findElement(By.xpath(" //div[@class=\"forgot-pwd-btn-conainer\"]/button[1]")).click();
		Thread.sleep(2000);
         driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath(" //button[contains(@class,'submit')]")).click();
        
        
        

	}

}
