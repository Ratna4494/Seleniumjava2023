import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "/Users/Administrator/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");//it  will wait till the complete page loads(wait mechanism is their)
		driver.navigate().to("https://www.makemytrip.com/");//if it load something it will move next set(Inbuilt wait mechanism is not their)
		driver.navigate().back();   //navigate back to chrome broswer
		Thread.sleep(2000);
		driver.navigate().forward(); //navigate again to rahulshettyacademy page
		driver.findElement(By.cssSelector("*[class=\"close\"]")).click();
	}

}
