import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/Administrator/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		//(is.Selected() is used to Check whether checkbox is selected or not it will show true if selected or else its false "to print will go with system.out.println"
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        Thread.sleep(3000);
        //count the number of checkbox
        
        System.out.println(driver.findElements(By.cssSelector(" input[type='checkbox']")).size());
        
        

	}

}
