import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class LocatorsDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//selenium manager will on and off as per the inkove browser if we are adding the path its will take that or else it will go with inbuild functionality
		String name= "Rahul";
        //System.setProperty("webdriver.chrome.driver", "/Users/Administrator/Documents/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit wait for all the step(it will work only when the something not exixt in the page and we are waiting that to soo off  
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulsettyacademy");
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);
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
        Thread.sleep(2000);
        System.out.print(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();


	}
	
}
