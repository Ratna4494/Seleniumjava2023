import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandleCalendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/Administrator/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@class=\"search_options_menucontentbg\"] //a[@value=\"AMD\"]")).click();
		Thread.sleep(2000);
		//if client doesnot want index in xpath then we have to go for parent child relation like 21 line
		//driver.findElement(By.xpath("(//a[@value=\"GOI\"])[2]")).click();
		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value=\"GOI\"]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		

		
		//Enabled or disabled
		//enabled it is returning true its faling in this condition
		/*System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());*/
		
		//for this replacement we will see how the" html attribute which is changing pull that attribute " is locking by disabling and enabling the box. 

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
				{
			      System.out.println("Its Eanbled");
			      Assert.assertTrue(true);
			
				}else
				{
					Assert.assertTrue(false);
				}



		
	}

}
