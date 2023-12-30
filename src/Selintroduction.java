import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "/Users/Administrator/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");//Hoe to hit url in browser
		System.out.println(driver.getTitle());//get the tile of the  web
		System.out.println(driver.getCurrentUrl());//get the tile of the url to know whether is correct or not
		driver.close();//close the current window
		driver.quit();//close all the browser*/
		
		
		System.setProperty("webdriver.edge.driver", "/Users/Administrator/Documents/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/");//Hoe to hit url in browser
		System.out.println(driver.getTitle());//get the tile of the  web
		System.out.println(driver.getCurrentUrl());//get the tile of the url to know whether is correct or not
		driver.close();//close the current window
		driver.quit();//close all the browser

	}

}
