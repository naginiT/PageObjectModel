package Operations;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import Repository.InspectElements;
//import Repository.Test;

public class LoginOperations {

	WebDriver driver;
	
	//public static void perform() throws Exception {
		/*InspectElements.user().sendKeys("admin");
		InspectElements.pswd().sendKeys("admin");*/
		//Thread.sleep(2000);
		
	//	Repository.Actions.Excel();
		//InspectElements.Excel();
		public static void Excel1() throws Exception {
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
                   InspectElements.user().sendKeys(cell.getStringCellValue());
                             Thread.sleep(3000);
						cell=sheet.getRow(i).getCell(1);
						Thread.sleep(3000);
						
		                   InspectElements.pswd().sendKeys(cell.getStringCellValue());
		           		InspectElements.Btn().click();
                          Thread.sleep(4000); 
		
					//return null;
 
		InspectElements.verifyTitle();
		Thread.sleep(4000);
		InspectElements.pim();
		//Thread.sleep(4000);
		//InspectElements.Dropdown();
		//Thread.sleep(4000);
		//InspectElements.mouse();
		Thread.sleep(3000);

		InspectElements.button().click();
		Thread.sleep(3000);
		InspectElements.logout().click();
		Thread.sleep(3000);
		
		
	}
		}	
}
