package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	public static WebDriver driver;
public static void browser() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\cubic\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	// driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");

	                                        
}
public static void open() {                      
driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
}
public static  void close() { 
	driver.close();
}
}
