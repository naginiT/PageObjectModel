package Repository;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class InspectElements extends OpenBrowser{

	
	static By user=By.name("txtUsername");
	static By pswd=By.name("txtPassword");
	static By Btn=By.name("Submit");
	static By PIM=By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b");
	static By mouse=By.linkText("PIM");
	static By button=By.id("welcome");
	static By logout=By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a");

	
	public static WebElement user() {
		
		return driver.findElement(user);
		
	}
	

	public static WebElement pswd() {
		
		return driver.findElement(pswd);
		
	}

	public static WebElement Btn() {    
		
 		return driver.findElement(Btn);
		
	}
	public static WebElement verifyTitle() {
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Title matched");
			
		}else
			System.out.println("Title not matched and Excepted title is"+driver.getTitle());
		System.out.println("Login completed Successfully");
		return null;
	}
	public static WebElement  pim() {
		 return driver.findElement(PIM);
		
		
	}
	/*public static WebElement Dropdown() throws Exception {
		WebElement element =driver.findElement(By.name("searchSystemUser[userType]"));
		Select value=new Select(element);
		value.selectByIndex(1);
		Thread.sleep(3000);
		WebElement elementt=driver.findElement(By.id("searchSystemUser_status"));
		Select drop=new Select(elementt);
		drop.selectByValue("Disabled");
	                                             
		driver.findElement(By.id("searchBtn")).click();
		System.out.println("Dopdown selected");
		return element;
                                               
	}*/
	public static WebElement button() {
		return driver.findElement(button);

	}
	public static WebElement logout() {
		
	return driver.findElement(logout);
	
	
}
	/*public static WebElement Excel() throws Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\cubic\\Desktop\\M_Sadanandam-20180327T112421Z-001\\Book1.xlsx");
		 XSSFWorkbook workbook= new XSSFWorkbook(fis);
		 XSSFSheet sheet= workbook.getSheetAt(0);
		 System.out.println(sheet.getSheetName());//To get sheet name
				System.out.println("sheet.getLastRowNum()  "+sheet.getLastRowNum()); // To get row count
				System.out.println("Before retrive row data  "+sheet.getRow(1).getCell(1));
				XSSFCell cell;
				//driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
				for(int i=1;i<=sheet.getLastRowNum();i++)
		{
					cell=sheet.getRow(i).getCell(0);
					Thread.sleep(3000);
					cell.setCellType(cell.CELL_TYPE_STRING);   
					String data0= cell.getStringCellValue();
					System.out.println("Test data from excel   "  +data0);
					driver.findElement(user).sendKeys(cell.getStringCellValue());
					Thread.sleep(3000);
					cell=sheet.getRow(i).getCell(1);
					Thread.sleep(3000);
					
					driver.findElement(pswd).sendKeys(cell.getStringCellValue());

	}
				return null;
	}*/
}
	
